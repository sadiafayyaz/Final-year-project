package com.example.androidcarmanager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Gallery_Screen extends AppCompatActivity {
Button btncapture,btnviewimage;
TextView saveimage;
ImageView displayimage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery__screen);
        getSupportActionBar().hide();
        btncapture =   (Button) findViewById(R.id.btncapture);
        btnviewimage =   (Button) findViewById(R.id.View);
        saveimage = (TextView) findViewById(R.id.save);
        displayimage = (ImageView) findViewById(R.id.captureimage);
        btncapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);


    Bitmap bitmap = (Bitmap)data.getExtras().get("data");
   displayimage.setImageBitmap(bitmap);
    }

}
