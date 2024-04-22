package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorExercise extends AppCompatActivity {
    Button btn1, btn2, btn3,btn4,btn5, btn6,btn7,btn8, btn9,btn0, btnAdd, btnMinus, btnMultiply, btnDivide, btnDot, btnDelete, btnAC, btnEqual;
    double num1, num2;
    boolean bol1, bol2, lastOperation, decimal;
    TextView txtvw1, txtvw2;
    Calculator calc = new Calculator();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_exercise);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnAdd = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnAC = (Button) findViewById(R.id.btnAC);
        btnEqual = (Button) findViewById(R.id.btnEquals);
        txtvw2 = (TextView) findViewById(R.id.txtBox1);
        txtvw1 = (TextView) findViewById(R.id.txtBox2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw1.append("1");
                lastOperation = false;
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw1.append("2");
                lastOperation = false;
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw1.append("3");
                lastOperation = false;
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw1.append("4");
                lastOperation = false;
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw1.append("5");
                lastOperation = false;
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw1.append("6");
                lastOperation = false;
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw1.append("7");
                lastOperation = false;
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw1.append("8");
                lastOperation = false;
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw1.append("9");
                lastOperation = false;
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw1.append("0");
                lastOperation = false;
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick("+");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick("-");

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick("*");
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick("/");

            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonClick(".");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtvw1.setText("");
                txtvw2.setText("");
            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvw2.setText(String.valueOf((int)calc.evaluateExpression(String.valueOf(txtvw1.getText()))));
            }
        });
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtvw1.length() > 0) {
                    CharSequence currentText = txtvw1.getText();
                    txtvw1.setText(currentText.subSequence(0, currentText.length() - 1));
                    txtvw2.setText(currentText.subSequence(0, currentText.length() - 1));
                    if(decimal){
                        decimal = false;
                    }
                }
            }
        });
    }
    private void buttonClick(String operation) {
        if (lastOperation && txtvw1.length() > 0) {
            CharSequence currentText = txtvw1.getText();
            txtvw1.setText(txtvw1.getText().subSequence(0, txtvw1.length() - 1));
            txtvw1.append(operation);
            txtvw2.setText(txtvw1.getText().subSequence(0, txtvw1.length() - 1));
            txtvw2.append(operation);
            if(operation.equals(".")){
                decimal = true;
            }
        } else if (txtvw1.length() > 0) {
            txtvw1.append(operation);
            txtvw2.append(operation);
            if(operation.equals(".")){
                decimal = true;
            }
        }
        lastOperation = true;
    }
}