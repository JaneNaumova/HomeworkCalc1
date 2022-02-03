package com.example.homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnDivision;
    Button btn_7;
    Button btn_8;
    Button btn_9;
    Button btnMultiplication;
    Button btn_4;
    Button btn_5;
    Button btn_6;
    Button btnMinus;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    Button btnPlus;
    Button btn_0;
    Button btnDot;
    Button btnEquals;
    TextView tvWindow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intView();
        setListeners();

    }

    private void setListeners() {
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("/"));
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("7"));
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("8"));
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("9"));
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("*"));
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("4"));
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("5"));
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("6"));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("-"));
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("1"));
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("2"));
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("3"));
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("+"));
            }
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("0"));
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("."));
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvWindow.setText(String.format("="));
            }
        });

    }

    private void intView() {
        btnDivision = findViewById(R.id.btnDivision);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btnMultiplication = findViewById(R.id.btnMultiplication);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btnMinus = findViewById(R.id.btnMinus);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btnPlus = findViewById(R.id.btnPlus);
        btn_0 = findViewById(R.id.btn_0);
        btnDot = findViewById(R.id.btnDot);
        btnEquals = findViewById(R.id.btnEquals);
        tvWindow = findViewById(R.id.tvWindow);
    }
}