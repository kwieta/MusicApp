package com.example.android.musicapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.song_list);

        ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song("Forest Swords", "War It", "Compassion", "2017", "540"));
        songs.add(new Song("Forest Swords", "Panic", "Compassion", "2017", "147"));
        songs.add(new Song("Forest Swords", "Exalter", "Compassion", "2017", "302"));
        songs.add(new Song("Forest Swords", "Border Margin Barrier", "Compassion", "2017", "185"));
        songs.add(new Song("Forest Swords", "Arms Out", "Compassion", "2017", "336"));
        songs.add(new Song("Forest Swords", "Vandalism", "Compassion", "2017", "170"));
        songs.add(new Song("Forest Swords", "Raw Language", "Compassion", "2017", "490"));
        songs.add(new Song("Forest Swords", "Sjurvival", "Compassion", "2017", "162"));
        songs.add(new Song("Forest Swords", "Raw Language", "Compassion", "2017", "450"));
        songs.add(new Song("Forest Swords", "Knife Edge", "Compassion", "2017", "169"));

        songs.add(new Song("Nils Frahm", "The Whole Universe Wants To Be Touched", "All Melody", "2018", "537"));
        songs.add(new Song("Nils Frahm", "Sunson", "All Melody", "2018", "143"));
        songs.add(new Song("Nils Frahm", "A Place", "All Melody", "2018", "302"));
        songs.add(new Song("Nils Frahm", "My Friend The Forest", "All Melody", "2018", "184"));
        songs.add(new Song("Nils Frahm", "Human Range", "All Melody", "2018", "326"));
        songs.add(new Song("Nils Frahm", "Forever Changeless", "All Melody", "2018", "179"));
        songs.add(new Song("Nils Frahm", "All Melody", "All Melody", "2018", "480"));
        songs.add(new Song("Nils Frahm", "#2", "All Melody", "2018", "163"));
        songs.add(new Song("Nils Frahm", "Momentum", "All Melody", "2018", "413"));
        songs.add(new Song("Nils Frahm", "Fundamental Values", "All Melody", "2018", "168"));
        songs.add(new Song("Nils Frahm", "Kaleidoscope", "All Melody", "2018", "476"));
        songs.add(new Song("Nils Frahm", "Harm Hymn", "All Melody", "2018", "198"));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        SongAdapter adapter =
                new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_listyout file.
        ListView listView = (ListView) findViewById(R.id.songlist);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each word in the list of words.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(adapter);

    }
}
