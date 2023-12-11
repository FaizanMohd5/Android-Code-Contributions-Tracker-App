package com.upcode.contributiontracker;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.*;
import java.util.*;


public class AddContributionActivity extends AppCompatActivity {

    // Assuming you have a list to store contributions
    private List<Contribution> contributionsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contribution);

        // Your existing initialization code

        // Handle Save Contribution button click
        AppCompatButton saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call a method to handle saving the contribution
                saveContribution();
            }
        });
    }

    private void saveContribution() {
        // Retrieve input values from EditText fields
        EditText titleEditText = findViewById(R.id.titleEditText);
        EditText platformEditText = findViewById(R.id.platformEditText);
        EditText numberEditText = findViewById(R.id.numberEditText);
        EditText descriptionEditText = findViewById(R.id.descriptionEditText);

        String title = titleEditText.getText().toString();
        String platform = platformEditText.getText().toString();
        int numberOfContributions = Integer.parseInt(numberEditText.getText().toString());
        String description = descriptionEditText.getText().toString();

        // Create a new Contribution object
        Contribution contribution = new Contribution(title, platform, numberOfContributions, description);

        // Add the contribution to your data source (e.g., a list)
        contributionsList.add(contribution);

        // Optionally, you can navigate back to the previous screen
        finish();
    }
}


