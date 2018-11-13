package com.ym.deambulation.model.app;

import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;

import com.ym.deambulation.R;
import com.ym.deambulation.base.BaseActivity;
import com.ym.deambulation.utils.ToastUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * @author ym
 * created at 2018/8/23 14:57
 * desc:
 */
public class MainActivity extends BaseActivity {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView mNavigationView;

    long exitTime = 0L;
    private int mCurrentPos = -1;
    private List<Fragment> mFragments = new ArrayList<>();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


    @Override
    protected void initData() {
        // 首页
        mFragments.add(HomeFragment.newInstance());
        //初始化位置
        switchFragmentIndex(0);
    }

    private void switchFragmentIndex(int pos) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (mCurrentPos != -1) {
            transaction.hide(mFragments.get(mCurrentPos));
        }
        if (!mFragments.get(pos).isAdded()) {
            transaction.add(R.id.fl_content, mFragments.get(pos));
        }
        transaction.show(mFragments.get(pos)).commit();
        mCurrentPos = pos;

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (System.currentTimeMillis() - exitTime > 2000) {
                ToastUtils.showToast("再按一次退出");
                exitTime = System.currentTimeMillis();
            } else {
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(0);
            }
        }
        return false;
    }

}
