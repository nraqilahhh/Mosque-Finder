package com.example.mosquefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class AdminDatabaseActivity extends AppCompatActivity {
    EditText editTextName;
    Button buttonAdd;

    DatabaseReference databaseAdmin;

    List<Admin> adminList;
    ListView listViewAdmins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_database);
        FirebaseApp.initializeApp(this);

        databaseAdmin = FirebaseDatabase.getInstance().getReference("admin");

        editTextName = (EditText) findViewById(R.id.editTextName);
        buttonAdd = (Button) findViewById(R.id.buttonAddAdmin);

        listViewAdmins = (ListView) findViewById(R.id.ListViewAdmin);
        adminList= new ArrayList<>();

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addAdmin();
            }
        });
    }
    private void addAdmin(){
        String name = editTextName.getText().toString().trim();
        if(!TextUtils.isEmpty(name)){
            String id = databaseAdmin.push().getKey();
            Admin admin =new Admin(id, name);
            databaseAdmin.child(id).setValue(admin);
            Toast.makeText(this, "Admin added", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Please enter a admin id", Toast.LENGTH_SHORT).show();
        }
    }
}