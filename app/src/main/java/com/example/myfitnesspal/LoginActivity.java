package com.example.myfitnesspal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signin(View view) {
        Intent intent = new Intent(this,contentActivity.class);
        startActivity(intent);
    }

    public void signup(View view) {
        Intent intent = new Intent(this,signupActivity.class);
        startActivity(intent);
    }
    }
