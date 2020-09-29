package com.example.carl.cxopengl20demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.View;

import com.example.carl.cxopengl20demo.sample3.Sample3_1Activity;
import com.example.carl.cxopengl20demo.sample5_1.Sample5_1Activity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickedSample3_1(View view) {
        Intent i = new Intent(this, Sample3_1Activity.class);
        startActivity(i);
    }

    public void onClickedSample5_1(View view) {
        Intent i = new Intent(this, Sample5_1Activity.class);
        startActivity(i);
    }
}
