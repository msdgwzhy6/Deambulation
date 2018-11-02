package com.ym.lightRunning.di.component;

import com.ym.lightRunning.di.module.ApiModule;
import com.ym.lightRunning.network.helper.RetrofitHelper;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/12
 * desc: ApiComponent
 */
@Singleton
@Component(modules = ApiModule.class)
public interface ApiComponent {

    RetrofitHelper getRetrofitHelper();
}
