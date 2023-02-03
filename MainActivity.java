package com.example.mosquefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAdmin, btnUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdmin= findViewById(R.id.btnAdmin);
        btnAdmin.setOnClickListener(view -> {
            Intent intent = new Intent(this, AdminLoginActivity.class);
            startActivity(intent);
        });

        btnUser = findViewById(R.id.btnUser);
        btnUser.setOnClickListener(view -> {
            Intent intent = new Intent(this, UserLoginActivity.class);
            startActivity(intent);
        });
    }
}