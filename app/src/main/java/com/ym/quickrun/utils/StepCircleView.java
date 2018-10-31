package com.ym.quickrun.utils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
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
        mMinRadio = array.getInteger(R.styleable.StepCircleView_min_circle_radio, 400);

        mRingWidth = array.getInteger(R.styleable.StepCircleView_ring_width, 40);
        mSelect = array.getInteger(R.styleable.StepCircleView_select, 7);
        mSelectAngle = array.getInteger(R.styleable.StepCircleView_selec_angle, 3);

        mMinCircleColor = array.getColor(R.styleable.StepCircleView_circle_color, context.getResources().getColor(R.color.gray2));
        mMaxCircleColor = array.getColor(R.styleable.StepCircleView_circle_color, context.getResources().getColor(R.color.gray1));
        mRingNormalColor = array.getColor(R.styleable.StepCircleView_ring_normal_color, context.getResources().getColor(R.color.gray2));

        isShowSelect = array.getBoolean(R.styleable.StepCircleView_is_show_select, false);
        mSelectRing = array.getInt(R.styleable.StepCircleView_ring_color_select, 0);
        array.recycle();
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setAntiAlias(true);
        this.setWillNotDraw(false);
        color[0] = Color.parseColor("#8EE484");
        color[1] = Color.parseColor("#97C0EF");
        color[2] = Color.parseColor("#8EE484");
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        mViewWidth = getMeasuredWidth();
        mViewHeight = getMeasuredHeight();
        mViewCenterX = mViewWidth / 2;
        mViewCenterY = mViewHeight / 2;
        mRectF = new RectF(mViewCenterX - mMinRadio - mRingWidth / 2,
                mViewCenterY - mMinRadio - mRingWidth / 2,
                mViewCenterX + mMinRadio + mRingWidth / 2,
                mViewCenterY + mMinRadio + mRingWidth / 2);
        mRingAngleWidth = (360 - mSelect * mSelectAngle) / mSelect;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setColor(mMaxCircleColor);
        canvas.drawCircle(mViewCenterX, mViewCenterY, mMinRadio + mRingWidth + 20, mPaint);
        mPaint.setColor(mMinCircleColor);
        canvas.drawCircle(mViewCenterX, mViewCenterY, mMinRadio, mPaint);
        //画默认圆环
        drawNormalRing(canvas);
        //画彩色圆环
        drawColorRing(canvas);

    }

    private void drawNormalRing(Canvas canvas) {
        Paint ringNormalPaint = new Paint(mPaint);
        ringNormalPaint.setStyle(Paint.Style.STROKE);
        ringNormalPaint.setStrokeWidth(mRingWidth);
        ringNormalPaint.setColor(mRingNormalColor);
        canvas.drawArc(mRectF, 270, 360, false, ringNormalPaint);
        if (!isShowSelect) {
            return;
        }
        ringNormalPaint.setColor(mMaxCircleColor);
        for (int i = 0; i < mSelect; i++) {
            canvas.drawArc(mRectF, 270 + (i * mRingAngleWidth + (i) * mSelectAngle), mSelectAngle, false, ringNormalPaint);
        }

    }

    private void drawColorRing(Canvas canvas) {
        Paint ringColorPaint = new Paint(mPaint);
        ringColorPaint.setStyle(Paint.Style.STROKE);
        ringColorPaint.setStrokeWidth(mRingWidth);
        ringColorPaint.setShader(new SweepGradient(mViewCenterX, mViewCenterX, color, null));

        if (!isShowSelect) {
            canvas.drawArc(mRectF, 270, mSelectRing, false, ringColorPaint);
            return;
        }

        if (mSelect == mSelectRing && mSelectRing != 0) {
            canvas.drawArc(mRectF, 270, 360, false, ringColorPaint);
        } else {
            canvas.drawArc(mRectF, 270, mRingAngleWidth * mSelectRing + mSelectAngle * mSelectRing, false, ringColorPaint);
        }

        ringColorPaint.setShader(null);
        ringColorPaint.setColor(mMaxCircleColor);

        for (int i = 0; i < mSelectRing; i++) {
            canvas.drawArc(mRectF, 270 + (i * mRingAngleWidth * mSelectAngle), mSelectAngle, false, ringColorPaint);
        }
    }

    /**
     * 显示几段
     *
     * @param i
     */
    public void setSelect(int i) {
        this.mSelectRing = i;
        this.invalidate();
    }

    /**
     * 断的总数
     *
     * @param i
     */
    public void setSelectCount(int i) {
        this.mSelect = i;
    }


    /**
     * 是否显示断
     *
     * @param b
     */
    public void setShowSelect(boolean b) {
        this.isShowSelect = b;
    }


    public void setColor(int[] color) {
        this.color = color;
    }
}
