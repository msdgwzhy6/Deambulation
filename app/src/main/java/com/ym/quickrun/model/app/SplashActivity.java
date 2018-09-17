package com.ym.quickrun.model.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Window;
import android.view.WindowManager;

import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;
import com.ym.quickrun.R;
import com.ym.quickrun.utils.StatusBarUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author: skyward
 * date: 2018/8/24
 * desc:
 */
public class SplashActivity extends RxAppCompatActivity {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 隐藏标题栏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 隐藏状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_start);
        //设置透明
        StatusBarUtil.setTransparent(this);
        ButterKnife.bind(this);
    }

    private void go2Main() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }

    @OnClick(R.id.ll_count_down)
    public void toMain() {
        go2Main();
    }
}
