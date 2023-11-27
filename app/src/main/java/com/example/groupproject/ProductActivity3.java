package com.example.groupproject;

<<<<<<< HEAD
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class ProductActivity3 extends AppCompatActivity {

    ImageButton toProduct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product3);

        toProduct = findViewById(R.id.backMain2);

        toProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toProduct = new Intent(ProductActivity3.this, ProductActivity1.class);
                startActivity(toProduct);
            }
        });


=======
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class ProductActivity3 extends AppCompatActivity {

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
                Intent toProfile = new Intent(ProductActivity3.this, ProductActivity2.class);
                startActivity(toProfile);
            }
        });

        toMainPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMain = new Intent(ProductActivity3.this, MainActivity.class);
                startActivity(toMain);
            }
        });
>>>>>>> 1fbfd1ab8d063a1581a03e603a9dfefcc664832a
    }
}