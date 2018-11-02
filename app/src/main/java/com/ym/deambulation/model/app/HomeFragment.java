package com.ym.deambulation.model.app;

import com.bumptech.glide.Glide;
import com.ym.deambulation.R;
import com.ym.deambulation.base.BaseFragment;
import com.ym.deambulation.view.CircleImageView;

import butterknife.BindView;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/9/21
 * desc: 首页Fragment
 */
public class HomeFragment extends BaseFragment {
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
    public void initData() {
        super.initData();
        Glide.with(this).load(R.drawable.img_slide_1).into(mImage);
    }

    @Override
    public void showError(String msg) {
    }

}
