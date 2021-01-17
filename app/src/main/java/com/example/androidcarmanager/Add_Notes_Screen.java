package com.example.androidcarmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Add_Notes_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__notes__screen);
        setTitle(Html.fromHtml("<font color='#3477e3'>Add Notes</font>"));
    }
    public void saveNotes(View v){ Log.i("Save Notes","Notes has been Saved Successfully.");
        Intent i= new Intent(Add_Notes_Screen.this, Add_Files_Screen.class);
        startActivity(i);
        Toast.makeText(Add_Notes_Screen.this,"Notes has been Saved Successfully.",Toast.LENGTH_SHORT).show();
    }
    public void deleteNotes(View v){ Log.i("Save Notes","Notes has been Deleted Successfully.");
        Intent i= new Intent(Add_Notes_Screen.this, Add_Files_Screen.class);
        startActivity(i);
        Toast.makeText(Add_Notes_Screen.this,"Notes has been Deleted Successfully.",Toast.LENGTH_SHORT).show();
    }


}
