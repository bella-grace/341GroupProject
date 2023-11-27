package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpMainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_main3);
       Intent intent2=getIntent();

        Button backbutton2 = (Button) findViewById(R.id.button_q1);
        backbutton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent backintent2 = new Intent(HelpMainActivity3.this, HelpMainActivity.class);
                startActivity(backintent2);
            }
        });
    }
}