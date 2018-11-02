package com.ym.lightRunning.base;

/**
 * @author: skyward
 * date: 2018/8/23
 * desc:
 */
public interface BaseContract {
    interface BaseView {

        /**
         * 请求出错
         */
        void showError(String msg);

    }

    interface BasePresenter<T>  {

        /**
         * 绑定
         *
         * @param view view
         */
        void attachView(T view);

        /**
         * 解绑
         */
        void detachView();
    }
}
