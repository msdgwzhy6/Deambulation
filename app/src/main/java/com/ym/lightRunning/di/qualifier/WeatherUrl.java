package com.ym.lightRunning.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/10/7
 * desc: 天气注解
 */
@Qualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface WeatherUrl {
}
