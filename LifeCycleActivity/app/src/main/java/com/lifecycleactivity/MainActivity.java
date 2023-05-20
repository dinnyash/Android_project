package com.lifecycleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Life Cycle", "ON create");
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void onStart() {
        Log.d("LifeCycle", "On Start");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("LifeCycle", "On Resume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d("LifeCycle", "On Pause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d("LifeCycle", "On Stop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d("LifeCycle", "On Destroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.d("LifeCycle", "On Restart");
        super.onRestart();
    }

}
