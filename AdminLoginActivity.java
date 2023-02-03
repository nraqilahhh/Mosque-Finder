package com.example.mosquefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AdminLoginActivity extends AppCompatActivity {

    Button btnAdmLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        btnAdmLogin = findViewById(R.id.btnAdmLogin);
        btnAdmLogin.setOnClickListener(view -> {
            Intent intent = new Intent(this, AdminHomeActivity.class);
            startActivity(intent);
        });

    }
}