package com.example.myfitnesspal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class contentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }
    public void naviagteToStepCounterActivity(View v)
    {
        Intent mIntent = new Intent(this, StepCounterActivity.class);
        startActivity(mIntent);
    }
    public void naviagteToStepHistoryActivity(View v)
    {
        Intent mIntent = new Intent(this, StepHistoryActivity.class);
        startActivity(mIntent);
    }
    public void naviagteToCustomAlgoActivity(View v)
    {
        Intent mIntent = new Intent(this, CustomAlgoActivity.class);
        startActivity(mIntent);
    }
}