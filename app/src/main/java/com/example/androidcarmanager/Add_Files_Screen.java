package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;

public class Add_Files_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__files__screen);
        setTitle(Html.fromHtml("<font color='#3477e3'>Add Notes</font>"));

    }
    public void addNotes(View v){
        Intent i = new Intent(Add_Files_Screen.this,Add_Notes_Screen.class);
        startActivity(i);
    }
    public void moveToNextActivity(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.card1: {
                intent = new Intent(Add_Files_Screen.this, Add_Notes_Screen.class);
                startActivity(intent);
            }
            break;
            case R.id.card2: {
                intent = new Intent(Add_Files_Screen.this, Add_Notes_Screen.class);
                startActivity(intent);
            }
            break;
            case R.id.card3: {
                intent = new Intent(Add_Files_Screen.this, Add_Notes_Screen.class);
                startActivity(intent);
            }
            break;

            default: {
                Log.d("error: ", "Next Activity not Specified");
            }
        }
    }
}
