package com.example.myfitnesspal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);

        EditText edWeg,edHei;
        TextView txtRes,txtInter;
        Button btnRes,btnReset;

        edWeg = (EditText) findViewById(R.id.edweg);
        edHei = (EditText) findViewById(R.id.edhei);

        txtInter = (TextView) findViewById(R.id.txtinter);
        txtRes = (TextView) findViewById(R.id.txtres);

        btnRes = (Button) findViewById(R.id.btnres);
        btnReset = (Button) findViewById(R.id.btnreset);

    }
    public float BMICalculate(float weight, float height)
    {
        return weight/(height * height);
    }
    public String interpretBMI(float bmiValue)
    {
        if(bmiValue < 16)
        {
            return "Severely Underweight";
        }
        else if(bmiValue < 18.5)
        {
            return "Underweight";
        }
        else if(bmiValue < 25)
        {
            return "Normal";
        }
        else if(bmiValue < 25)
        {
            return "Overweight";
        }
        else
        {
            return "Obese";
        }
    }
}