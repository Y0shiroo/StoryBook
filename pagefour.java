package com.example.story;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pagefour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagefour);
    }
    public void goTopagethree (View view) {
        startActivity(new Intent(this, pagethree.class));
        finish();
    }

    public void goTopagefive (View view) {
        Intent i = new Intent(this, pagefive.class);
        startActivity(i);
        finish();
    }
}
