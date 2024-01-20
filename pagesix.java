package com.example.story;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pagesix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagesix);
    }
    public void goTopagefive (View view) {
        startActivity(new Intent(this, pagefive.class));
        finish();
    }

    public void goTopageseven (View view) {
        Intent i = new Intent(this, pageseven.class);
        startActivity(i);
        finish();
    }
}
