package com.example.green_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {
    private Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button next = (Button) findViewById(R.id.buttonnext2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAfterthird();
            }
        });
    }

    private void openAfterthird() {
        Intent afterthirdactivity = new Intent (this,AfterThirdActivity.class);
        startActivity(afterthirdactivity);
    }
}
