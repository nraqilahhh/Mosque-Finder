package com.example.mosquefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class UserDatabaseActivity extends AppCompatActivity {
    EditText editTextName;
    Button buttonAdd;

    DatabaseReference databaseUser;

    List<User> userList;
    ListView listViewUsers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_database);
        databaseUser = FirebaseDatabase.getInstance().getReference("user");

        editTextName = (EditText) findViewById(R.id.editTextName);
        buttonAdd = (Button) findViewById(R.id.buttonAddUser);

        listViewUsers = (ListView) findViewById(R.id.ListViewUser);
        userList= new ArrayList<>();

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUser();
            }
        });
    }
    private void addUser(){
        String name = editTextName.getText().toString().trim();
        if(!TextUtils.isEmpty(name)){
            String id = databaseUser.push().getKey();
            User user =new User(id, name);
            databaseUser.child(id).setValue(user);
            Toast.makeText(this, "User added", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Please enter a user id", Toast.LENGTH_SHORT).show();
        }
    }
}