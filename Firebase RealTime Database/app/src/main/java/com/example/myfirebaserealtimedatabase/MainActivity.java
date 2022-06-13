package com.example.myfirebaserealtimedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText, ageEditText;
    private Button saveDataButton, loadDataButton;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseReference = FirebaseDatabase.getInstance().getReference("Students");

        nameEditText = findViewById(R.id.nameEditTextId);
        ageEditText = findViewById(R.id.ageEditTextId);
        saveDataButton = findViewById(R.id.saveButtonId);
        loadDataButton = findViewById(R.id.loadDataButtonId);

        loadDataButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,DetailsActivity.class);
                startActivity(intent);
            }
        });

        saveDataButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        saveData();

    }

    private void saveData() {

        String name = nameEditText.getText().toString().trim();
        String age = ageEditText.getText().toString().trim();

        String key = databaseReference.push().getKey();
        Student student = new Student(name,age);
        databaseReference.child(key).setValue(student);
        Toast.makeText(getApplicationContext(), "Student info is added", Toast.LENGTH_SHORT).show();

        nameEditText.setText("");
        ageEditText.setText("");


    }


}