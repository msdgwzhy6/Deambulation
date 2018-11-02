package com.ym.deambulation.di.component;

import android.app.Activity;

import com.ym.deambulation.di.module.ActivityModule;
import com.ym.deambulation.di.scope.ActivityScope;

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
