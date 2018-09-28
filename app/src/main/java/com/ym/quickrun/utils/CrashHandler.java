package com.ym.quickrun.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

import com.ym.quickrun.model.app.SplashActivity;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/28
 * desc: 全局异常捕获，当程序发生Uncaught异常时,由该类记录处理上传
 */
public class CrashHandler implements Thread.UncaughtExceptionHandler {

    /**
     * 系统默认的UncaughtExceptionHandler,用来捕获并处理在一个线程对象中抛出的未检测异常，以避免程序终止
     */
    private Thread.UncaughtExceptionHandler mExceptionHandler;
    private static volatile CrashHandler INSTANCE;
    private Context mContext;
    /**
     * 存储设备信息和异常信息
     */
    private Map<String, String> infos = new HashMap<>();


    private CrashHandler() {
    }

    /**
     * 获取CrashHandler单例
     */
    private static CrashHandler getInstance() {
        if (INSTANCE == null) {
            synchronized (CrashHandler.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CrashHandler();
                }
            }
        }
        return INSTANCE;
    }

    private void init(Context context) {
        mContext = context;
        //获取系统默认的UncaughtException处理器
        mExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        //设置该CrashHandler为程序的默认处理器
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /**
     * 当UncaughtException发生时转入该函数处理
     */
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        if (!handleException(e) && mExceptionHandler != null) {
            //如果用户没有处理则让系统默认的异常处理器来处理
            mExceptionHandler.uncaughtException(t, e);
        } else {
            //异常发生后的自定义操作
            Intent intent = new Intent(mContext, SplashActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            mContext.startActivity(intent);
        }
    }


    private boolean handleException(Throwable ex) {
        if (ex == null) {
            return false;
        }
        //收集设备参数信息
        collectDeviceInfo(mContext);
        //保存错误信息上传数据库
        uploadCrashInfo(ex);
        return true;
    }

    /**
     * 收集设备参数信息
     */
    private void collectDeviceInfo(Context context) {
        try {
            PackageManager pm = context.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), PackageManager.GET_ACTIVITIES);
            if (pi != null) {
                String versionName = pi.versionName == null ? "null" : pi.versionName;
                String versionCode = pi.versionCode + "";
                infos.put("versionName", versionName);
                infos.put("versionCode", versionCode);
            }
        } catch (PackageManager.NameNotFoundException e) {
            LogUtils.e("CrashHandleran.NameNotFoundException---> error occured when collect package info", e);
        }
        Field[] fields = Build.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                infos.put(field.getName(), field.get(null).toString());
            } catch (Exception ex) {
                LogUtils.e("CrashHandler.NameNotFoundException---> an error occured when collect crash info", ex);
            }
        }
    }


    private void uploadCrashInfo(Throwable throwable) {
        StringBuilder sb = new StringBuilder();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sb.append(format.format(new Date()) + "\n");
        sb.append("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<------START------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + "\n");
        for (Map.Entry<String, String> entry : infos.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key + "=" + value + "\n");
        }
        Writer writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        throwable.printStackTrace(printWriter);
        Throwable cause = throwable.getCause();
        while (cause != null) {
            cause.printStackTrace(printWriter);
            cause = cause.getCause();
        }
        printWriter.close();
        String result = writer.toString();
        sb.append(result);
        sb.append("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<------END------>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + "\n");
        LogUtils.e(result);

        //上传数据库
//        Retrofit retrofit = new Retrofit.Builder()
//                .client(OkHttpHelper.getInstance().getOkHttpClient())
//                .build();
//        HttpApi api = retrofit.create(HttpApi.class);
//        Call call = api.
    }


}
