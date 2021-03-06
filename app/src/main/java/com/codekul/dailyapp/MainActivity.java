package com.codekul.dailyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onPlane(View view) {
        ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.ic_airplane);
    }

    public void onBus(View view) {
        ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.ic_buses);
    }
}
