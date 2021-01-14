package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

    }
    public void moveToNextActivity(View view){
        Intent intent;
        switch (view.getId()){
            case R.id.card1:{
                intent = new Intent(MainActivity.this, Add_Expenses_Screen.class);
                startActivity(intent);
            }break;
            case R.id.card2:{
                intent = new Intent(MainActivity.this, Gallery_Screen.class);
                startActivity(intent);
            }break;
            case R.id.card3:{
                intent = new Intent(MainActivity.this, View_Expences_Screen.class);
                startActivity(intent);
            }break;
            case R.id.card4:{
                intent = new Intent(MainActivity.this, Compute_Screen.class);
                startActivity(intent);
            }break;
            case R.id.card5:{
                intent = new Intent(MainActivity.this, Add_Files_Screen.class);
                startActivity(intent);
            }break;
            case R.id.card6:{
                intent = new Intent(MainActivity.this, Reminder_Screen.class);
                startActivity(intent);
            }break;
            default:{
                Log.d("error: ","Next Activity not Specified");
            }
        }
    }
}
