package com.ym.quickrun.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.ym.quickrun.R;
import com.ym.quickrun.utils.AppUtils;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/10/25
 * desc: 主页Tag
 */
public class MainAdapter extends FragmentPagerAdapter {
    private String[] mTitle;
    private Fragment[] mFragment;

    public MainAdapter(FragmentManager fm) {
        super(fm);
        mTitle = AppUtils.getStringArray(R.array.main_title);
        mFragment = new Fragment[mTitle.length];

    }

    @Override
    public Fragment getItem(int position) {
        if (mFragment[position] == null) {
            switch (position) {
                case 0:
                    //运动
                    //mFragment[position] = ;
                    break;
                case 1:
                    //发现
                    //mFragment[position] = ;
                    break;
                case 2:
                    //天气
                    //mFragment[position] = ;
                    break;
                default:
                    break;
            }
        }
        return mFragment[position];
    }

    @Override
    public int getCount() {
        return mTitle.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mTitle[position];
    }
}
