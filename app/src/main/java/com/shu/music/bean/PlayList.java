package com.shu.music.bean;

/**
 * @Description 播放列表实体类
 * @Author Byron
 * @Date 2023/5/8
 */
public class PlayList {
    public final int id;
    public final String name;
    public final int songCount;

    public PlayList(int id, String name, int songCount) {
        this.id = id;
        this.name = name;
        this.songCount = songCount;
    }
}
