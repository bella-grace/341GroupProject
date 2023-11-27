package com.example.groupproject;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView imageView2 = findViewById(R.id.imageView6);

        imageView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, ProductActivity2.class);
                startActivity(intent);
            }
        });

        EditText mapSearch = findViewById(R.id.mapSearch);
        mapSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().equalsIgnoreCase("")) {
                    Intent intent = new Intent(MainActivity3.this, MainActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });

    }


}