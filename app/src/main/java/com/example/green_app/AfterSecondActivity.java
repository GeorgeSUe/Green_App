package com.example.green_app;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class AfterSecondActivity extends Activity { ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_second_activity);
    }

    public void toastMsg (String msg){

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void displayToastMsg(View v){
        toastMsg("Hello how are you today");

    }
}

