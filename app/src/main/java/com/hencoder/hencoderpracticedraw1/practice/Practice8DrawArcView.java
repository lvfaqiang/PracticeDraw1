package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drarc() 方法画弧形和扇形

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);

        RectF rectF = new RectF(300, 200, 800, 500);
        // 画一个连接圆心的 扇形
        canvas.drawArc(rectF, -120, 90, true, paint);

        // 画一个不连接圆心的 弧形
        canvas.drawArc(rectF, 30, 120, false, paint);

        //画一个圆弧
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF, -180, 45, false, paint);
    }
}
