package com.example.myapplicationc1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int currentScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgCookie = findViewById(R.id.imgCookie);

        imgCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentScore ++;
                Toast.makeText(MainActivity.this, "your score is " + currentScore, Toast.LENGTH_SHORT).show();
            }
        });
    }

}