package com.example.rosyappproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText principalInput, rateInput, timeInput, frequencyInput;
    Button calculateButton;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loanapp);  // Make sure this matches your layout file name

        // Initialize Views
        principalInput = findViewById(R.id.principal_input);
        rateInput = findViewById(R.id.rate_input);
        timeInput = findViewById(R.id.time_input);
        frequencyInput = findViewById(R.id.frequency_input);
        calculateButton = findViewById(R.id.calculate_button);
        resultText = findViewById(R.id.result_text);

        // Set button click listener
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get user input values
                double principal = Double.parseDouble(principalInput.getText().toString());
                double rate = Double.parseDouble(rateInput.getText().toString()) / 100; // Convert to decimal
                double time = Double.parseDouble(timeInput.getText().toString());
                double frequency = Double.parseDouble(frequencyInput.getText().toString());

                // Compound interest formula: A = P * (1 + r/n)^(n*t)
                double accumulatedAmount = principal * Math.pow((1 + rate / frequency), frequency * time);

                // Display result
                resultText.setText("Accumulated Amount: " + String.format("%.2f", accumulatedAmount));
            }
        });
    }
}
