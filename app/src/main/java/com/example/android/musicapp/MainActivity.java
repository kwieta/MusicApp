package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that opens SongActivity
        View nowPlayingArtist = (TextView) findViewById(R.id.nowPlayingArtist);

        nowPlayingArtist.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the nowPlayingArtist View is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowplayingartistIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(nowplayingartistIntent);
            }
        });

// Find the View that opens SongActivity
        View songs = findViewById(R.id.library);

// Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongActivity.class);
                startActivity(songsIntent);
            }
        });

    }
}
