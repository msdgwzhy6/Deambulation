package com.ym.lightRunning.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/10/25
 * desc: 重写Viewpager解决点击tab去除滑动动画效果的问题
 */
public class NoScrollViewPager extends ViewPager {

    private boolean isSlide = false;

    public NoScrollViewPager(Context context) {
        super(context);
    }

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void scrollTo(int x, int y) {
        super.scrollTo(x, y);
    }

    @Override
    public void setCurrentItem(int item) {
        super.setCurrentItem(item, false);
    }

    @Override
    public void setCurrentItem(int item, boolean smoothScroll) {
        super.setCurrentItem(item, smoothScroll);
    }


    //禁止ViewPager左右滑动

    public void setSlide(boolean slide) {
        isSlide = slide;
    }

    @Override
    public boolean onInterceptHoverEvent(MotionEvent event) {
        return isSlide;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return isSlide;
    }
}
