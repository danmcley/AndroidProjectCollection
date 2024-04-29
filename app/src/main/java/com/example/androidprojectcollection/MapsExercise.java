package com.example.androidprojectcollection;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MapsExercise extends AppCompatActivity {
    Button singapore, boracay, siargao, eiffel, kinkakuju;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        singapore = (Button) findViewById(R.id.btnSingapore);
        boracay = (Button) findViewById(R.id.btnBoracay);
        siargao = (Button) findViewById(R.id.btnSiargao);
        eiffel = (Button) findViewById(R.id.btnEiffelTower);
        kinkakuju = (Button) findViewById(R.id.btnKinkakuji);

        singapore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:1.1.2840149227796385, 103.85961073143852"));
                startActivity(intent);
            }
        });
        boracay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:11.967351205206413, 121.92508306373976"));
                startActivity(intent);
            }
        });
        siargao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:9.846874194295292, 126.04828817488692"));
                startActivity(intent);
            }
        });
        eiffel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:48.858250072548365, 2.2943632803621026"));
                startActivity(intent);
            }
        });
        kinkakuju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:35.03930848255739, 135.7292913767513"));
                startActivity(intent);
            }
        });

    }
}
