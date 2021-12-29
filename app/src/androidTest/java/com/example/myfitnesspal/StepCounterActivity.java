package com.example.myfitnesspal;

import android.app.Activity;
import android.hardware.Sensor;
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
        mSensorManager = (SensorManager) this.getSystemService(Content.SENSOR_SERVICE);
        if (mSensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)!= null)
        {
            mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
            isSensorPresent = true;
        }
        else
        {
            isSensorPresent = false;
        }
    }

    @Overrideprotected void onResume()
    {
        super.onResume();
        if(isSensorPresent)
        {
            mSensorManager.registerListener(this, mSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Overrideprotected void onPause()
    {
        super.onPause();
        if(isSensorPresent)
        {
            mSensorManager.unregisterListener(this);
        }
    }


}
