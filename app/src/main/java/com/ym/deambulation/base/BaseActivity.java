package com.ym.deambulation.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import com.ym.deambulation.DeambulationApplication;
import com.ym.deambulation.R;
import com.ym.deambulation.di.component.ActivityComponent;
import com.ym.deambulation.di.component.DaggerActivityComponent;
import com.ym.deambulation.di.module.ActivityModule;
import com.ym.deambulation.utils.AppUtils;
import com.ym.deambulation.utils.StatusBarUtil;
import com.ym.deambulation.widget.ProgressWheel;

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

    protected boolean mBack = true;
    protected Toolbar mToolbar;
    protected ProgressWheel mLoading;
    protected SwipeRefreshLayout mRefreshLayout;
    protected RecyclerView mRecycler;
    public ConstraintLayout mError;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mContext = this;
        ButterKnife.bind(this);
        mToolbar = this.findViewById(R.id.toolbar);
        mLoading = this.findViewById(R.id.pw_loading);
        mRecycler = this.findViewById(R.id.recycler);
        mRefreshLayout = this.findViewById(R.id.refresh);
        mError = this.findViewById(R.id.em_error);

        initStatusBar();
        initInject();
        initPresenter();
        DeambulationApplication.getInstance().addActivity(this);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
            if (mBack) {
                mToolbar.setNavigationOnClickListener(v -> finish());
            }
        }
        initWidget();
        initData();
    }

    /**
     * 初始化Toolbar
     */
    protected void initToolbar() {
        if (mBack) {
            mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        }
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
                .apiComponent(DeambulationApplication.getInstance().getApiComponent())
                .activityModule(getActivityModule())
                .build();
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        DeambulationApplication.getInstance().removeActivity(this);
    }

    @Override
    public void showError(String msg) {

    }


    /**
     * 显示View
     *
     * @param views 视图
     */
    protected void visible(final View... views) {
        if (views != null && views.length > 0) {
            for (View view : views) {
                if (view != null) {
                    view.setVisibility(View.VISIBLE);
                }
            }
        }
    }

    /**
     * 隐藏View
     *
     * @param views 视图
     */
    protected void gone(final View... views) {
        if (views != null && views.length > 0) {
            for (View view : views) {
                if (view != null) {
                    view.setVisibility(View.GONE);
                }
            }
        }
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
