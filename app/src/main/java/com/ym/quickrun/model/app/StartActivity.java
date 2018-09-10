package com.ym.quickrun.model.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;

import com.ym.quickrun.R;
import com.ym.quickrun.base.BaseActivity;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import io.reactivex.Observable;

/**
 * @author: skyward
 * date: 2018/8/24
 * desc:
 */
public class StartActivity extends BaseActivity {

    @BindView(R.id.text_name)
    TextView textName;
    @BindView(R.id.text_ads)
    TextView textAds;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_start;
    }

    @Override
    protected void initWidget() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    protected void initData() {
        ObjectAnimator alphaAnim = ObjectAnimator.ofFloat(textAds, "alpha", 0, 1f);
        ObjectAnimator desAnim = ObjectAnimator.ofFloat(textAds, "translationX", -500f, 0f);
        desAnim.setDuration(700);
        desAnim.setInterpolator(new DecelerateInterpolator());
        desAnim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                textName.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationStart(Animator animation) {
                textName.setVisibility(View.INVISIBLE);
            }
        });

        ObjectAnimator nameAnim = ObjectAnimator.ofFloat(textName,"translationY",-500f,0f);
        nameAnim.setDuration(2000);
        nameAnim.setInterpolator(new BounceInterpolator());
        nameAnim.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                Observable.timer(500, TimeUnit.MILLISECONDS).subscribe(aLong -> go2Main());
            }
        });

        AnimatorSet animSet = new AnimatorSet();
        animSet.play(alphaAnim).with(desAnim).before(nameAnim);
        animSet.start();
    }
    private void go2Main() {
        startActivity(new Intent(StartActivity.this,MainActivity.class));
        finish();
    }
}
