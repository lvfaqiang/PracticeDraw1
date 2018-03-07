package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint mPaint = new Paint();
    private int lineSpace = 20; // 每个柱子之间的间距
    private int width = 100; // 柱子宽度

    private String[] strings = {"I", "Item2", "iem3", "Itemd4", "Im5", "6", "Item7"};
    private int[] heights = {20, 100, 70, 200, 400, 50, 90};

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        Log.i("lfq", "width : " + getMeasuredWidth() + " , height : " + getMeasuredHeight());
        mPaint.setColor(Color.WHITE);
        mPaint.setStrokeWidth(2);
        // 先画出 x , y  轴
        canvas.drawLine(200, 100, 200, 500, mPaint);
        canvas.drawLine(200, 500, 900, 500, mPaint);


        int startX = 200 + lineSpace;
        for (int i = 0; i < strings.length; i++) {
            mPaint.setColor(Color.GREEN);
            mPaint.setStrokeWidth(width);
            canvas.drawRect(startX, 500 - heights[i], startX + width, 500, mPaint);

            mPaint.setStyle(Paint.Style.FILL);
            mPaint.setTextSize(36);
            mPaint.setStrokeWidth(1);
            canvas.drawText(strings[i], startX + (width - mPaint.measureText(strings[i])) / 2, 540, mPaint);

            startX += lineSpace + width;
        }

    }
}
