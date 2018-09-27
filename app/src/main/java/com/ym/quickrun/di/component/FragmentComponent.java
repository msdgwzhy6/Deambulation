package com.ym.quickrun.di.component;

import android.app.Activity;

import com.ym.quickrun.di.module.FragmentModule;
import com.ym.quickrun.di.scope.FragmentScope;

import dagger.Component;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: FragmentComponent
 */
@FragmentScope
@Component(dependencies = ApiComponent.class,modules = FragmentModule.class)
public interface FragmentComponent {
    Activity getActivity();
}
