package com.example.myfitnesspal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class contentActivity extends AppCompatActivity {

    GridLayout mainGridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        mainGridLayout =(GridLayout) findViewById(R.id.mainGridLayout);

        setSingleEvent(mainGridLayout);
        
        
    }

    private void setSingleEvent(GridLayout mainGridLayout) {
        for(int i=0;i<mainGridLayout.getChildCount();i++)
        {
            CardView cardview =(CardView) mainGridLayout.getChildAt(i);
            final int finalI =i;
            cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(finalI==0)
                    {
                        Intent intent= new Intent(contentActivity.this,PedometerActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent= new Intent(contentActivity.this,BMIActivity.class);
                        startActivity(intent);
                    }
                    else if(finalI==2)
                    {
                        Intent intent= new Intent(contentActivity.this,NutritionActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }

}