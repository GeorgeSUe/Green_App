package com.example.green_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;


public class AfterThirdActivity extends AppCompatActivity {
    private ImageButton chatbot5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_third_activity);

        chatbot5 = (ImageButton) findViewById(R.id.chatbot5);
        chatbot5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChatbotActivity();
            }
        });


    }
    public void toastMsg (String msg){

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayToastMsg(View v) {
        toastMsg("You have to import more:" +
                "Toilet paper " + "+ Water " + "+ Can Food ");
    }

    private void openChatbotActivity() {
        Intent chattingbot = new Intent(this, ChatbotActivity.class);
        startActivity(chattingbot);
    }
}
