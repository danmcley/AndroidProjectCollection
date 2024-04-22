package com.example.androidprojectcollection;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PassingIntentsExercise2 extends AppCompatActivity {
    Button btnReturn;
    TextView eFName, eLName, eBDate,eNationality, ePNum, eEAdd, eReligion, eHAdd, ePName, ePRelation, ePPNum, eGender;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        eFName = findViewById(R.id.txtPI2Fname);
        eLName = findViewById(R.id.txtPI2Lname);
        eBDate = findViewById(R.id.txtPI2Date);
        eNationality = findViewById(R.id.txtPI2Nation);
        ePNum = findViewById(R.id.txtPI2PNum);
        eEAdd = findViewById(R.id.txtPI2EAdd);
        eReligion = findViewById(R.id.txtPI2Reli);
        eHAdd = findViewById(R.id.txtPI2HAdd);
        ePName = findViewById(R.id.txtPI2Name);
        ePRelation = findViewById(R.id.txtPI2Relationship);
        ePPNum = findViewById(R.id.txtPI2PPNum);
        eGender = findViewById(R.id.txtPI2Gender);

        Intent intent = getIntent();

        String fName = intent.getStringExtra("fName_key");
        String lName = intent.getStringExtra("lName_key");
        String gender = intent.getStringExtra("gender_key");
        String bDate = intent.getStringExtra("bDate_key");
        String nationality = intent.getStringExtra("nationality_key");
        String pNum = intent.getStringExtra("pNum_key");
        String eAdd = intent.getStringExtra("eAdd_key");
        String religion = intent.getStringExtra("religion_key");
        String hAdd = intent.getStringExtra("hAdd_key");
        String pName = intent.getStringExtra("pName_key");
        String pRelation = intent.getStringExtra("pRelation_key");
        String pPNum = intent.getStringExtra("pPNum_key");

        eFName.setText(fName);
        eLName.setText(lName);
        eBDate.setText(bDate);
        eNationality.setText(nationality);
        ePNum.setText(pNum);
        eEAdd.setText(eAdd);
        eReligion.setText(religion);
        eHAdd.setText(hAdd);
        ePName.setText(pName);
        ePRelation.setText(pRelation);
        ePPNum.setText(pPNum);
        eGender.setText(gender);

        btnReturn = findViewById(R.id.btnReturntoMain);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PassingIntentsExercise2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
