package com.example.story;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pageseven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageseven);
    }
    public void goTopagesix (View view) {
        startActivity(new Intent(this, pagesix.class));
        finish();
    }

    public void goTopageeight (View view) {
        Intent i = new Intent(this, pageeight.class);
        startActivity(i);
        finish();
    }
}
