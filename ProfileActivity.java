package com.example.mosquefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {


    Button btnprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnprofile = findViewById(R.id.btnprofile);
        btnprofile.setOnClickListener(v -> {
            Intent intent = new Intent(this, UserHomeActivity.class);
            startActivity(intent);
        });

    }
}