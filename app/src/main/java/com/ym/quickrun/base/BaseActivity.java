package com.ym.quickrun.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import com.ym.quickrun.QuickRunApplication;
import com.ym.quickrun.R;
import com.ym.quickrun.di.component.ActivityComponent;
import com.ym.quickrun.di.component.DaggerActivityComponent;
import com.ym.quickrun.di.module.ActivityModule;
import com.ym.quickrun.utils.AppUtils;
import com.ym.quickrun.utils.StatusBarUtil;

import javax.inject.Inject;

import butterknife.ButterKnife;

/**
 * @author ym
 * created at 2018/8/22 17:25
 * desc: Base基类
 */
public abstract class BaseActivity<T extends BaseContract.BasePresenter> extends RxAppCompatActivity implements BaseContract.BaseView {

    @Inject
    protected T mPresenter;
    protected Context mContext;
    public ConstraintLayout mConstraintLayout;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext = this;
        ButterKnife.bind(this);
        initStatusBar();
        initInject();
        initPresenter();
        QuickRunApplication.getInstance().addActivity(this);
        initWidget();
        initData();
    }

    /**
     * 初始化Presenter
     */
    private void initPresenter() {
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    /**
     * 注入依赖
     */
    private void initInject() {
    }

    /**
     * 初始化StatusBar
     */
    private void initStatusBar() {
        StatusBarUtil.setColorNoTranslucent((Activity) mContext, AppUtils.getColor(R.color.colorPrimary));
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .apiComponent(QuickRunApplication.getInstance().getApiComponent())
                .activityModule(getActivityModule())
                .build();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        QuickRunApplication.getInstance().removeActivity(this);
    }

    @Override
    public void showError(String msg) {

    }

    /**
     * 布局文件
     *
     * @return 布局文件
     */
    protected abstract
    @LayoutRes
    int getLayoutId();

    /**
     * 初始化控件
     */
    protected void initWidget() {
    }


    /**
     * 初始化数据
     */
    protected void initData() {

    }
}
