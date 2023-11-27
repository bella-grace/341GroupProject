package com.example.groupproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {

    ImageButton toCarrot, toPumpkin, toCucumber, toGrape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

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