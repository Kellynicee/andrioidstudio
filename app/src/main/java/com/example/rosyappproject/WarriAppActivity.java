package com.example.rosyappproject; // Ensure this is the correct package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class WarriAppActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warri_app); // Ensure this layout exists in res/layout/
    }

    // Method to navigate to the Home page
    public void goToHomePage(View view) {
        Intent intent = new Intent(WarriAppActivity.this, HomeActivity.class); // Ensure HomeActivity is declared
        startActivity(intent);
    }

    // Method to navigate to the About Us page
    public void goToAboutUsPage(View view) {
        Intent intent = new Intent(WarriAppActivity.this, AboutUsActivity.class); // Ensure AboutUsActivity is declared
        startActivity(intent);
    }

    // Method to navigate to the Legislative page
    public void goToLegislativePage(View view) {
        Intent intent = new Intent(WarriAppActivity.this, LegislativeActivity.class); // Ensure LegislativeActivity is declared
        startActivity(intent);
    }

    // Method to navigate to the Contact Us page
    public void goToContactUsPage(View view) {
        Intent intent = new Intent(WarriAppActivity.this, ContactUsActivity.class); // Ensure ContactUsActivity is declared
        startActivity(intent);
    }
}
