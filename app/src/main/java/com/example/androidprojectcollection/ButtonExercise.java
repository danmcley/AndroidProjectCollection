package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonExercise extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        ConstraintLayout BG = findViewById(R.id.ButtonExercise);

         btn1 = (Button) findViewById(R.id.btnClose);
            btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(ButtonExercise.this, MainActivity.class);
                startActivity(intent1);
            }
        });
        btn2 = (Button) findViewById(R.id.btnToast);
            btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonExercise.this, "Hi", Toast.LENGTH_SHORT).show();
            }
        });
        btn3 = (Button) findViewById(R.id.btnChangeBG);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BG.setBackgroundResource(R.color.red);
            }
        });
        btn4 = (Button) findViewById(R.id.btnChangeBtnBG);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn4.setBackgroundColor(Color.RED);
                btn4.setTextColor(Color.BLUE);
            }
        });
        btn5 = (Button) findViewById(R.id.btnDisappear);
            btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn5.setVisibility(View.INVISIBLE);
            }
        });
    }
}