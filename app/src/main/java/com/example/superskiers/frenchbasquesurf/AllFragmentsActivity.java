package com.example.superskiers.frenchbasquesurf;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class AllFragmentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.all_fragments);

        //Navigation back to home screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //View Components
        TextView setBeachForecast = findViewById(R.id.beach_forecast);
        TextView setBeachName = findViewById(R.id.beach_name_text_view);
        TextView setBeachDescrip = findViewById(R.id.beach_descrip_text_view);
        ImageView setImageBeach = findViewById(R.id.image_of_beach);

        ImageView setImageSwell = findViewById(R.id.swell_image_view);
        ImageView setImageTides = findViewById(R.id.tides_image_view);
        ImageView setImageWinds = findViewById(R.id.wind_image_view);

        //Get intent and populate layout
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        String beachName = intent.getStringExtra("beachName");
        String beachDescrip = intent.getStringExtra("beachDescrip");
        String beach_forecast = intent.getStringExtra("beachForecast");
        int imageBeach = extras.getInt("beachImage");
        int imageSwell = extras.getInt("swell");
        int imageTides = extras.getInt("tides");
        int imageWinds = extras.getInt("winds");

        //Set elements: beach name, description, image of:
        //beach, forecast, swell, tides, winds
        setBeachName.setText(beachName);
        setBeachDescrip.setText(beachDescrip);
        setBeachForecast.setText(beach_forecast);
        setImageBeach.setImageResource(imageBeach);

        setImageSwell.setImageResource(imageSwell);
        setImageTides.setImageResource(imageTides);
        setImageWinds.setImageResource(imageWinds);
    }
}

