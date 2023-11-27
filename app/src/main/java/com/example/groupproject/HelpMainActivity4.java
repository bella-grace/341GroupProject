package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpMainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_main4);
        Intent intent3=getIntent();

        Button backbutton3 = (Button) findViewById(R.id.button_q1);
        backbutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent backintent3 = new Intent(HelpMainActivity4.this, HelpMainActivity.class);
                startActivity(backintent3);
            }
        });
    }
}