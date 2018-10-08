package com.ym.quickrun.model.app;

import android.support.annotation.NonNull;
import android.support.design.internal.NavigationMenuView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.KeyEvent;
import android.view.MenuItem;

import com.ym.quickrun.R;
import com.ym.quickrun.base.BaseActivity;
import com.ym.quickrun.utils.AppUtils;
import com.ym.quickrun.utils.StatusBarUtil;
import com.ym.quickrun.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author ym
 * created at 2018/8/23 14:57
 * desc:
 */
public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {

//    @BindView(R.id.StepCounter)
//    TextView stepCounterText;
//    private SensorManager sensorManager;
//    private Sensor stepCounter;
//    //单次步伐传感器
//    private SensorEventListener stepCounterListener;

    long exitTime = 0L;
    @BindView(R.id.nav_view)
    NavigationView mNavigationView;
    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    private int mCurrentPos = -1;
    private List<Fragment> mFragments = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initWidget() {
//        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
//        //获取传感器系统服务
//        assert sensorManager != null;
//        stepCounter = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);

        goneScallbars(mNavigationView);
        mNavigationView.setNavigationItemSelectedListener(this);
        StatusBarUtil.setColorNoTranslucentForDrawerLayout(this, mDrawerLayout, AppUtils.getColor(R.color.colorPrimary));

    }


    @Override
    protected void initData() {
        //mFragments = Collections.singletonList(HomeFragment.newInstance());
        //初始化位置
        switchFragmentIndex(0);
//        stepCounterListener = new SensorEventListener() {
//            @Override
//            public void onSensorChanged(SensorEvent event) {
//                Log.e("Counter-SensorChanged", event.values[0] + "---" + event.accuracy + "---" + event.timestamp);
//                stepCounterText.setText(new StringBuilder("总步伐计数:" + event.values[0]));
//            }
//
//            @Override
//            public void onAccuracyChanged(Sensor sensor, int accuracy) {
//                Log.e("Counter-Accuracy", sensor.getName() + "---" + accuracy);
//
//            }
//        };
    }


//    private void registerSensor() {
//        //注册传感器事件监听器
//        if (getPackageManager().hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER)) {
//            sensorManager.registerListener(stepCounterListener, stepCounter, SensorManager.SENSOR_DELAY_FASTEST);
//        }
//    }
//
//    private void unregisterSensor() {
//        //解注册传感器事件监听器
//        if (getPackageManager().hasSystemFeature(PackageManager.FEATURE_SENSOR_STEP_COUNTER)) {
//            sensorManager.unregisterListener(stepCounterListener);
//        }
//    }

    private void switchFragmentIndex(int pos) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (mCurrentPos != -1) {
            transaction.hide(mFragments.get(mCurrentPos));
        }
        if (!mFragments.get(pos).isAdded()) {
            transaction.add(R.id.fl_content, mFragments.get(pos));
        }
        transaction.show(mFragments.get(pos)).commit();
        mCurrentPos = pos;

    }

    private void goneScallbars(NavigationView navigationView) {
        if (navigationView != null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) navigationView.getChildAt(0);
            if (navigationMenuView != null) {
                navigationMenuView.setVerticalScrollBarEnabled(false);
            }
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        AppUtils.runOnUIDelayed(() -> {
            int id = item.getItemId();
            switch (id) {
                case R.id.item_about:
                    break;
                case R.id.item_theme:
                    break;
                case R.id.item_setting:
                    break;
                default:
                    break;
            }
        }, 230);
        mDrawerLayout.closeDrawers();
        return false;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (mDrawerLayout.isDrawerOpen(mDrawerLayout.getChildAt(1))) {
                mDrawerLayout.closeDrawers();
            } else {
                if (System.currentTimeMillis() - exitTime > 2000) {
                    ToastUtils.showToast("再按一次退出");
                    exitTime = System.currentTimeMillis();
                } else {
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(0);
                }
            }
        }
        return false;
    }
}
