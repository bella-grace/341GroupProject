package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HelpMainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_main5);
        Intent intent5=getIntent();

        ImageButton add = findViewById(R.id.add);
        ImageButton map = findViewById(R.id.map);
        ImageButton home = findViewById(R.id.home);
        ImageButton help=findViewById(R.id.help);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(HelpMainActivity5.this, MapActivity.class);
                startActivity(intent1);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(HelpMainActivity5.this, HelpMainActivity.class);
                startActivity(intent1);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(HelpMainActivity5.this, HelpMainActivity.class);
                startActivity(intent1);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(HelpMainActivity5.this, SellActivity.class);
                startActivity(intent1);
            }
        });

        Button backbutton5 = (Button) findViewById(R.id.UndoButton);
        backbutton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent backintent5 = new Intent(HelpMainActivity5.this, HelpMainActivity.class);
                startActivity(backintent5);
            }
        });


    }
}