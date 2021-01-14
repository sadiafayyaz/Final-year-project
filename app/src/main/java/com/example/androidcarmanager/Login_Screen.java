package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class Login_Screen extends AppCompatActivity {
    private Button btn1,button;
private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);
//        getSupportActionBar().hide();
        setTitle(Html.fromHtml("<font color='#3477e3'>Login to Continue</font>"));

        btn1 = (Button) findViewById(R.id.btn1);
        button=(Button) findViewById(R.id.button);
        textView2 = (TextView) findViewById(R.id.textView2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUp_Screen();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openForget_Password_Screen();
            }
        });

    }

    public void openSignUp_Screen() {
        Intent i = new Intent(Login_Screen.this, SignUp_Screen.class);
        startActivity(i);

    }


    public void openForget_Password_Screen() {
        Intent i = new Intent(Login_Screen.this, Forget_Password_Screen.class);
        startActivity(i);
    }
    public void openMainActivity(){
        Intent i= new Intent(Login_Screen.this, MainActivity.class);
        startActivity(i);
        }


}
