package com.example.groupproject;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class SellActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
     ImageButton home, map, add, faq, toLocations, toMap;
     Button addimage, post;
     int gallary_req_code = 1;
    TextView contactmethod;
    String message;
    boolean[] selectedLanguage;
    ArrayList<Integer> langList = new ArrayList<>();
    String[] selection = {"On App", "Personal Text", "Email", "Phone Call", "Meet in person"};
    ImageView imggallery;
    Spinner weight;
    EditText insertdate, price, insertweight, expirationdate, location;
    final Calendar myCalendar = Calendar.getInstance();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell);
        // insert date
        insertdate = findViewById(R.id.insertdate);
        // get values
        price = findViewById(R.id.insertprice);
        insertweight = findViewById(R.id.insertweight);
        expirationdate = findViewById(R.id.insertdate);
        location = findViewById(R.id.insertlocation);


        final Calendar c = Calendar.getInstance();
        int mYear = c.get(Calendar.YEAR);
        int mMonth = c.get(Calendar.MONTH);
        int mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog.OnDateSetListener datepicked = new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker view, int year, int month, int day) {
                myCalendar.set(Calendar.YEAR, year);
                myCalendar.set(Calendar.MONTH, month);
                myCalendar.set(Calendar.DAY_OF_MONTH, day);
                updateLabel();
            }
        };
        insertdate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                new DatePickerDialog(SellActivity.this,datepicked, myCalendar.get(Calendar.YEAR), myCalendar.get(Calendar.MONTH), myCalendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });
        // spinner
        weight = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.weight, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        weight.setAdapter(adapter);
        weight.setOnItemSelectedListener(this);

        // inserting an image
        addimage = findViewById(R.id.insertimage);
        imggallery = findViewById(R.id.image);
        addimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gallery = new Intent(Intent.ACTION_PICK);
                gallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(gallery,gallary_req_code);
            }
        });
        // to SellActivity2
        toMap = findViewById(R.id.mapp);
        toMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SellActivity.this, SellActivity2.class);
                startActivity(intent1);
            }
        });

        // post
        post = findViewById(R.id.post);
        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean proceed = false;
                String finalprice = price.getText().toString();
                String finalweight = insertweight.getText().toString();
                String finaldate = expirationdate.getText().toString();
                String finallocation = expirationdate.getText().toString();
                if (finalprice.equals("") || !finalprice.matches("\\d+(\\.\\d{1,2})?")) {
                    message = "Enter a valid price";
                } else if (finalweight.equals("")) {
                    message = "Enter a weight";

                } else if ((finaldate.equals("")) ) {
                    message = "Enter an expiration date";
                } else if (finalprice.equals("")) {
                    message = "Enter a location to meet";
                } else {
                    proceed = true;
                }
                if(!proceed) {
                    Toast toast1 = Toast.makeText(getBaseContext(), message, Toast.LENGTH_SHORT);
                    toast1.setGravity(Gravity.FILL_HORIZONTAL, 0, 0);
                    toast1.show();
                }
                if(proceed) {
                    Intent intent1 = new Intent(SellActivity.this, MainActivity.class);
                    startActivity(intent1);
                }
            }
        });
        // footer
        home = findViewById(R.id.home);
        map = findViewById(R.id.map);
        faq = findViewById(R.id.help);
        add = findViewById(R.id.add);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SellActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SellActivity.this, MapActivity.class);
                startActivity(intent1);
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SellActivity.this, HelpMainActivity.class);
                startActivity(intent1);
            }
        });

        // open new activity when click on image
        toLocations = findViewById(R.id.mapp);
        toLocations.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SellActivity.this, SellActivity2.class);
                startActivity(intent1);
            }
        });
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(SellActivity.this, HelpMainActivity.class);
                startActivity(intent1);
            }
        });

    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK) {
            if (requestCode == gallary_req_code) {
                imggallery.setImageURI(data.getData());
            }
        }
    }
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    private void updateLabel() {
        String myFormat="dd-MM-yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(myFormat, Locale.US);
        insertdate.setText(dateFormat.format(myCalendar.getTime()));
    }
}
