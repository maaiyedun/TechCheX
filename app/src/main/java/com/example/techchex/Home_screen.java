package com.example.techchex;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Home_screen extends AppCompatActivity {

    ImageButton houseButton;
    ImageButton carButton;
    ImageButton healthButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        houseButton = (ImageButton) findViewById(R.id.houseButton);
        houseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home_screen.this, "You clicked House Button", Toast.LENGTH_SHORT).show();
            }
        });

        carButton = (ImageButton) findViewById(R.id.carButton);
        carButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home_screen.this, "You clicked Car Button", Toast.LENGTH_SHORT).show();
            }
        });

        healthButton = (ImageButton) findViewById(R.id.healthButton);
        healthButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home_screen.this, "You clicked Health Button", Toast.LENGTH_SHORT).show();
            }
        });

    }
}