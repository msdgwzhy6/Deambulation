package com.ym.deambulation.model.app;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.ym.deambulation.R;
import com.ym.deambulation.base.BaseFragment;
import com.ym.deambulation.utils.StatusBarUtil;
import com.ym.deambulation.utils.StepUtils;
import com.ym.deambulation.view.CircleImageView;

import butterknife.BindView;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/21
 * desc: 首页Fragment
 */
public class HomeFragment extends BaseFragment implements SensorEventListener {

    @BindView(R.id.image)
    CircleImageView mImage;
    @BindView(R.id.toolbar)
    Toolbar mToolbar;
    @BindView(R.id.main_title)
    TextView mTitle;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_home;
    }

    @Override
    public void initData() {
        super.initData();
        //设置透明
        StatusBarUtil.setTransparentForImageView(mActivity, mToolbar);
        //绑定计步器
        StepUtils.init(getActivity(), this);
        mTitle.setText(R.string.main_toolbar_title_top);
    }

    @Override
    public void showError(String msg) {
    }


    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }

    @Override
    public void onPause() {
        super.onPause();
        StepUtils.unregisterSensor();
    }
}
