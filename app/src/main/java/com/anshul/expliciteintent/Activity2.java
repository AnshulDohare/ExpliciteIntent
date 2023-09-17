package com.anshul.expliciteintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tv = findViewById(R.id.tv2);
        String name = getIntent().getStringExtra("data");
        tv.setText(name + ", Wellcome to Activity2");
    }
}