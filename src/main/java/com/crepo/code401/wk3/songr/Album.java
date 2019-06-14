package com.crepo.code401.wk3.songr;


//Album model

import javax.persistence.*;
import java.util.List;


@Entity
public class Album {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String albumTitle;
    String artist;
    int songCount;
    int length;
    String imageUrl;


    @OneToMany(mappedBy = "album")
    List<Song> songs;

    public Album(){}

    public Album(String albumTitle, String artist, int songCount, int length, String imageUrl){
        this.albumTitle = albumTitle;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }


    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public String getArtist() {
        return this.artist;
    }

    public long getId() {
        return id;
    }

    public int getSongCount() {
        return this.songCount;
    }

    public int getLength() {
        return this.length;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public List<Song> getSongs() {
        return songs;
    }
}
