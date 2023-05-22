package com.shu.music.bean;

/**
 * @Description 歌手信息实体类
 * @Author Byron
 * @Date 2023/5/8
 */
public class Artist {

    public final long id;
    // 歌手专辑总数
    public final int albumCount;
    // 歌手姓名
    public final String name;
    // 歌手歌曲总数
    public final int songCount;

    public Artist(long id, int albumCount, String name, int songCount) {
        this.id = id;
        this.albumCount = albumCount;
        this.name = name;
        this.songCount = songCount;
    }

}
