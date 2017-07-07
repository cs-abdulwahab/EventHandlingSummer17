package com.example.abdul_wahab.eventhandlingsummer17;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developers.smartytoast.SmartyToast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnPress = (Button) findViewById(R.id.btnPress);

        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("key1","value1");
                intent.putExtra("key2","value2");


                startActivity(intent);
               // SmartyToast.makeText(getApplicationContext(),"Your message",SmartyToast.LENGTH_SHORT,SmartyToast.UPDATE);
            }
        });
        


    }
}
