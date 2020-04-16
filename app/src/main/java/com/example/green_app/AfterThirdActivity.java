package com.example.green_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AfterThirdActivity extends AppCompatActivity {
    private Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_third_activity);

        map = (Button) findViewById(R.id.mapbutton);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmapsactivity();
            }
        });
    }

    private void openmapsactivity() {
        Intent mapsactivity = new Intent(this, MapsActivity.class);
        startActivity(mapsactivity);
    }

}
