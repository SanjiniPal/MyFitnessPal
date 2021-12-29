package com.example.myfitnesspal;

import android.app.Activity;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class StepCounterActivity extends Activity implements SensorEventListener{
    private SensorManager mSensorManager;
    private Sensor mSensor;
    private Sensor isBooleanPresent;
    private TextView mStepsSinceReboot;

    @Overrideprotected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stepcounter_layout);

        mStepsSinceReboot = (TextView)findViewById(R.id.stepssincerebooot);
        mSensorManager = (Se)
    }
}
