package com.example.homework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setTheme(R.style.Theme_MaterialComponents_DayNight_NoActionBar);
        setContentView(R.layout.activity_main);
        ((RadioButton) findViewById(R.id.radioButtonMaterialHomework)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.radioButtonMaterialYellow)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.radioButtonMaterialGreen)).setOnClickListener(this);
        ((RadioButton) findViewById(R.id.radioButtonMaterialBlue)).setOnClickListener(this);

        intView();
        setListeners();

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        /*outState.putString("Division", Division);
        outState.putInt("_7",_7);
        outState.putInt("_8",_8);
        outState.putInt("_9",_9);
        outState.putString("Multiplication", Multiplication);
        outState.putInt("_4",_4);
        outState.putInt("_5",_5);
        outState.putInt("_6",_6);
        outState.putString("Minus", Minus);
        outState.putInt("_1",_1);
        outState.putInt("_2",_2);
        outState.putInt("_3",_3);
        outState.putString("Plus", Plus);
        outState.putInt("_0",_0);
        outState.putString("Dot",Dot);
        outState.putString("Equals", Equals);*/

        outState.putString("text_key", tvWindowBtn.getText().toString());

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        /*Division = savedInstanceState.getString("Division");
        tvWindowBtn.setText(String.format("%s", Division));

        _7 = savedInstanceState.getInt("_7");
        tvWindowBtn.setText(String.format("%s", _7));

        _8 = savedInstanceState.getInt("_8");
        tvWindowBtn.setText(String.format("%s", _8));

        _9 = savedInstanceState.getInt("_9");
        tvWindowBtn.setText(String.format("%s", _9));

        Multiplication = savedInstanceState.getString("Multiplication");
        tvWindowBtn.setText(String.format("%s", Multiplication));

        _4 = savedInstanceState.getInt("_4");
        tvWindowBtn.setText(String.format("%s", _4));

        _5 = savedInstanceState.getInt("_5");
        tvWindowBtn.setText(String.format("%s", _5));

        _6 = savedInstanceState.getInt("_6");
        tvWindowBtn.setText(String.format("%s", _6));

        Minus = savedInstanceState.getString("Minus");
        tvWindowBtn.setText(String.format("%s", Minus));

        _1 = savedInstanceState.getInt("_1");
        tvWindowBtn.setText(String.format("%s", _1));

        _2 = savedInstanceState.getInt("_2");
        tvWindowBtn.setText(String.format("%s", _2));

        _3 = savedInstanceState.getInt("_3");
        tvWindowBtn.setText(String.format("%s", _3));

        Plus = savedInstanceState.getString("Plus");
        tvWindowBtn.setText(String.format("%s", Plus));

        _0 = savedInstanceState.getInt("_0");
        tvWindowBtn.setText(String.format("%s", _0));

        Dot = savedInstanceState.getString("Dot");
        tvWindowBtn.setText(String.format("%s", Dot));

        Equals = savedInstanceState.getString("Equals");
        tvWindowBtn.setText(String.format("%s", Equals));*/

        String fullText = savedInstanceState.getString("text_key");
        tvWindowBtn.setText(String.format("%s", fullText));


    }



    private void setListeners() {
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("/");}
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("7");}
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("8");}
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("9");}
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("*");}
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("4");}
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("5");}
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("6");}
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("-");}
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("2");}
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("3");}
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("+");}
        });

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("0");}
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText(".");}
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {tvWindowBtn.setText("=");}
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

    }


    @Override
    public void onClick(View view) {
       /* switch (view.getId()){
            case R.id.radioButtonMaterialHomework:{
                MainActivity.
                break;
            }
            case R.id.radioButtonMaterialYellow:{
                setTheme(R.style.Theme_Yellow);
                break;
            }
            case R.id.radioButtonMaterialGreen:{
                setTheme(R.style.Theme_Green);
                break;
            }
            case R.id.radioButtonMaterialBlue:{
                setTheme(R.style.Theme_Blue);
                break;
            }

        }*/
    }
}