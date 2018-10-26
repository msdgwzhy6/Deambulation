package com.ym.quickrun.model.app;

import android.support.design.widget.BottomNavigationView;

import com.ym.quickrun.R;
import com.ym.quickrun.base.BaseFragment;

import butterknife.BindView;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/21
 * desc: 首页Fragment
 */
public class HomeFragment extends BaseFragment {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView navigation;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        initViewPager();
    }


    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_home;
    }

    private void initViewPager() {
    }


    @Override
    public void showError(String msg) {

    }
}
