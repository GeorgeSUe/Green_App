package com.example.green_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button start;
    private ImageButton chatbot1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                openHomepageActivity();
            }
        });

        chatbot1 = (ImageButton) findViewById(R.id.chatbot1);
        chatbot1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChatbotActivity();
            }
        });


    }

    private void openHomepageActivity() {
        Intent intent = new Intent(this, HomepageActivity.class);
        startActivity(intent);
    }
    private void openChatbotActivity() {
        Intent chattingbot = new Intent(this,ChatbotActivity.class);
        startActivity(chattingbot);
    }


}


