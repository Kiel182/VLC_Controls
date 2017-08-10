package com.example.kiel.vcl_controls.VLC;

/**
 * Created by kiel on 8/10/17.
 */

public class VLCStatus {

    /** ---------------------------------------
     *              Attributes
     *  --------------------------------------- */

    protected String state;
    protected int time;
    protected int length;
    protected boolean isRepeating;
    protected boolean isLooping;
    protected boolean isRandom;
    protected MetaData playing;

    /** ---------------------------------------
     *              Constructors
     *  --------------------------------------- */
    public VLCStatus(String state, int time, int length, boolean isRepeating, boolean isLooping, boolean isRandom, MetaData playing) {
        this.state = state;
        this.time = time;
        this.length = length;
        this.isRepeating = isRepeating;
        this.isLooping = isLooping;
        this.isRandom = isRandom;
        this.playing = playing;
    }

    /** ---------------------------------------
     *           Getters and Setters
     *  --------------------------------------- */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean isRepeating() {
        return isRepeating;
    }

    public void setRepeating(boolean repeating) {
        isRepeating = repeating;
    }

    public boolean isLooping() {
        return isLooping;
    }

    public void setLooping(boolean looping) {
        isLooping = looping;
    }

    public boolean isRandom() {
        return isRandom;
    }

    public void setRandom(boolean random) {
        isRandom = random;
    }

    public MetaData getPlaying() {
        return playing;
    }

    public void setPlaying(MetaData playing) {
        this.playing = playing;
    }

    public void setPlaying(String title, String artist, String filename, String date, String artwork_url, String album, String genre, int track_number) {
        this.playing = new MetaData(title, artist, filename, date, artwork_url, album, genre, track_number);
    }
}
