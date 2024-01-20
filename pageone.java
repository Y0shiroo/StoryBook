package com.example.story;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pageone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pageone);
    }

    public void goToMainActivity (View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    public void goTopagetwo (View view) {
        Intent i = new Intent(this, pagetwo.class);
        startActivity(i);
        finish();
    }
}
