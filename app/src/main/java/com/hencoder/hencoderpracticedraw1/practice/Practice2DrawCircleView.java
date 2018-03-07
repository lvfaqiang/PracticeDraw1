package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    Paint mPaint = new Paint();

    Path mPath = new Path();

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆

        // 1
        mPaint.setStyle(Paint.Style.FILL);

//        canvas.drawCircle(300, 100, 100, mPaint);
        mPath.addCircle(300, 100, 100, Path.Direction.CW);
        canvas.drawPath(mPath, mPaint);

        // 2
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(5);
        mPath.setFillType(Path.FillType.WINDING);
        mPaint.setColor(Color.BLACK);
//        canvas.drawCircle(600, 100, 100, mPaint);
        mPath.addCircle(600, 100, 100, Path.Direction.CW);
        canvas.drawPath(mPath, mPaint);

        mPath.reset();

        // 3
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLUE);
//        canvas.drawCircle(300, 400, 100, mPaint);
        mPath.addCircle(300, 400, 100, Path.Direction.CW);
        canvas.drawPath(mPath, mPaint);

        mPath.reset();

        // 4 (1)
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(20);
        mPaint.setColor(Color.BLACK);
//        canvas.drawCircle(600, 100, 100, mPaint);
        mPath.addCircle(600, 400, 100, Path.Direction.CW);
//        canvas.drawPath(mPath, mPaint);

        mPath.reset();

        // 4 (2)
        mPath.setFillType(Path.FillType.WINDING);
        mPath.addCircle(600 , 400 , 100 , Path.Direction.CW);
        mPath.addCircle(600 , 400 , 80 , Path.Direction.CW);
        canvas.drawPath(mPath, mPaint);
    }
}
