package com.example.androidprojectcollection;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MenuExercise extends AppCompatActivity {
    Button btnChanger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);
        btnChanger = findViewById(R.id.btnTransformingButton);
    }


    public boolean onCreateOptionMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.choice_menu, menu);

        return true;
    }

     public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == R.id.mItemChange)
        {
            Toast.makeText(this, "Edit Object is Clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.mItemReset) {
            Toast.makeText(this, "Reset Object is Clicked", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.mItemExit) {
            finish();
        }
        return true;
     }
}
