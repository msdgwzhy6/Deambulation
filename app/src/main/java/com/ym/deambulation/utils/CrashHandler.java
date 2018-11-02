package com.ym.deambulation.utils;

import android.content.Context;
import android.content.Intent;

import com.ym.deambulation.model.app.SplashActivity;

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


    private CrashHandler() {
    }

    /**
     * 获取CrashHandler单例
     */
    public static CrashHandler getInstance() {
        if (INSTANCE == null) {
            synchronized (CrashHandler.class) {
                if (INSTANCE == null) {
                    INSTANCE = new CrashHandler();
                }
            }
        }
        return INSTANCE;
    }

    public void init(Context context) {
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
        //收集异常信息上传bugly
        return true;
    }


}
