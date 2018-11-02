package com.ym.quickrun.model.app;

import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ym.quickrun.R;
import com.ym.quickrun.base.BaseFragment;
import com.ym.quickrun.view.CircleImageView;

import butterknife.BindView;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/21
 * desc: 首页Fragment
 */
public class HomeFragment extends BaseFragment {

    @BindView(R.id.toolbarTitle)
    TextView mToolbarTitle;
    @BindView(R.id.image)
    CircleImageView mImage;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main_home;
    }

    @Override
    public void showError(String msg) {
        mToolbarTitle.setText("广东省广州市");
        Glide.with(this).load(R.drawable.img_slide_1).into(mImage);
    }

}
