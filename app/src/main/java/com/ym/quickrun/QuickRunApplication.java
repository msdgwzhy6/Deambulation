package com.ym.quickrun;

import android.app.Application;

import com.ym.quickrun.di.component.ApiComponent;
import com.ym.quickrun.utils.AppUtils;
import com.ym.quickrun.utils.LogUtils;
import com.ym.quickrun.utils.NetworkUtils;

/**
 *  ┏┓   ┏┓
 * ┏┛┻━━━┛┻┓
 * ┃       ┃
 * ┃   ━   ┃
 * ┃ ┳┛ ┗┳ ┃
 * ┃       ┃
 * ┃   ┻   ┃
 * ┃       ┃
 * ┗━┓   ┏━┛
 *   ┃   ┃  神兽保佑
 *   ┃   ┃  永无BUG！
 *   ┃   ┗━━━┓
 *   ┃       ┣┓
 *   ┃       ┏┛
 *   ┗┓┓┏━┳┓┏┛
 *    ┃┫┫ ┃┫┫
 *    ┗┻┛ ┗┻┛
 *
 * @author: ym
 * date: 2018/9/10
 * desc: APP启动页面
 */
public class QuickRunApplication extends Application {
    private static QuickRunApplication mContext;
    private ApiComponent mApiComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        AppUtils.init(this);
        LogUtils.init(this);
        mContext = this;
        initNetwork();

    }

    /**
     * 网络实时监听
     */
    private void initNetwork() {
        NetworkUtils.startNetService(this);
    }
}
