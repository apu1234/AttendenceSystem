package com.example.apu.attendencesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BBA_Year extends AppCompatActivity {
    Button buttonfirst;
    Button buttonsecond;
    Button buttonthird;
    Button buttonfourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bba__year);

        buttonfirst = (Button) findViewById(R.id.bbayearbuttonfirstyear);
        buttonsecond = (Button) findViewById(R.id.bbayearbutton2secondyear);
        buttonthird = (Button) findViewById(R.id.bbayearbutton3thirdyear);
        buttonfourth = (Button) findViewById(R.id.bbayearbutton4fourthyear);

        buttonfirst.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(BBA_Year.this,
                        BBA_First_Year.class);
                startActivity(myIntent);
            }
        });
        buttonsecond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(BBA_Year.this,
                        BBA_Second_Year.class);
                startActivity(myIntent);
            }
        });
        buttonthird.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(BBA_Year.this,
                        BBA_Third_Year.class);
                startActivity(myIntent);
            }
        });
        buttonfourth.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(BBA_Year.this,
                        BBA_Fourth_Year.class);
                startActivity(myIntent);
            }
        });
    }
}
