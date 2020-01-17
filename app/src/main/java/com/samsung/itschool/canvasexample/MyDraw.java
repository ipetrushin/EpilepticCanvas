package com.samsung.itschool.canvasexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.Random;

public class MyDraw extends View {
    int color = Color.YELLOW;

    public void changeColor() {
        Random r = new Random();
        color = Color.rgb(r.nextInt(255),r.nextInt(255),r.nextInt(255));
    }
    public MyDraw(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        changeColor();
        invalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(color);
    }
}
