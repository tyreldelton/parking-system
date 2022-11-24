package com.example.groupparkingassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editUser;
    EditText editPass;
    Button loginBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUser = findViewById(R.id.editUsername);
        editPass = findViewById(R.id.editPassword);
        loginBtn = findViewById(R.id.login);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editPass.getText().toString().equals("12345")) {
                    Intent myintent = new Intent(LoginActivity.this, MainActivity.class);
                    myintent.putExtra("username", editUser.getText().toString());
                    startActivity(myintent);
                } else {
                    Toast.makeText(LoginActivity.this, "Incorrect Password!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}