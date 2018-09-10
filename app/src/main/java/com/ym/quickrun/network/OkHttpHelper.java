package com.ym.quickrun.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/**
 * @author ym
 * created at 2018/8/23 9:31
 * desc: okhttp辅助类
 */
public class OkHttpHelper {
    //连接时长
    private static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 20 * 1000;
    //写入时长
    private static final int DEFAULT_WIRTE_TIMEOUT_MILLS = 20 * 1000;
    //读取时长
    private static final int DEFAULT_READ_TIMEOUOT_MILLS = 20 * 1000;

    private static volatile OkHttpHelper sInstance;

    private static OkHttpClient mOkHttpClient;


    private OkHttpHelper() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(DEFAULT_CONNECT_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS)
                .writeTimeout(DEFAULT_WIRTE_TIMEOUT_MILLS, TimeUnit.MILLISECONDS)
                .readTimeout(DEFAULT_READ_TIMEOUOT_MILLS, TimeUnit.MILLISECONDS)
                .retryOnConnectionFailure(true)
                .addInterceptor(httpLoggingInterceptor)
                .build();
    }

    public static OkHttpHelper getInstance() {
        if (sInstance == null) {
            synchronized (OkHttpHelper.class) {
                if (sInstance == null) {
                    sInstance = new OkHttpHelper();
                }
            }
        }
        return sInstance;
    }

    public OkHttpClient getOkHttpClient() {
        return mOkHttpClient;
    }
}
