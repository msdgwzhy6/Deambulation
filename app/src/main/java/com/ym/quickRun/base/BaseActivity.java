package com.ym.quickRun.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;

/**
 * @author ym
 * created at 2018/8/22 17:25
 * desc: Base基类
 */
public abstract class BaseActivity<T extends BaseContract.BasePresenter> extends RxAppCompatActivity implements BaseContract.BaseView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        initWidget();
        initData();
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
