package com.example.exerciselesson5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity1Widget extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.widgetlayout_1);

        ImageView imgview = (ImageView) findViewById(R.id.imageView);
        TextView txtvw = (TextView) findViewById(R.id.texteRadioButton);
        RadioButton rdbtn = (RadioButton) findViewById(R.id.radioButton);
        rdbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgview.setVisibility(View.VISIBLE);
                imgview.setClickable(true);
                txtvw.setVisibility(View.VISIBLE);


            }
        });

        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Activity1Widget.this, MainActivity.class));
            }
        });
    }
}
