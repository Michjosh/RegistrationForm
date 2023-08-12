package com.mikul.registrationapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        Intent intent = getIntent();
        String firstName = intent.getStringExtra("firstName");
        String lastName = intent.getStringExtra("lastName");
        String selectedCountry = intent.getStringExtra("selectedCountry");
        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        Uri imageUri = intent.getParcelableExtra("imageUri");


        TextView confirmationTextView = findViewById(R.id.confirmationTextView);
        ImageView confirmedProfileImageView = findViewById(R.id.confirmedProfileImageView);


        confirmedProfileImageView.setImageURI(imageUri);
        String confirmationText = "Name: " + firstName + " " + lastName + "\n" +
                "Country: " + selectedCountry + "\n" +
                "Date of Birth: " + dateOfBirth;
        confirmationTextView.setText(confirmationText);

    }
}
