package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    Button button;
    ImageView img;
    int images[]={R.drawable.img1,R.drawable.img2,R.drawable.img3};//array of 3 images
    int curimg=0;//current image at 0th position
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn);
        img = findViewById(R.id.image);
       
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curimg++;
                curimg=curimg%images.length;//mod operation to print within 3 images one after other
                img.setImageResource(images[curimg]);
            }
        });

    }
}
