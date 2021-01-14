package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Forget_Password_Screen extends AppCompatActivity {
RelativeLayout resetlayout,questionlayout;
EditText  pass1,pass2,ans1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget__password__screen);
        setTitle(Html.fromHtml("<font color='#3477e3'>Reset Password</font>"));


        ans1=(EditText) findViewById(R.id.ans1);
        pass1=(EditText) findViewById(R.id.pass1);
        pass2=(EditText) findViewById(R.id.pass2);

        questionlayout=(RelativeLayout) findViewById(R.id.questionlayout);
        resetlayout=(RelativeLayout) findViewById(R.id.resetlayout);

    }



    public  void submitAns(View v){
        String ans=ans1.getText().toString();
        if(ans.equals("parrot")){
            Log.d("answer",ans1.getText().toString());
            questionlayout.setVisibility(View.GONE);
            resetlayout.setVisibility(View.VISIBLE);
        }else{
            Toast.makeText(Forget_Password_Screen.this,"You gave wrong Ans, Try Again.",Toast.LENGTH_SHORT).show();
            Log.d("answer",ans1.getText().toString());
        }
    }


    public  void resetPass(View v){
        String pass = pass1.getText().toString();
        String confPass = pass2.getText().toString();

        if(pass.equals(confPass)){
            Intent i= new Intent(Forget_Password_Screen.this, Login_Screen.class);
            startActivity(i);
            Toast.makeText(Forget_Password_Screen.this,"Your Password Successfully Reset.",Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(Forget_Password_Screen.this,"Password Mismatch",Toast.LENGTH_SHORT).show();
        }
    }

}
