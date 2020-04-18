package com.example.green_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;


public class AfterSecondActivity extends Activity {
    private Button seetrending;
    private ImageButton chatbot4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_second_activity);

        chatbot4 = (ImageButton) findViewById(R.id.chatbot4);
        chatbot4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openChatbotActivity();
            }
        });

        seetrending = (Button) findViewById(R.id.seetrending);
        seetrending.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentrending();
            }
        });
    }

    public void toastMsg (String msg){

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayToastMsg(View v){
        toastMsg("You have to import more:" +
                "Toilet paper " + "+ Water "+ "+ Can Food ");

    }
    private void openChatbotActivity() {
        Intent chattingbot = new Intent(this,ChatbotActivity.class);
        startActivity(chattingbot);
    }
    private void opentrending() {
        Intent keytrending = new Intent(this, FourActivity.class);
        startActivity(keytrending);
    }
}

