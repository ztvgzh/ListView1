package com.example.listofourgroup;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    ImageView img;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        img = findViewById(R.id.imageView2);
        text = findViewById(R.id.textView);

        int key = getIntent().getIntExtra("position", 0);
        switch (key){
            case 0:
                text.setText("Aymurzayeva Aysulu");
                img.setImageDrawable(getResources().getDrawable(R.drawable.aysaym));
                break;
            case 1:
                text.setText("Jarilkaganova Aysulu");
                img.setImageDrawable(getResources().getDrawable(R.drawable.aysj));
                break;
            case 2:
                text.setText("Azatova Gulshad");
                img.setImageDrawable(getResources().getDrawable(R.drawable.gg));
                break;
        }
    }

}