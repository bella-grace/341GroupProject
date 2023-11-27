package com.example.groupproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class HelpMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_main);

        Intent backintent=getIntent();
        Intent backintent2=getIntent();
        Intent backintent3=getIntent();
        Intent backintent5=getIntent();
        Spinner spinner=findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.my_array,
                android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button button = (Button) findViewById(R.id.q1_button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(HelpMainActivity.this, HelpMainActivity2.class);
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.q2_button);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent2 = new Intent(HelpMainActivity.this, HelpMainActivity3.class);
                startActivity(intent2);
            }
        });

        Button button3 = (Button) findViewById(R.id.q3_button);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent3 = new Intent(HelpMainActivity.this, HelpMainActivity4.class);
                startActivity(intent3);
            }
        });

        Button button4 = (Button) findViewById(R.id.submit_button);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent4 = new Intent(HelpMainActivity.this, HelpMainActivity5.class);
                startActivity(intent4);
            }
        });


    }
}