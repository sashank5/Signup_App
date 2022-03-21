package com.huawei.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name,bio,country;
    int age,mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Signup(View view) {
        EditText editText1 = (EditText) findViewById(R.id.Nametext);
        String name = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.editTextNumber);
        int age = Integer.parseInt(editText2.getText().toString());

        EditText editText3 = (EditText) findViewById(R.id.editTextTextPersonName2);
        String bio = editText3.getText().toString();

        EditText editText4 = (EditText) findViewById(R.id.editTextPhone);
        int mobile = Integer.parseInt(editText4.getText().toString());

        EditText editText5 = (EditText) findViewById(R.id.editTextTextPersonName3);
        String country = editText5.getText().toString();


        Intent intent = new Intent(MainActivity.this,Activity2.class);

        intent.putExtra("Name",name);
        intent.putExtra("Age",age);
        intent.putExtra("Bio",bio);
        intent.putExtra("Mobile Number",mobile);
        intent.putExtra("Country",country);

        startActivity(intent);
    }
    public void Exit(View view){
        System.exit(0);
    }


}
