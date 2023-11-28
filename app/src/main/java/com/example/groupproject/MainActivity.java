package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProductActivity1.class);
                startActivity(intent);
            }
        });
        ImageView imageView2 = findViewById(R.id.imageView6);
        imageView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProductActivity3.class);
                startActivity(intent);
            }
        });

        ImageView imageView3 = findViewById(R.id.imageView7);
        imageView3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProductActivity4.class);
                startActivity(intent);
            }
        });

        ImageView imageView4 = findViewById(R.id.imageView8);
        imageView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProductActivity2.class);
                startActivity(intent);
            }
        });
        ImageButton add = findViewById(R.id.add);
        ImageButton map = findViewById(R.id.map);
        ImageButton faq = findViewById(R.id.faq);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, MapActivity.class);
                startActivity(intent1);
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, HelpMainActivity.class);
                startActivity(intent1);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, SellActivity.class);
                startActivity(intent1);
            }
        });
        EditText mapSearch = findViewById(R.id.mapSearch);
        mapSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equalsIgnoreCase("Ca")) {
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
                if (s.toString().equalsIgnoreCase("Cu")) {
                    Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(intent);
                }
                if (s.toString().equalsIgnoreCase("G")) {
                    Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                    startActivity(intent);
                }
                if (s.toString().equalsIgnoreCase("P")) {
                    Intent intent = new Intent(MainActivity.this, MainActivity5.class);
                    startActivity(intent);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}