package com.ym.deambulation.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;

import static android.content.Context.SENSOR_SERVICE;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/13
 * desc: 计步器统计
 */
public class StepUtils implements SensorEventListener {
    private static Context mContext;
    private SensorManager sensorManager;
    private Sensor stepCounter;


    public void init(Context context) {
        mContext = context;
        sensorManager = (SensorManager) mContext.getSystemService(SENSOR_SERVICE);
        //获取传感器系统服务
        assert sensorManager != null;
        stepCounter = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        registerSensor();
    }

    public void registerSensor() {
        //注册传感器事件监听器
        if (mContext.getPackageManager().hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER)) {
            sensorManager.registerListener(this, stepCounter, SensorManager.SENSOR_DELAY_FASTEST);
        }
    }

    public void unregisterSensor() {
        //解注册传感器事件监听器
        if (mContext.getPackageManager().hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER)) {
            sensorManager.unregisterListener(this);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        Log.e("Counter-SensorChanged", event.values[0] + "---" + event.accuracy + "---" + event.timestamp);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        Log.e("Counter-Accuracy", sensor.getName() + "---" + accuracy);
    }
}
