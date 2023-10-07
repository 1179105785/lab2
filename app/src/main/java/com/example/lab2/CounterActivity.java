package com.example.lab2;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CounterActivity extends AppCompatActivity {
    private int touchCount = 0;
    private static int a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        TextView v = findViewById(R.id.textview_3);
        Button add = (Button) findViewById(R.id.abtn_jump);
        Button reduce = (Button) findViewById(R.id.rbtn_jump);
        Button clear = (Button) findViewById(R.id.cbtn_jump);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                touchCount+=a;
                v.setText("The current number is: " + Integer.toString(touchCount));
            }
        });
       Button btc_jump = (Button) findViewById(R.id.abtn_jump);
       reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                touchCount-=a;
                v.setText("The current number is: " + Integer.toString(touchCount));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                touchCount=0;
                v.setText("The current number is: " + Integer.toString(touchCount));
            }
        });

    }
}
