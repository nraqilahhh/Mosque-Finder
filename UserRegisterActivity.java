package com.example.mosquefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class UserRegisterActivity extends AppCompatActivity {

    Button btnUsrRegister;
    TextView txt10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        btnUsrRegister = findViewById(R.id.btnUsrRegister);
        btnUsrRegister.setOnClickListener(view -> {
            Intent intent = new Intent(this, UserHomeActivity.class);
            startActivity(intent);
        });

        txt10 = findViewById(R.id.txt10);
        txt10.setOnClickListener(view -> {
            Intent intent = new Intent(this, UserLoginActivity.class);
            startActivity(intent);
        });

    }
}