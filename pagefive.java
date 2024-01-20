package com.example.story;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pagefive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagefive);
    }
    public void goTopagefour (View view) {
        startActivity(new Intent(this, pagefour.class));
        finish();
    }

    public void goTopagesix (View view) {
        Intent i = new Intent(this, pagesix.class);
        startActivity(i);
        finish();
    }
}
