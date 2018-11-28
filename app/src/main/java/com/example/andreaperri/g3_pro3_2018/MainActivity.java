package com.example.andreaperri.g3_pro3_2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import 	android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    Button btn_trombinoscope;
    Button btn_addPerson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_trombinoscope = (Button) findViewById(R.id.btn_trombinoscope);

        btn_trombinoscope.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bienvenue au Trombinoscope", LENGTH_LONG).show();
            }
        });


        btn_addPerson = (Button) findViewById(R.id.btn_addpersonredirect);
        btn_addPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bienvenue au Trombinoscope", LENGTH_LONG).show();
            }
        });


    }
}
