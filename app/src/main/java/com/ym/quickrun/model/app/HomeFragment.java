package com.ym.quickrun.model.app;

import com.ym.quickrun.R;
import com.ym.quickrun.base.BaseFragment;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/21
 * desc: 首页Fragment
 */
public class HomeFragment extends BaseFragment {

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initWidget() {

    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_home;
    }

    @Override
    public void showError(String msg) {

    }
}
