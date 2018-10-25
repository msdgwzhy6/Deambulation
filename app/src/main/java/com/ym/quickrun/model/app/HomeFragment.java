package com.ym.quickrun.model.app;

import com.flyco.tablayout.SlidingTabLayout;
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

    @BindView(R.id.tab_layout)
    SlidingTabLayout mTabLayout;
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


    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_home;
    }

    private void initViewPager() {
        MainAdapter adapter = new MainAdapter(getChildFragmentManager());
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.setAdapter(adapter);
        mTabLayout.setViewPager(mViewPager);
        mViewPager.setCurrentItem(1);
    }


    @Override
    public void showError(String msg) {

    }
}
