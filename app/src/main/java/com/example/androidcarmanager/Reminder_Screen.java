package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;

public class Reminder_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reminder__screen);
        setTitle(Html.fromHtml("<font color='#3477e3'>Reminders</font>"));
    }
}
