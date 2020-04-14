package com.example.green_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        next = (Button) findViewById(R.id.buttonnext1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAftersecond();
            }
        });
    }
    private void openAftersecond() {
        Intent aftersecondactivity = new Intent (this,AfterSecondActivity.class);
        startActivity(aftersecondactivity);
    }
}
