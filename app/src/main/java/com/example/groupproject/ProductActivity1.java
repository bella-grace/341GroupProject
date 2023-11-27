package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class ProductActivity1 extends AppCompatActivity {

    Button interestedBtn, toProfile;
    ImageButton toMainPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product1);

        interestedBtn = findViewById(R.id.msgBtn);
        toProfile = findViewById(R.id.toProfileBtn);
        toMainPage = findViewById(R.id.backMain);
        toProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toProfile = new Intent(ProductActivity1.this, ProductActivity2.class);
                startActivity(toProfile);
            }
        });

        toMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMain = new Intent(ProductActivity1.this, MainActivity.class);
                startActivity(toMain);
            }
        });
    }
}