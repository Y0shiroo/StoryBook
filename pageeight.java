package com.example.story;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pageeight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageeight);
    }
    public void goTopageseven (View view) {
        startActivity(new Intent(this, pageseven.class));
        finish();
    }

    public void goTopagenine (View view) {
        Intent i = new Intent(this, pagenine.class);
        startActivity(i);
        finish();
    }
}
