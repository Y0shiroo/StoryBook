package com.example.story;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pagethree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagethree);
    }
    public void goTopagetwo (View view) {
        startActivity(new Intent(this, pagetwo.class));
        finish();
    }

    public void goTopagefour (View view) {
        Intent i = new Intent(this, pagefour.class);
        startActivity(i);
        finish();
    }
}
