package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(getApplicationContext().toString(),"Onstart");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(getApplicationContext().toString(),"Onstop");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(getApplicationContext().toString(),"Ondestroy");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(getApplicationContext().toString(),"Onpause");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(getApplicationContext().toString(),"Onresume");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(getApplicationContext().toString(),"Onrestart");
    }

}
