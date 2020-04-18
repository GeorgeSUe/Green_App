package com.example.green_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HomepageActivity extends AppCompatActivity {
    private Button buttonbusiness,buttonconsumer,buttontrending;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        buttonbusiness = (Button) findViewById(R.id.button_business_first_layout);
        buttonbusiness.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openSecondActivity();

            }

        });
        buttonconsumer = (Button) findViewById(R.id.button_consumer_first_layout);
        buttonconsumer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openThirdActivity();

            }
        });
        buttontrending = (Button) findViewById(R.id.button_trending_keywords);
        buttontrending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentrending();
            }
        });



    }

    private void opentrending() {
        Intent keytrending = new Intent(this, FourActivity.class);
        startActivity(keytrending);
    }

    private void openThirdActivity() {
        Intent thirddActivity = new Intent(this, ThirdActivity.class);
        startActivity(thirddActivity);
    }

    private void openSecondActivity() {
        Intent secondActivity = new Intent(this, SecondActivity.class);
        startActivity(secondActivity);
    }



}
