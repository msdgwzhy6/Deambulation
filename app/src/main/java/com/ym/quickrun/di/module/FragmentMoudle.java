package com.ym.quickrun.di.module;


import android.app.Activity;
import android.support.v4.app.Fragment;

import com.ym.quickrun.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: Fragment模型
 */
@Module
public class FragmentMoudle {
    private Fragment mFragment;

    public FragmentMoudle(Fragment fragment) {
        this.mFragment = fragment;
    }

    @Provides
    @FragmentScope
    public Activity provideActivity() {
        return mFragment.getActivity();
    }

}
