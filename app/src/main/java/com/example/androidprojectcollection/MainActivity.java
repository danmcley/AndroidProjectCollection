package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btnLayout);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, LayoutExercise.class);
                startActivity(intent1);
            }
        });
        btn2 = (Button) findViewById(R.id.btnButtonExercise);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, ButtonExercise.class);
                startActivity(intent2);
            }
        });
        btn3 = (Button) findViewById(R.id.btnCalcu);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(MainActivity.this, Match3.class);
                startActivity(intent3);
            }
        });
        btn4 = (Button) findViewById(R.id.btnToMatch3);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, CalculatorExercise.class);
                startActivity(intent4);
            }
        });
        btn4 = (Button) findViewById(R.id.btnToPassing);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(MainActivity.this, PassingIntentsExercise.class);
                startActivity(intent4);
            }
        });
    }
}