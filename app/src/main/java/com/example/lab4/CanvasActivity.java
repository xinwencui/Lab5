package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        int selectedColor = getIntent().getExtras().getInt("color");

        RelativeLayout layout = findViewById(R.id.canvas);
        layout.setBackgroundColor(selectedColor);
    }
}
