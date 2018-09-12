package com.ym.quickrun.di.component;

import android.app.Activity;

import com.ym.quickrun.di.module.ActivityModule;
import com.ym.quickrun.di.scope.ActivityScope;

import dagger.Component;

/**
 * @author: ym
 * date: 2018/9/10
 * desc:ActivityComponent
 */
@ActivityScope
@Component(dependencies = ApiComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity getActivity();
}
