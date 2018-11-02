package com.ym.deambulation.di.module;


import android.app.Activity;
import android.support.v4.app.Fragment;

import com.ym.deambulation.di.scope.FragmentScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: Fragment模型
 */
@Module
public class FragmentModule {
    private Fragment mFragment;

    public FragmentModule(Fragment fragment) {
        this.mFragment = fragment;
    }

    @Provides
    @FragmentScope
    public Activity provideActivity() {
        return mFragment.getActivity();
    }

}
