package com.example.tarviliivak.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        CardView phy = findViewById(R.id.phy_card);
        // Set a click listener on that View
        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phyIntent = new Intent(PlayActivity.this, NatureActivity.class);
                startActivity(phyIntent);
            }
        });

        CardView chem = findViewById(R.id.chem_card);
        // Set a click listener on that View
        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chemIntent = new Intent(PlayActivity.this, FoodActivity.class);
                startActivity(chemIntent);
            }
        });

        CardView bio = findViewById(R.id.bio_card);
        // Set a click listener on that View
        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bioIntent = new Intent(PlayActivity.this, CountriesActivity.class);
                startActivity(bioIntent);
            }
        });

    }
}
