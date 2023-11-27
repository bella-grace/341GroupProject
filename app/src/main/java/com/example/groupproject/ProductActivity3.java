package com.example.groupproject;

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


    }
}