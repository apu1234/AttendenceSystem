package com.example.apu.attendencesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EEE_Year extends AppCompatActivity {

    Button buttonfirst;
    Button buttonsecond;
    Button buttonthird;
    Button buttonfourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eee__year);
        buttonfirst = (Button) findViewById(R.id.eeeyearbuttonfirstyear);
        buttonsecond = (Button) findViewById(R.id.eeeyearbutton2secondyear);
        buttonthird = (Button) findViewById(R.id.eeeyearbutton3thirdyear);
        buttonfourth = (Button) findViewById(R.id.eeeyearbutton4fourthyear);

        buttonfirst.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(EEE_Year.this,
                        CSE_First_Year.class);
                startActivity(myIntent);
            }
        });
        buttonsecond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(EEE_Year.this,
                        CSE_Second_Year.class);
                startActivity(myIntent);
            }
        });
        buttonthird.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(EEE_Year.this,
                        CSE_Third_Year.class);
                startActivity(myIntent);
            }
        });
        buttonfourth.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(EEE_Year.this,
                        CSE_Fourth_Year.class);
                startActivity(myIntent);
            }
        });
    }
}
