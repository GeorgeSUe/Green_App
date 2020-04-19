package com.example.green_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SecondActivity extends AppCompatActivity {
    private Button next;
    private ImageButton chatbot3;

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

        chatbot3 = (ImageButton) findViewById(R.id.chatbot3);
        chatbot3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChatbotActivity();
            }
        });
    }
    private void openChatbotActivity() {
        Intent chattingbot = new Intent(this,ChatbotActivity.class);
        startActivity(chattingbot);
    }

    private void openAftersecond() {
        Intent aftersecondactivity = new Intent (this,AfterSecondActivity.class);
        startActivity(aftersecondactivity);
    }
}
