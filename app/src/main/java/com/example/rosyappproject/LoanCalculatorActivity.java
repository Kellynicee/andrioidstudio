package com.example.rosyappproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoanCalculatorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loanapp); // Ensure this layout file exists

        EditText principalInput = findViewById(R.id.principal_input);
        EditText rateInput = findViewById(R.id.rate_input);
        EditText timeInput = findViewById(R.id.time_input);
        EditText frequencyInput = findViewById(R.id.frequency_input);
        Button calculateButton = findViewById(R.id.calculate_button);
        TextView resultText = findViewById(R.id.result_text);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double principal = Double.parseDouble(principalInput.getText().toString());
                    double rate = Double.parseDouble(rateInput.getText().toString()) / 100;
                    double time = Double.parseDouble(timeInput.getText().toString());
                    double frequency = Double.parseDouble(frequencyInput.getText().toString());

                    double accumulatedAmount = principal * Math.pow((1 + rate / frequency), frequency * time);
                    resultText.setText("Accumulated Amount: " + String.format("%.2f", accumulatedAmount));
                } catch (NumberFormatException e) {
                    Toast.makeText(LoanCalculatorActivity.this, "Please enter valid numbers in all fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
