package com.example.myfitnesspal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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

        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strweg = edWeg.getText().toString();
                String strhei = edHei.getText().toString();

                if(strweg=="")
                {
                    edWeg.setError("Please Enter Your Weight");
                    edWeg.requestFocus();
                    return;
                }
                if(strhei=="")
                {
                    edHei.setError("Please Enter Your Height");
                    edHei.requestFocus();
                    return;
                }

                float weight = Float.parseFloat(strweg);
                float height = Float.parseFloat(strhei);

                float bmiValue = BMICalculate(weight,height);

                txtInter.setText(interpretBMI(bmiValue));
                txtRes.setText("BMI= "+bmiValue);
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edHei.setText("");
                edWeg.setText("");
                txtInter.setText("");
                txtRes.setText("");

            }
        });

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