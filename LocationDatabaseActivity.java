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

public class LocationDatabaseActivity extends AppCompatActivity {

    EditText editTextName;
    Button buttonAdd;

    DatabaseReference databaseLocation;

    List<Location>locationList;
    ListView listViewLocations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_database);

        FirebaseApp.initializeApp(this);

        databaseLocation = FirebaseDatabase.getInstance().getReference("location");

        editTextName = (EditText) findViewById(R.id.editTextName);
        buttonAdd = (Button) findViewById(R.id.buttonAddLocation);

        listViewLocations = (ListView) findViewById(R.id.ListViewLocation);
        locationList= new ArrayList<>();

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addLocation();
            }
        });
    }
        private void addLocation(){
            String name = editTextName.getText().toString().trim();
            if(!TextUtils.isEmpty(name)){
                String id = databaseLocation.push().getKey();
                Location location =new Location(id, name);
                databaseLocation.child(id).setValue(location);
                Toast.makeText(this, "Location added", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, "Please enter a location", Toast.LENGTH_SHORT).show();
            }
        }
    }