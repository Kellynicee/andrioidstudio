package com.example.rosyappproject;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class GuessingGameActivity extends AppCompatActivity {

    private RelativeLayout gameLayout;
    private TextView resultText;
    private Button box1, box2;

    private int number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guessing_game);  // Updated layout name

        // Initialize views
        gameLayout = findViewById(R.id.game_layout);
        resultText = findViewById(R.id.result_text);
        box1 = findViewById(R.id.box1);
        box2 = findViewById(R.id.box2);

        // Generate random numbers and set them
        generateRandomNumbers();

        // Set up button click listeners
        box1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkGuess(number1, number2);
            }
        });

        box2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkGuess(number2, number1);
            }
        });
    }

    // Function to generate random numbers
    private void generateRandomNumbers() {
        Random random = new Random();
        number1 = random.nextInt(100); // Generate a random number for box 1
        number2 = random.nextInt(100); // Generate a random number for box 2

        // Set numbers in the buttons
        box1.setText(String.valueOf(number1));
        box2.setText(String.valueOf(number2));
    }

    // Function to check the user's guess
    private void checkGuess(int clickedNumber, int otherNumber) {
        if (clickedNumber > otherNumber) {
            gameLayout.setBackgroundColor(Color.GREEN); // Change background to green
            resultText.setText("YOU WIN");
        } else {
            gameLayout.setBackgroundColor(Color.RED); // Change background to red
            resultText.setText("YOU LOSE");
        }

        // Reset for a new round
        generateRandomNumbers();
    }
}
