package com.example.myapplicationc1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int number_of_clicks  = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void onClick1(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        number_of_clicks++;
        textView.setText("Печенек: "+number_of_clicks);
    }


    public void onClick(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        number_of_clicks--;
        textView.setText("Печенек: "+number_of_clicks);
    }

}