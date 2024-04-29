package com.example.androidprojectcollection;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
            btnChanger.setBackgroundColor(getResources().getColor(R.color.purple_500));
            btnChanger.setTextColor(Color.WHITE);
            btnChanger.setVisibility(View.VISIBLE);
            ViewGroup.LayoutParams params = btnChanger.getLayoutParams();
            params.width=500;
            params.height=550;
            btnChanger.setLayoutParams(params);
        } else if (item.getItemId() == R.id.mItemChangeBackground) {
            btnChanger.setBackgroundColor(getResources().getColor(R.color.red));
        } else if (item.getItemId() == R.id.mItemChangeTextColor) {
            btnChanger.setTextColor(Color.BLUE);
        } else if (item.getItemId() == R.id.mItemChangeVisibility) {
            btnChanger.setVisibility(View.INVISIBLE);
        } else if (item.getItemId() == R.id.mItemChangeSize) {
            ViewGroup.LayoutParams params = btnChanger.getLayoutParams();
            params.width+=50;
            params.height+=50;
            btnChanger.setLayoutParams(params);
        } else if (item.getItemId() == R.id.mItemChangeShape) {
            ViewGroup.LayoutParams params = btnChanger.getLayoutParams();
            params.width-=50;
            params.height-=50;
            btnChanger.setLayoutParams(params);;
        } else if (item.getItemId() == R.id.mItemExit) {
            finish();
        }
        return true;
     }

}
