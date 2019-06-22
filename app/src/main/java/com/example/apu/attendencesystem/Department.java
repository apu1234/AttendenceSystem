package com.example.apu.attendencesystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Department extends AppCompatActivity {
    Button buttoncse;
    Button buttoneee;
    Button buttoncivil;
    Button buttonbba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        buttoncse = (Button) findViewById(R.id.deptbuttoncse);
        buttoneee = (Button) findViewById(R.id.deptbutton2eee);
        buttoncivil = (Button) findViewById(R.id.deptbutton3civil);
        buttonbba = (Button) findViewById(R.id.deptbutton4bba);

        buttoncse.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Department.this,
                        CSE_Year.class);
                startActivity(myIntent);
            }
        });
        buttoneee.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Department.this,
                        EEE_Year.class);
                startActivity(myIntent);
            }
        });
        buttoncivil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Department.this,
                        Civil_Year.class);
                startActivity(myIntent);
            }
        });
        buttonbba.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(Department.this,
                        BBA_Year.class);
                startActivity(myIntent);
            }
        });
    }

}
