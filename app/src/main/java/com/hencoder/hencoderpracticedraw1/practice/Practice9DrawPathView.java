package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;

public class Practice9DrawPathView extends View {

    public Practice9DrawPathView(Context context) {
        super(context);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice9DrawPathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPath() 方法画心形
        Path path = new Path();
        // 1，  先画出左边的一个扇形，
        path.addArc(400, 200, 600, 400, -225, 225);// 等同于 path.arcTo(x,x,x,x , true)

        // 2， 画出右边的扇形
        path.arcTo(600, 200, 800, 400, -180, 225, false); // forceMoveTo 是否隐藏痕迹

        // 3, 连接到底部的一个点
        path.lineTo(600, 580);

        Paint paint = new Paint();
        canvas.drawPath(path, paint);
    }
}
