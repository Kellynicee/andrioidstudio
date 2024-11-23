package com.example.rosyappproject;  // Ensure this matches the correct package name

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LegislativeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legislative);  // This should reference activity_legislative.xml
    }
}
