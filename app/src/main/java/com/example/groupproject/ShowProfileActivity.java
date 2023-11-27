package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ShowProfileActivity extends AppCompatActivity {

    ImageButton toProductPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showprofile);

        toProductPage = findViewById(R.id.backMain3);

        toProductPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toProduct = new Intent(ShowProfileActivity.this, ProductActivity1.class);
                startActivity(toProduct);
            }
        });

    }
}