package com.example.a10119237latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
Developed by AriszaZufarFathurrahman
10119237
IF6
on Tuesday, April 26 2022
*/

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void btnRegister(View view){
        Intent intent = new Intent(this, AlmostActivity.class);
        startActivity(intent);
    }
}