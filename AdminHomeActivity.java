package com.example.mosquefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class AdminHomeActivity extends AppCompatActivity {

    Button btnManageUser,btnManageAdm, btnManageLocate;
    ImageButton ImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);

        btnManageLocate = findViewById(R.id.btnManageLocate);
        btnManageLocate.setOnClickListener(view -> {
            Intent intent = new Intent(this, LocationDatabaseActivity.class);
            startActivity(intent);
        });

        btnManageAdm = findViewById(R.id.btnManageAdm);
        btnManageAdm.setOnClickListener(view -> {
            Intent intent = new Intent(this, AdminDatabaseActivity.class);
            startActivity(intent);
        });

        btnManageUser = findViewById(R.id.btnManageUser);
        btnManageUser.setOnClickListener(view -> {
            Intent intent = new Intent(this, UserDatabaseActivity.class);
            startActivity(intent);
        });

        ImageButton = (ImageButton) findViewById(R.id.signout);

        ImageButton = findViewById(R.id.signout);
        ImageButton.setOnClickListener(view -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
