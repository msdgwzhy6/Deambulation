package com.ym.quickrun.model.app;

import android.support.design.widget.BottomNavigationView;

import com.ym.quickrun.R;
import com.ym.quickrun.adapter.MainAdapter;
import com.ym.quickrun.base.BaseFragment;
import com.ym.quickrun.widget.NoScrollViewPager;

import butterknife.BindView;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/21
 * desc: 首页Fragment
 */
public class HomeFragment extends BaseFragment {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView navigation;
    @BindView(R.id.view_pager)
    NoScrollViewPager mViewPager;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public void initWidget() {
        super.initWidget();
        initViewPager();
    }

    private void initViewPager() {
        MainAdapter adapter = new MainAdapter(getChildFragmentManager());
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setSlide(true); //禁止滑动
        mViewPager.setAdapter(adapter);
        mViewPager.setCurrentItem(1);
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_home;
    }

    @Override
    public void showError(String msg) {

    }
}
