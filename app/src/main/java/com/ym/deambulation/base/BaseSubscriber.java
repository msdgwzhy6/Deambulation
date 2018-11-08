package com.ym.deambulation.base;

import android.text.TextUtils;

import com.ym.deambulation.network.exception.ApiException;
import com.ym.deambulation.utils.AppUtils;
import com.ym.deambulation.utils.LogUtils;
import com.ym.deambulation.utils.NetworkUtils;
import com.ym.deambulation.utils.ToastUtils;

import java.net.SocketTimeoutException;

import io.reactivex.subscribers.ResourceSubscriber;
import retrofit2.HttpException;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/11/8
 * desc: 基础订阅者BaseSubscriber
 */
public abstract class BaseSubscriber<T> extends ResourceSubscriber<T> {
    private BaseContract.BaseView mView;
    private String mMsg;

    public BaseSubscriber(BaseContract.BaseView view) {
        this.mView = view;
    }


    public abstract void onSuccess(T t);

    public void onFailure(int code, String message) {

    }

    @Override
    protected void onStart() {
        super.onStart();
        if (!NetworkUtils.isConnected(AppUtils.getAppContext())) {
            ToastUtils.showToast("当前网络状态异常");
            LogUtils.d("没有网络");
        }
    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onNext(T response) {
        if (mView == null) {
            return;
        }
        onSuccess(response);
    }


    @Override
    public void onError(Throwable e) {
        if (mView == null) {
            return;
        }
        if (mMsg != null && !TextUtils.isEmpty(mMsg)) {
            mView.showError(mMsg);
        } else if (e instanceof ApiException) {
            mView.showError(e.toString());
        } else if (e instanceof SocketTimeoutException) {
            mView.showError("服务器响应超时ヽ(≧Д≦)ノ");
        } else if (e instanceof HttpException) {
            mView.showError("数据加载失败ヽ(≧Д≦)ノ");
        } else {
            mView.showError("未知错误ヽ(≧Д≦)ノ");
            LogUtils.e("MYERROR:" + e.toString());
        }
    }
}
