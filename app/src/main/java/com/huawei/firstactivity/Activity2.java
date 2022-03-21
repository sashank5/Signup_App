package com.huawei.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        int age = intent.getIntExtra("Age",0);
        String bio = intent.getStringExtra("Bio");
        int mobile = intent.getIntExtra("Mobile Number",0);
        String country = intent.getStringExtra("Country");

        TextView textview1 = findViewById(R.id.textView2);
        TextView textview2 = findViewById(R.id.textView4);
        TextView textview3 = findViewById(R.id.textView6);
        TextView textview4 = findViewById(R.id.textView9);
        TextView textview5 = findViewById(R.id.textView10);

        textview1.setText("Name: "+ name);
        textview2.setText("Age: "+ String.valueOf(age));
        textview3.setText("Bio: "+ bio);
        textview4.setText("Mobile Number: "+ String.valueOf(mobile));
        textview5.setText("Country :"+ country);
    }
}