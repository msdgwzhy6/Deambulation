package com.ym.deambulation.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trello.rxlifecycle2.components.support.RxFragment;
import com.ym.deambulation.DeambulationApplication;
import com.ym.deambulation.R;
import com.ym.deambulation.di.component.DaggerFragmentComponent;
import com.ym.deambulation.di.component.FragmentComponent;
import com.ym.deambulation.di.module.FragmentModule;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/21
 * desc: 基础Fragment
 */
public abstract class BaseFragment<T extends BaseContract.BasePresenter> extends RxFragment implements BaseContract.BaseView {

    @Inject
    protected T mPresenter;
    protected View mView;
    protected Activity mActivity;
    protected LayoutInflater mInflater;
    protected Context mContext;
    protected boolean isPrepared;
    protected boolean isVisible;
    private Unbinder mUnbinder;

    protected SwipeRefreshLayout mRefreshLayout;
    protected RecyclerView mRecycler;
    protected ConstraintLayout mError;


    @Override
    public void onAttach(Context context) {
        mActivity = (Activity) context;
        mContext = context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        if (mView != null) {
            ViewGroup parent = (ViewGroup) mView.getParent();
            if (parent != null) {
                parent.removeView(mView);
            }
        } else {
            mView = inflater.inflate(getLayoutId(), container, false);
            mActivity = getSupportActivity();
            mContext = mActivity;
            this.mInflater = inflater;
        }
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mUnbinder = ButterKnife.bind(this, view);
        mRecycler = mActivity.findViewById(R.id.recycler);
        mRefreshLayout = mActivity.findViewById(R.id.refresh);
        mError = mActivity.findViewById(R.id.em_error);
        initInject();
        initPresenter();
        initWidget();
        finishCreateView();
        initData();
    }

    protected void finishCreateView() {
        isPrepared = true;
        lazyLoad();
    }

    protected void lazyLoad() {
        if (!isPrepared || !isVisible) {
            return;
        }
        lazyLoadData();
        isPrepared = false;
    }

    protected void lazyLoadData() {
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (getUserVisibleHint()) {
            isVisible = true;
            onVisible();
        } else {
            onInVisible();
        }
    }

    protected void onInVisible() {

    }

    protected void onVisible() {
        lazyLoad();
    }

    /**
     * 数据加载
     */
    public void initData() {

    }

    /**
     * 控件初始化
     */
    public void initWidget() {

    }

    protected void initPresenter() {
        if (mPresenter != null) {
            mPresenter.attachView(this);
        }
    }

    /**
     * 注入dagger2依赖
     */
    protected void initInject() {

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detachView();
        }
        mUnbinder.unbind();
    }

    @Override
    public void onDetach() {
        this.mActivity = null;
        super.onDetach();
    }

    protected FragmentComponent getFragmentComponent() {
        return DaggerFragmentComponent.builder()
                .apiComponent(DeambulationApplication.getInstance().getApiComponent())
                .fragmentModule(new FragmentModule(this))
                .build();
    }

    protected FragmentModule getFragmentModule() {
        return new FragmentModule(this);
    }

    /**
     * 布局文件
     *
     * @return
     */
    public abstract @LayoutRes
    int getLayoutId();


    /**
     * 获取Acitivity实例
     *
     * @return
     */
    public FragmentActivity getSupportActivity() {
        return (FragmentActivity) super.getActivity();
    }

}
