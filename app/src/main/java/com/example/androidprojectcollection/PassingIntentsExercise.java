package com.example.androidprojectcollection;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class PassingIntentsExercise extends AppCompatActivity {
    Button btnSubmit;
    EditText eFName, eLName, eBDate,eNationality, ePNum, eEAdd, eReligion, eHAdd, ePName, ePRelation, ePPNum;
    RadioButton rMale, rFemale, rOthers;
    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        eFName = findViewById(R.id.eFName);
        eLName = findViewById(R.id.eLName);
        eBDate = findViewById(R.id.eBDate);
        eNationality = findViewById(R.id.eNationality);
        ePNum = findViewById(R.id.ePNum);
        eEAdd = findViewById(R.id.eEAdd);
        eReligion = findViewById(R.id.eReligion);
        eHAdd = findViewById(R.id.eHAdd);
        ePName = findViewById(R.id.pName);
        ePRelation = findViewById(R.id.pRelation);
        ePPNum = findViewById(R.id.pPNum);

        rMale = findViewById(R.id.rMale);
        rFemale = findViewById(R.id.rFemale);
        rOthers = findViewById(R.id.rOthers);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fName = eFName.getText().toString();
                String lName = eLName.getText().toString();

                String gender;
                if(rMale.isChecked()) {
                    gender = "Male";
                } else if (rFemale.isChecked()) {
                    gender = "Female";
                } else if (rOthers.isChecked()) {
                    gender = "Others";
                } else {
                    gender = "Unknown";
                }

                String bDate = eBDate.getText().toString();
                String nationality = eNationality.getText().toString();
                String pNum = ePNum.getText().toString();
                String eAdd = eEAdd.getText().toString();
                String religion = eReligion.getText().toString();
                String hAdd = eHAdd.getText().toString();

                String pName = ePName.getText().toString();
                String pRelation = ePRelation.getText().toString();
                String pPNum = ePPNum.getText().toString();

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);
                intent.putExtra("fName_key", fName);
                intent.putExtra("lName_key", lName);
                intent.putExtra("gender_key", gender);
                intent.putExtra("bDate_key", bDate);
                intent.putExtra("nationality_key", nationality);
                intent.putExtra("pNum_key", pNum);
                intent.putExtra("eAdd_key", eAdd);
                intent.putExtra("religion_key", religion);
                intent.putExtra("hAdd_key", hAdd);
                intent.putExtra("pName_key", pName);
                intent.putExtra("pRelation_key", pRelation);
                intent.putExtra("pPNum_key", pPNum);

                startActivity(intent);
            }
        });
    }
}
