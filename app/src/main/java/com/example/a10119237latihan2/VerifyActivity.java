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

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }

    public void btnSend(View view){
        Intent intent = new Intent(this, UserHomeActivity.class);
        startActivity(intent);
    }
}