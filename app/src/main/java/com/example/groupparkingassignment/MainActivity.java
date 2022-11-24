package com.example.groupparkingassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String newUserText;
    TextView userText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newUserText = getIntent().getStringExtra("username");
        userText = findViewById(R.id.userName);
        userText.setText(newUserText);

        ParkingList[] myListData = new ParkingList[] {
                new ParkingList("1", "L2", "I&M Bank CBD"),
                new ParkingList("2", "A5", "KCA University CBD"),
                new ParkingList("3", "L7", "I&M Bank CBD"),
                new ParkingList("4", "D2", "I&M Bank CBD"),
                new ParkingList("5", "Y3", "Kencom CBD"),
                new ParkingList("6", "M4", "Agakhan Walk"),
                new ParkingList("7", "6B", "Java Cafe CBD"),
                new ParkingList("8", "U2", "Parliament Road"),
        };

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        ParkingAdapter adapter = new ParkingAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}