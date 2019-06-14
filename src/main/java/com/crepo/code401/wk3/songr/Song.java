package com.crepo.code401.wk3.songr;


import javax.persistence.*;


@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    String songTitle;
    int length;
    int trackNumber;

    //mappedBy String comes from Album.java
    @ManyToOne
    Album album;

    public Song() {}

    public Song(String songTitle, int length, int trackNumber, Album album){

        this.album = album;
        this.songTitle = songTitle;
        this.length = length;
        this.trackNumber = trackNumber;
    }


    public long getId() {
        return id;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getLength() {
        return length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public Album getAlbum() {
        return album;
    }
}
