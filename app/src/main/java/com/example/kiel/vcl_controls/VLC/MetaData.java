package com.example.kiel.vcl_controls.VLC;

/**
 * Created by kiel on 8/10/17.
 */

public class MetaData  {

    /** ---------------------------------------
     *              Attributes
     *  --------------------------------------- */

    protected String title;
    protected String artist;
    protected String filename;
    protected String date;
    protected String artwork_url;
    protected String album;
    protected String genre;
    protected int    track_number;

    public MetaData(String title, String artist, String filename, String date, String artwork_url, String album, String genre, int track_number) {
        this.title = title;
        this.artist = artist;
        this.filename = filename;
        this.date = date;
        this.artwork_url = artwork_url;
        this.album = album;
        this.genre = genre;
        this.track_number = track_number;
    }

    /** ---------------------------------------
     *           Getters and Setters
     *  --------------------------------------- */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getArtwork_url() {
        return artwork_url;
    }

    public void setArtwork_url(String artwork_url) {
        this.artwork_url = artwork_url;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTrack_number() {
        return track_number;
    }

    public void setTrack_number(int track_number) {
        this.track_number = track_number;
    }



}
