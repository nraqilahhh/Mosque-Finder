package com.example.mosquefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class UserLoginActivity extends AppCompatActivity {

    Button btnUsrLogin;
    TextView txt7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        btnUsrLogin = findViewById(R.id.btnUsrLogin);
        btnUsrLogin.setOnClickListener(view -> {
            Intent intent = new Intent(this, UserHomeActivity.class);
            startActivity(intent);
        });

        txt7 = findViewById(R.id.txt7);
        txt7.setOnClickListener(view -> {
            Intent intent = new Intent(this, UserRegisterActivity.class);
            startActivity(intent);
        });
    }
}