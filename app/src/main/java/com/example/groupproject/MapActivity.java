package com.example.groupproject;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Map;

public class MapActivity extends AppCompatActivity {

    ImageButton toCarrot, toPumpkin, toCucumber, toGrape;
    ImageButton toHome, toMap, toAdd, toFAQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        // footer
        toHome = findViewById(R.id.home);
        toMap = findViewById(R.id.map);
        toAdd = findViewById(R.id.add);
        toFAQ = findViewById(R.id.faq);

        toHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MapActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        toAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MapActivity.this, SellActivity.class);
                startActivity(intent1);
            }
        });
        toFAQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MapActivity.this, HelpMainActivity.class);
                startActivity(intent1);
            }
        });

        toCarrot = findViewById(R.id.toCarrot);
        toPumpkin = findViewById(R.id.toPumpkin);
        toCucumber = findViewById(R.id.toCucumber);
        toGrape = findViewById(R.id.toGrape);
        toCarrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showCarrot = new Intent(MapActivity.this, ProductActivity1.class);
                startActivity(showCarrot);
            }
        });
        toPumpkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showPumpkin = new Intent(MapActivity.this, ProductActivity2.class);
                startActivity(showPumpkin);
            }
        });
        toCucumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showCucumber = new Intent(MapActivity.this, ProductActivity3.class);
                startActivity(showCucumber);
            }
        });

        toGrape.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showGrape = new Intent(MapActivity.this, ProductActivity4.class);
                startActivity(showGrape);
            }
        });
    }


}