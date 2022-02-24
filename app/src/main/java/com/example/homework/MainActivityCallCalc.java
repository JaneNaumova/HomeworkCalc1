package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityCallCalc extends AppCompatActivity implements View.OnClickListener {

    Button call_calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_call_calc);

        call_calc = findViewById(R.id.call_calk);

        call_calc.setOnClickListener(this);


    }

            @Override
            public void onClick (View view){
                Intent intent = new Intent("CallCalc");
                startActivity(intent);
            }


}