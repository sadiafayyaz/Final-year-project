package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Expense_Detail_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense__detail__screen);
        setTitle(Html.fromHtml("<font color='#3477e3'>Add Expense</font>"));
    }
    public  void saveExpence(View v){ Log.i("Save eXPENCE","Expence has been Saved Successfully.");
        Intent i= new Intent(Expense_Detail_Screen.this, Add_Expenses_Screen.class);
        startActivity(i);
        Toast.makeText(Expense_Detail_Screen.this,"Expence has been Saved Successfully.",Toast.LENGTH_SHORT).show();
    }
    public void backActivity(View v){ Log.i("Save Notes","Expence has been Deleted Successfully.");
        Intent i= new Intent(Expense_Detail_Screen.this, Add_Expenses_Screen.class);
        startActivity(i);

    }
}
