package com.ym.quickrun.di.module;

import android.app.Activity;

import com.ym.quickrun.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: Activity模型
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityScope
    public Activity provideActivity() {
        return mActivity;
    }

}
