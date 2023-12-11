package com.upcode.contributiontracker;
import android.os.Bundle;
import android.view.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.*;
import androidx.recyclerview.widget.*;

import java.util.*;


public class ProgressActivity extends AppCompatActivity {
    private List<Contribution> contributions = new ArrayList<>(); // Initialize with your data
    private RecyclerView contributionsRecyclerView;
    private ContributionAdapter contributionAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        // Initialize RecyclerView
        contributionsRecyclerView = findViewById(R.id.contributionsRecyclerView);
        contributionsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize and set the adapter
        contributionAdapter = new ContributionAdapter(contributions);
        contributionsRecyclerView.setAdapter(contributionAdapter);

        // Handle Back button click
        AppCompatButton backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle back button logic
                finish(); // Close the current activity and go back
            }
        });
    }
}

