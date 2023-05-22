package com.shu.music.bean;

/**
 * @Description 专辑信息实体类
 * @Author Byron
 * @Date 2023/5/8
 */
public class Album {
    public final long id;
    public final String title;
    public final String artistName;
    public final long artistId;
    public final int songCount;
    public final int year;

    public Album(long id, String title, String artistName, long artistId, int songCount, int year) {
        this.id = id;
        this.title = title;
        this.artistName = artistName;
        this.artistId = artistId;
        this.songCount = songCount;
        this.year = year;
    }
}
