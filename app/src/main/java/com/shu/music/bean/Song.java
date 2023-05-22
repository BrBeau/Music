package com.shu.music.bean;

/**
 * @Description 本地音乐实体类
 * @Author Byron
 * @Date 2023/5/5
 */
public class Song {

    public final long id;
    public final long albumId;
    public final String albumName;
    public final long artistId;
    public final String artistName;
    public final int duration;
    public final String title;
    public final int trackNumber;


    public Song() {
        this.id = -1;
        this.albumId = -1;
        this.albumName = "";
        this.artistId = -1;
        this.artistName = "";
        this.duration = -1;
        this.title = "";
        this.trackNumber = -1;
    }

    public Song(long id, long albumId, String albumName, long artistId, String artistName, int duration, String title, int trackNumber) {
        this.id = id;
        this.albumId = albumId;
        this.albumName = albumName;
        this.artistId = artistId;
        this.artistName = artistName;
        this.duration = duration;
        this.title = title;
        this.trackNumber = trackNumber;
    }

}
