package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

public class Add_Files_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__files__screen);
        setTitle(Html.fromHtml("<font color='#3477e3'>Add Notes</font>"));

    }
}
