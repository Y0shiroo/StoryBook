package com.example.story;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class pagenine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagenine);
    }
    public void goTopageeight (View view) {
        startActivity(new Intent(this, pageeight.class));
        finish();
    }

    public void goToMainActivity (View view) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
    int j = 1;
    public void onBackPressed() {
        super.onBackPressed();
        if (j == 1) {
            j++;
            Toast.makeText(this, "Thanks for reading!", Toast.LENGTH_SHORT).show();
        } else {
            finish();
        }
    }
}
