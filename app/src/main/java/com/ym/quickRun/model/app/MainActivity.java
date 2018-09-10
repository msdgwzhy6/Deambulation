package com.ym.quickRun.model.app;

import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Log;
import android.widget.TextView;

import com.ym.quickRun.R;
import com.ym.quickRun.base.BaseActivity;

import butterknife.BindView;

/**
 * @author ym
 * created at 2018/8/23 14:57
 * desc:
 */
public class MainActivity extends BaseActivity {

    @BindView(R.id.StepCounter)
    TextView stepCounterText;
    private SensorManager sensorManager;
    private Sensor stepCounter;
    //单次步伐传感器
    private SensorEventListener stepCounterListener;

    @Override
    public void onResume() {
        super.onResume();
        registerSensor();
    }

    @Override
    public void onPause() {
        super.onPause();
        unregisterSensor();
    }

    @Override
    protected void initWidget() {
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        //获取传感器系统服务
        assert sensorManager != null;
        stepCounter = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
    }

    @Override
    protected void initData() {
        stepCounterListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent event) {
                Log.e("Counter-SensorChanged", event.values[0] + "---" + event.accuracy + "---" + event.timestamp);
                stepCounterText.setText(new StringBuilder("总步伐计数:" + event.values[0]));
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int accuracy) {
                Log.e("Counter-Accuracy", sensor.getName() + "---" + accuracy);

            }
        };
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    private void registerSensor() {
        //注册传感器事件监听器
        if (getPackageManager().hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER)) {
            sensorManager.registerListener(stepCounterListener, stepCounter, SensorManager.SENSOR_DELAY_FASTEST);
        }
    }

    private void unregisterSensor() {
        //解注册传感器事件监听器
        if (getPackageManager().hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER)) {
            sensorManager.unregisterListener(stepCounterListener);
        }
    }

}
