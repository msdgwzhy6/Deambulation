package com.ym.deambulation.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import static android.content.Context.SENSOR_SERVICE;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/13
 * desc: 计步器统计
 */
public class StepUtils {
    private static Context mContext;
    private static SensorManager sensorManager;
    private static Sensor stepCounter;
    private static SensorEventListener stepCounterListener;


    public static void init(Context context, SensorEventListener listener) {
        mContext = context;
        stepCounterListener = listener;
        sensorManager = (SensorManager) mContext.getSystemService(SENSOR_SERVICE);
        //获取传感器系统服务
        assert sensorManager != null;
        stepCounter = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        registerSensor();
    }

    public static void registerSensor() {
        //注册传感器事件监听器
        if (mContext.getPackageManager().hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER)) {
            sensorManager.registerListener(stepCounterListener, stepCounter, SensorManager.SENSOR_DELAY_FASTEST);
        }
    }

    public static void unregisterSensor() {
        //解注册传感器事件监听器
        if (mContext.getPackageManager().hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER)) {
            sensorManager.unregisterListener(stepCounterListener);
        }
    }
}
