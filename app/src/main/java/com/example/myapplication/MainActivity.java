package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnChange);
        count = 0;
    }

    public void clicking(View view) {
        count++;
        btn.setText("This is click number: " + count);
        if(count%7 == 0)
        {
            btn.setText("BOOM!");
        }
    }
}