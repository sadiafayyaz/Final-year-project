package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;

public class Add_Expenses_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__expenses__screen);
        setTitle(Html.fromHtml("<font color='#3477e3'>Add Expenses</font>"));}
        public void moveToNextActivity(View view){
            Intent intent;
            switch (view.getId()){
                case R.id.card1:{
                    intent = new Intent(Add_Expenses_Screen.this, Add_Expenses_Screen.class);
                    startActivity(intent);
                }break;
                case R.id.card2:{
                    intent = new Intent(Add_Expenses_Screen.this, Gallery_Screen.class);
                    startActivity(intent);
                }break;
                case R.id.card3:{
                    intent = new Intent(Add_Expenses_Screen.this, View_Expences_Screen.class);
                    startActivity(intent);
                }break;
                case R.id.card4:{
                    intent = new Intent(Add_Expenses_Screen.this, Compute_Screen.class);
                    startActivity(intent);
                }break;
                case R.id.card5:{
                    intent = new Intent(Add_Expenses_Screen.this, Add_Files_Screen.class);
                    startActivity(intent);
                }break;
                default:{
                    Log.d("error: ","Next Activity not Specified");
                }
            }


    }
}
