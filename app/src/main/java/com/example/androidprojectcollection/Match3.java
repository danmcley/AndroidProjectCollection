package com.example.androidprojectcollection;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Match3 extends AppCompatActivity {
    Button btn1, btn2, btn3,btn4,btn5, btn6,btn7,btn8, btn9, btn10, btn11, btn12, btn13,btn14,btn15, btn16,btn17,btn18, btn19, btn20, btn21, btn22, btn23,btn24,btn25;
    int[] color = {Color.RED, Color.BLUE, Color.YELLOW, Color.YELLOW};
    Random random;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.match3);
        btn1 = (Button) findViewById(R.id.btn1Match);
        btn2 = (Button) findViewById(R.id.btn2Match);
        btn3 = (Button) findViewById(R.id.btn3Match);
        btn4 = (Button) findViewById(R.id.btn4Match);
        btn5 = (Button) findViewById(R.id.btn5Match);
        btn6 = (Button) findViewById(R.id.btn6Match);
        btn7 = (Button) findViewById(R.id.btn7Match);
        btn8 = (Button) findViewById(R.id.btn8Match);
        btn9 = (Button) findViewById(R.id.btn9Match);
        btn10 = (Button) findViewById(R.id.btn10Match);
        btn11 = (Button) findViewById(R.id.btn11Match);
        btn12 = (Button) findViewById(R.id.btn12Match);
        btn13 = (Button) findViewById(R.id.btn13Match);
        btn14 = (Button) findViewById(R.id.btn14Match);
        btn15 = (Button) findViewById(R.id.btn15Match);
        btn16 = (Button) findViewById(R.id.btn16Match);
        btn17 = (Button) findViewById(R.id.btn17Match);
        btn18 = (Button) findViewById(R.id.btn18Match);
        btn19 = (Button) findViewById(R.id.btn19Match);
        btn20 = (Button) findViewById(R.id.btn20Match);
        btn21 = (Button) findViewById(R.id.btn21Match);
        btn22 = (Button) findViewById(R.id.btn22Match);
        btn23 = (Button) findViewById(R.id.btn23Match);
        btn24 = (Button) findViewById(R.id.btn24Match);
        btn25 = (Button) findViewById(R.id.btn25Match);

        btn1.setBackgroundColor(color[random.nextInt(4)]);
        btn2.setBackgroundColor(color[random.nextInt(4)]);
        btn3.setBackgroundColor(color[random.nextInt(4)]);
        btn4.setBackgroundColor(color[random.nextInt(4)]);
        btn5.setBackgroundColor(color[random.nextInt(4)]);
        btn6.setBackgroundColor(color[random.nextInt(4)]);
        btn7.setBackgroundColor(color[random.nextInt(4)]);
        btn8.setBackgroundColor(color[random.nextInt(4)]);
        btn9.setBackgroundColor(color[random.nextInt(4)]);
        btn10.setBackgroundColor(color[random.nextInt(4)]);
        btn11.setBackgroundColor(color[random.nextInt(4)]);
        btn12.setBackgroundColor(color[random.nextInt(4)]);
        btn13.setBackgroundColor(color[random.nextInt(4)]);
        btn14.setBackgroundColor(color[random.nextInt(4)]);
        btn15.setBackgroundColor(color[random.nextInt(4)]);
        btn16.setBackgroundColor(color[random.nextInt(4)]);
        btn17.setBackgroundColor(color[random.nextInt(4)]);
        btn18.setBackgroundColor(color[random.nextInt(4)]);
        btn19.setBackgroundColor(color[random.nextInt(4)]);
        btn20.setBackgroundColor(color[random.nextInt(4)]);
        btn21.setBackgroundColor(color[random.nextInt(4)]);
        btn22.setBackgroundColor(color[random.nextInt(4)]);
        btn23.setBackgroundColor(color[random.nextInt(4)]);
        btn24.setBackgroundColor(color[random.nextInt(4)]);
        btn25.setBackgroundColor(color[random.nextInt(4)]);
    }
}
