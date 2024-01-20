package com.example.story;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pagetwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagetwo);
    }
    public void goTopageone (View view) {
        startActivity(new Intent(this, pageone.class));
        finish();
    }

    public void goTopagethree (View view) {
        Intent i = new Intent(this, pagethree.class);
        startActivity(i);
        finish();
    }
}
