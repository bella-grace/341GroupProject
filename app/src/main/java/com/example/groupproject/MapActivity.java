package com.example.groupproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MapActivity extends AppCompatActivity {

    ImageButton toCarrot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        toCarrot = findViewById(R.id.toCarrot);
        toCarrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showCarrot = new Intent(MapActivity.this, ProductActivity1.class);
                startActivity(showCarrot);
            }
        });
    }


}