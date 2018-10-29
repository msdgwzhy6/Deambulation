package com.ym.quickrun.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.ym.quickrun.R;

/**
 * @author: ym  作者 E-mail: 15622113269@163.com
 * date: 2018/10/29
 * desc: 计步渐变圆环View
 */
public class StepCircleView extends View {

    private int mViewWidth;            //view的宽
    private int mViewHeight;           //view的高
    private int mViewCenterX;          //view宽的中心点
    private int mViewCenterY;          //view高的中心点
    private int mMinRadio;             //白色圆半径
    private float mRingWidth;          //圆环宽度
    private int mSelect;               //分成多少段
    private int mSelectAngle;          //每个圆环之间的间隔
    private int mMinCircleColor;       //最里面圆的颜色
    private int mMaxCircleColor;       //最外面圆的颜色
    private int mRingNormalColor;      //默认圆环的颜色
    private Paint mPaint;              //画笔
    private int color[] = new int[3];  //渐变颜色

    private float mRingAngleWidth;     //每一段的角度
    private RectF mRectF;              //圆环的矩形区域
    private int mSelectRing = 0;       //要显示几段彩色
    private boolean isShowSelect = false; //是否显示断层


    public StepCircleView(Context context) {
        this(context, null);
    }

    public StepCircleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public StepCircleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.StepCircleView);
        mMinRadio = array.getInteger(R.styleable.StepCircleView_min_circle_radio,400);

        mRingWidth = array.getInteger(R.styleable.StepCircleView_ring_width,40);
        mSelect = array.getInteger(R.styleable.StepCircleView_select, 7);
        mSelectAngle = array.getInteger(R.styleable.StepCircleView_selec_angle, 3);

        mMinCircleColor = array.getColor(R.styleable.StepCircleView_circle_color, context.getResources().getColor(R.color.white));
        mMaxCircleColor = array.getColor(R.styleable.StepCircleView_circle_color, context.getResources().getColor(R.color.gray1));
        mRingNormalColor = array.getColor(R.styleable.StepCircleView_ring_normal_color, context.getResources().getColor(R.color.gray2));

        isShowSelect = array.getBoolean(R.styleable.StepCircleView_is_show_select, false);
        mSelectRing = array.getInt(R.styleable.StepCircleView_ring_color_select, 0);
        array.recycle();
    }


}
