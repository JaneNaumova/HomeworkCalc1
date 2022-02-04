package com.example.homework;

import static java.lang.String.format;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private String Division;
    private int _7;
    private int _8;
    private int _9;
    String Multiplication;
    private int _4;
    private int _5;
    private int _6;
    String Minus;
    private int _1;
    private int _2;
    private int _3;
    String Plus;
    private int _0;
    String Dot;
    String Equals;

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
    TextView tvWindowBtn;
    TextView tvWindowTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intView();
        setListeners();

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("Division", String.valueOf(Division));
        outState.putInt("_7",_7);
        outState.putInt("_8",_8);
        outState.putInt("_9",_9);
        outState.putString("Multiplication", String.valueOf(Multiplication));
        outState.putInt("_4",_4);
        outState.putInt("_5",_5);
        outState.putInt("_6",_6);
        outState.putString("Minus", String.valueOf(Minus));
        outState.putInt("_1",_1);
        outState.putInt("_2",_2);
        outState.putInt("_3",_3);
        outState.putString("Plus", String.valueOf(Plus));
        outState.putInt("_0",_0);
        outState.putString("Dot", String.valueOf(Dot));
        outState.putString("Equals", String.valueOf(Equals));

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Division = savedInstanceState.getString("Division");
        tvWindowTxt.setText(String.format("%s", tvWindowTxt));

        _7 = savedInstanceState.getInt("_7");
        tvWindowBtn.setText(String.format("%d", tvWindowBtn));

        _8 = savedInstanceState.getInt("_8");
        tvWindowBtn.setText(String.format("%d", tvWindowBtn));

        _9 = savedInstanceState.getInt("_9");
        tvWindowBtn.setText(String.format("%d", tvWindowBtn));

        Multiplication = savedInstanceState.getString("Multiplication");
        tvWindowTxt.setText(String.format("%s", tvWindowTxt));

        _4 = savedInstanceState.getInt("_4");
        tvWindowBtn.setText(String.format("%d", tvWindowBtn));

        _5 = savedInstanceState.getInt("_5");
        tvWindowBtn.setText(String.format("%d", tvWindowBtn));

        _6 = savedInstanceState.getInt("_6");
        tvWindowBtn.setText(String.format("%d", tvWindowBtn));

        Minus = savedInstanceState.getString("Minus");
        tvWindowTxt.setText(String.format("%s", tvWindowTxt));

        _1 = savedInstanceState.getInt("_1");
        tvWindowBtn.setText(String.format("%d", tvWindowBtn));

        _2 = savedInstanceState.getInt("_2");
        tvWindowBtn.setText(String.format("%d", tvWindowBtn));

        _3 = savedInstanceState.getInt("_3");
        tvWindowBtn.setText(String.format("%d", tvWindowBtn));

        Plus = savedInstanceState.getString("Plus");
        tvWindowTxt.setText(String.format("%s", tvWindowTxt));

        _0 = savedInstanceState.getInt("_0");
        tvWindowBtn.setText(String.format("%d", tvWindowBtn));

        Dot = savedInstanceState.getString("Dot");
        tvWindowTxt.setText(String.format("%s", tvWindowTxt));

        Equals = savedInstanceState.getString("Equals");
        tvWindowTxt.setText(String.format("%s", tvWindowTxt));

    }



    private void setListeners() {
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowTxt.setText(format("/"));}
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(format("7"));}
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(format("8"));}
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(format("9"));}
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowTxt.setText(format("*"));}
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(format("4"));}
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(format("5"));}
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(format("6"));}
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowTxt.setText(format("-"));}
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(format("1"));
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(format("2"));}
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(format("3"));}
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowTxt.setText(format("+"));}
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(format("0"));}
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowTxt.setText(format("."));}
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowTxt.setText(format("="));}
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
        tvWindowBtn = findViewById(R.id.tvWindowBtn);
        tvWindowTxt = findViewById(R.id.tvWindowTxt);
    }


}