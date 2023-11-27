package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelpMainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_main5);
        Intent intent5=getIntent();

        Button backbutton5 = (Button) findViewById(R.id.UndoButton);
        backbutton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent backintent5 = new Intent(HelpMainActivity5.this, HelpMainActivity.class);
                startActivity(backintent5);
            }
        });


    }
}