package com.ym.deambulation.model.app;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.ym.deambulation.R;
import com.ym.deambulation.base.BaseActivity;
import com.ym.deambulation.utils.StatusBarUtil;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * @author: skyward
 * date: 2018/8/24
 * desc:
 */
public class SplashActivity extends BaseActivity {

    @BindView(R.id.iv_splash)
    ImageView mIvSplash;
    @BindView(R.id.ll_count_down)
    LinearLayout mLlCountDown;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_start;
    }

    @Override
    protected void initWidget() {
        super.initWidget();
        //设置透明
        StatusBarUtil.setTransparent(this);
    }


    private void go2Main() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }

    @OnClick(R.id.ll_count_down)
    public void toMain() {
        go2Main();
    }

    @OnClick(R.id.iv_splash)
    public void toSplash() {
    }

}
