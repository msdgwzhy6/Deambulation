package com.ym.quickrun.model.app;

import com.ym.quickrun.R;
import com.ym.quickrun.base.BaseFragment;
import com.ym.quickrun.utils.StepCircleView;

import butterknife.BindView;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/21
 * desc: 首页Fragment
 */
public class HomeFragment extends BaseFragment {

    @BindView(R.id.stepview)
    StepCircleView mStepCircleView;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void initData() {
        super.initData();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_home;
    }

    @Override
    public void showError(String msg) {

    }
}
