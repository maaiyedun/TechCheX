package com.example.techchex;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import android.os.Bundle;

public class Housing_application_screen extends AppCompatActivity {
    private LinearLayout HouseappLayout;
    private ArrayList<String> appList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing_application_screen);
        HouseappLayout = findViewById(R.id.HousingApplist);

        appList = new ArrayList<>();
        appList.add("appliance 1");
        appList.add("appliance  2");
        appList.add("appliance  3");
        appList.add("appliance  4");
        appList.add("appliance  5");
        appList.add("appliance  6");

        for (int i = 0; i < appList.size(); i++) {
            TextView tv = new TextView(this);
            tv.setText(appList.get(i));
            tv.setTextSize(24);
            tv.setPadding(LinearLayout.LayoutParams.WRAP_CONTENT, 10, LinearLayout.LayoutParams.WRAP_CONTENT, 10);
            tv.setId(i);
            tv.setTextColor(Color.BLACK);
            tv.setBackgroundResource(R.drawable.housing_app_list);
            tv.setTypeface(tv.getTypeface(), Typeface.BOLD);
            tv.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    changeState(view.getId());
                }
            });


            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            lp.setMargins(LinearLayout.LayoutParams.WRAP_CONTENT, 0, LinearLayout.LayoutParams.WRAP_CONTENT, 0);
            tv.setLayoutParams(lp);

            HouseappLayout.addView(tv);
        }
    }

    private void changeState(int selectedId) {

        for (int i = 0; i < appList.size(); i++) {
            TextView textView = (TextView) HouseappLayout.getChildAt(i);
            if (textView.getId() == selectedId) {
                textView.setTextColor(Color.WHITE);
                textView.setBackgroundResource(R.drawable.not_empty_housing_file);
                createSwitch(appList.get(i));

            } else {
                textView.setTextColor(Color.BLACK);
                textView.setBackgroundResource(R.drawable.housing_app_list);
            }
        }
    }


    private void createSwitch(String label) {
        Switch switchButton = new Switch(this);
        switchButton.setText(label);

        // Set any additional attributes you want for the Switch button

        // Add an OnCheckedChangeListener to respond to switch changes
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Handle switch state changes here
            }
        });

        HouseappLayout.addView(switchButton);
    }
}


