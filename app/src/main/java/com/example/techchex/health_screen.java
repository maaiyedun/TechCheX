package com.example.techchex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class health_screen extends AppCompatActivity {

    ImageButton healthDocButton;
    ImageButton smartWatchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_screen);

        healthDocButton = (ImageButton) findViewById(R.id.healthDocButton);
        healthDocButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(health_screen.this, "You clicked Health Document Button", Toast.LENGTH_SHORT).show();
                healthDocActivity();
            }
        });

        smartWatchButton = (ImageButton) findViewById(R.id.smartwatchButton);
        smartWatchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(health_screen.this, "You clicked Smart Watch Button", Toast.LENGTH_SHORT).show();
                smartWatchActivity();
            }
        });
    }
        public void healthDocActivity() {
            Intent intent = new Intent(this, health_doc_screen.class);
            startActivity(intent);
        }


        public void smartWatchActivity() {
            Intent intent = new Intent(this, health_watch_screen.class);
            startActivity(intent);
        }
}
