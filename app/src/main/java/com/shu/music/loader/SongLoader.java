package com.shu.music.loader;

import android.content.Context;
import android.database.Cursor;
import android.provider.MediaStore;
import android.text.TextUtils;

import com.shu.music.bean.Song;

import java.util.ArrayList;

/**
 * @Description 获取本地音乐
 * @Notice 高版本需要读写权限
 * @Author Byron
 * @Date 2023/5/5
 */
public class SongLoader {


    /**
     * cursor获取本地音乐
     * @param cursor 游标
     * @return song实体的列表
     */
    public static ArrayList<Song> getSongFromCursor(Cursor cursor){
        ArrayList arrayList = new ArrayList();
        if ((cursor != null) && (cursor.moveToFirst())){
            do {
                // 0 1 2 3的下标和cursor的selection一致
                long id = cursor.getLong(0);
                String title = cursor.getString(1);
                String artistName = cursor.getString(2);
                String albumName = cursor.getString(3);
                int duration = cursor.getInt(4);
                int trackNUmber = cursor.getInt(5);
                long artistId = cursor.getLong(6);
                long albumId = cursor.getLong(7);
//                 添加到arrayList中
                arrayList.add(new Song(id, albumId, albumName, artistId, artistName, duration, title, trackNUmber));


            } while (cursor.moveToNext());
            if (cursor != null)
                cursor.close();
        }

        return arrayList;
    }

    public static ArrayList<Song> getAllSongs(Context context) {
        return getSongFromCursor(songCursor(context, null, null));
    }

    public static Cursor songCursor(Context context, String selection, String[] paramArrayOfString){
        final String sortOrder = "title_key";
        return songCursor(context, selection, paramArrayOfString, sortOrder);
    }

    private static Cursor songCursor(Context context, String selection, String[] paramArrayOfString, String sortOrder){
        String selectionStatement = "is_music=1 AND title != ''";
        if (!TextUtils.isEmpty(selection)){
            selectionStatement = selectionStatement + " AND " + selection;
        }

        return context.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                /** 这里的selection字段要和MediaStore里定义的一致，要不然查找不到 **/
                new String[]{"_id", "title", "artist", "album", "duration", "track", "artist_id", "album_id"},
                selectionStatement, paramArrayOfString, sortOrder);
    }
}
