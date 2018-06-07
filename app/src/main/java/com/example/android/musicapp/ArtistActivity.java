package com.example.android.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Find the View that opens SongActivity
        View songs = findViewById(R.id.library);

// Set a click listener on that View
        songs.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library View is clicked on.
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(ArtistActivity.this, SongActivity.class);
                startActivity(songsIntent);
            }
        });

        ArrayList<Song> artistsongs = new ArrayList<Song>();

        artistsongs.add(new Song("Forest Swords", "War It", "Compassion", "2017", "540"));
        artistsongs.add(new Song("Forest Swords", "Panic", "Compassion", "2017", "147"));
        artistsongs.add(new Song("Forest Swords", "Exalter", "Compassion", "2017", "302"));
        artistsongs.add(new Song("Forest Swords", "Border Margin Barrier", "Compassion", "2017", "185"));
        artistsongs.add(new Song("Forest Swords", "Arms Out", "Compassion", "2017", "336"));
        artistsongs.add(new Song("Forest Swords", "Vandalism", "Compassion", "2017", "170"));
        artistsongs.add(new Song("Forest Swords", "Raw Language", "Compassion", "2017", "490"));
        artistsongs.add(new Song("Forest Swords", "Sjurvival", "Compassion", "2017", "162"));
        artistsongs.add(new Song("Forest Swords", "Raw Language", "Compassion", "2017", "450"));
        artistsongs.add(new Song("Forest Swords", "Knife Edge", "Compassion", "2017", "169"));

        SongAdapter artistadapter =
                new SongAdapter(this, artistsongs);

        ListView listView = (ListView) findViewById(R.id.artist_songs_list);

        listView.setAdapter(artistadapter);

    }
}