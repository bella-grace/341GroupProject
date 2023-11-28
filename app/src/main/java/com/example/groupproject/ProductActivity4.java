package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ProductActivity4 extends AppCompatActivity {
    ImageButton toMainPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product1);

        toMainPage = findViewById(R.id.backMain);
        ImageButton add = findViewById(R.id.add);
        ImageButton map = findViewById(R.id.map);
        ImageButton faq = findViewById(R.id.faq);
        ImageButton home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ProductActivity4.this, MainActivity.class);
                startActivity(intent1);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ProductActivity4.this, MapActivity.class);
                startActivity(intent1);
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ProductActivity4.this, HelpMainActivity.class);
                startActivity(intent1);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ProductActivity4.this, SellActivity.class);
                startActivity(intent1);
            }
        });
        toMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMain = new Intent(ProductActivity4.this, MainActivity.class);
                startActivity(toMain);
            }
        });
    }
}