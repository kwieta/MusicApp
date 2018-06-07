package com.example.android.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.

        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.songlist_item, parent, false);
        }

        // Get the object located at this position in the list
        Song currentSong = getItem(position);

        TextView artistTextView = (TextView) listItemView.findViewById(R.id.customList_textView_artistName);
        artistTextView.setText(currentSong.getArtistName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songTextView = (TextView) listItemView.findViewById(R.id.customList_textView_songName);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        songTextView.setText(currentSong.getSongName());

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView albumTextView = (TextView) listItemView.findViewById(R.id.customList_textView_albumName);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        albumTextView.setText(currentSong.getAlbumName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView releaseDateTextView = (TextView) listItemView.findViewById(R.id.customList_textView_releaseDate);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        releaseDateTextView.setText(currentSong.getReleaseDate());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberOfPlaysTextView = (TextView) listItemView.findViewById(R.id.customList_textView_numberOfPlays);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberOfPlaysTextView.setText(currentSong.getNumberOfPlays());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }


}