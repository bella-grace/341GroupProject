package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpMainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_main2);
        Intent intent=getIntent();

        Button backbutton = (Button) findViewById(R.id.button_q1);
        backbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent backintent = new Intent(HelpMainActivity2.this, HelpMainActivity.class);
                startActivity(backintent);
            }
        });

    }
}