package com.example.android.musicapp;

public class Song {

    /**
     * Artist's name
     */
    private String mArtistName;

    /**
     * Song name
     */
    private String mSongName;
    /**
     * Album name
     */
    private String mAlbumName;

    /**
     * Release date
     */
    private String mReleaseDate;

    /**
     * Number of plays
     */
    private String mNumberOfPlays;


    /**
     * Create a new Song object.
     */

    public Song(String artistName, String songName, String albumName, String releaseDate, String numberOfPlays) {
        mArtistName = artistName;
        mSongName = songName;
        mAlbumName = albumName;
        mReleaseDate = releaseDate;
        mNumberOfPlays = numberOfPlays;
    }

    /**
     * Get the artist_list name.
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the song name.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the album name.
     */
    public String getAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the release date.
     */
    public String getReleaseDate() {
        return mReleaseDate;
    }

    /**
     * Get the number of plays.
     */
    public String getNumberOfPlays() {
        return mNumberOfPlays;
    }

}