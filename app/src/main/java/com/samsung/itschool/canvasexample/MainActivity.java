package com.samsung.itschool.canvasexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MyDraw draw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        draw = findViewById(R.id.draw);
    }

    public void onClick(View v) {
        draw.changeColor();
        draw.invalidate();
    }
}
