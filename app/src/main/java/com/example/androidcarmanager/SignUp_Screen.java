package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class SignUp_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up__screen);
//        getSupportActionBar().hide();
        setTitle(Html.fromHtml("<font color='#3477e3'>Sign Up</font>"));


    }
    public void signUp(View v){ Log.i("Sign Up","Signed Up Successfully.");
        Intent i= new Intent(SignUp_Screen.this, Login_Screen.class);
        startActivity(i);
        Toast.makeText(SignUp_Screen.this,"Signed Up Successfully.",Toast.LENGTH_SHORT).show();
    }
}
