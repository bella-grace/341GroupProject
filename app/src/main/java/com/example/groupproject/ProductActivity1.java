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

        ImageButton add = findViewById(R.id.add);
        ImageButton map = findViewById(R.id.map);
        ImageButton faq = findViewById(R.id.help);
        ImageButton home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProductActivity1.this, MainActivity.class);
                startActivity(intent1);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ProductActivity1.this, MapActivity.class);
                startActivity(intent1);
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ProductActivity1.this, HelpMainActivity.class);
                startActivity(intent1);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ProductActivity1.this, SellActivity.class);
                startActivity(intent1);
            }
        });
        interestedBtn = findViewById(R.id.msgBtn);
        toProfile = findViewById(R.id.toProfileBtn);
        toMainPage = findViewById(R.id.backMain);
        toProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toProfile = new Intent(ProductActivity1.this, ShowProfileActivity.class);
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

        interestedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMsg = new Intent(ProductActivity1.this, MessageActivity.class);
                startActivity(toMsg);
            }
        });
    }
}