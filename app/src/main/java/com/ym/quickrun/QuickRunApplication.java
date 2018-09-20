package com.ym.quickrun;

import android.app.Application;

import com.ym.quickrun.utils.AppUtils;

/**
 * @author: ym
 * date: 2018/9/10
 * desc:
 */
public class QuickRunApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppUtils.init(this);
    }
}
