package com.example.techchex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Login_screen extends AppCompatActivity {
    public static String Password = "name";

    TextView textView;
    EditText inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen2);


        textView = (TextView) findViewById(R.id.inputText);
        inputText = (EditText) findViewById(R.id.inputText);
    }

    public void updateText(View view) {
        textView.setText("Hi" + inputText.getText());
        System.out.println("Button clicked");
        if(inputText.equals(Password)){
            findViewById(R.id.loginbtn).setOnClickListener(v->{startActivity(new Intent(getApplicationContext(), Home_screen.class));});

        }
    }
}