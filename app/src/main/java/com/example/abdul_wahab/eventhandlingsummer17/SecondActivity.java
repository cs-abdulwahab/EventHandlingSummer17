package com.example.abdul_wahab.eventhandlingsummer17;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "MTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String s1 = intent.getStringExtra("key1");
        String s2 = intent.getStringExtra("key2");

        Log.d(TAG, "onCreate: " + s1 + s2);
    
    }
    
}
