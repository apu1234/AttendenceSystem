package com.example.apu.attendencesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Civil_Year extends AppCompatActivity {
    Button buttonfirst;
    Button buttonsecond;
    Button buttonthird;
    Button buttonfourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil__year);

        buttonfirst = (Button) findViewById(R.id.civilyearbuttonfirstyear);
        buttonsecond = (Button) findViewById(R.id.civilyearbutton2secondyear);
        buttonthird = (Button) findViewById(R.id.civilyearbutton3thirdyear);
        buttonfourth = (Button) findViewById(R.id.civilyearbutton4fourthyear);

        buttonfirst.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Civil_Year.this,
                        Civil_First_Year.class);
                startActivity(myIntent);
            }
        });
        buttonsecond.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Civil_Year.this,
                        Civil_Second_Year.class);
                startActivity(myIntent);
            }
        });
        buttonthird.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Civil_Year.this,
                        Civil_Third_Year.class);
                startActivity(myIntent);
            }
        });
        buttonfourth.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Civil_Year.this,
                        Civil_Fourth_Year.class);
                startActivity(myIntent);
            }
        });
    }
}
