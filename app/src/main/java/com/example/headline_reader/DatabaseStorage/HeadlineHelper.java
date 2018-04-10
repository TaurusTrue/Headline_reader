package com.example.headline_reader.DatabaseStorage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by 67698 on 2018/4/9.
 */

public class HeadlineHelper extends SQLiteOpenHelper {
    public static final String CREATE_HEADLINE="create table Headline("
    +"id integer primary key autoincrement，"
    +"key text ,"
    +"value text,"
    +"lasttime text)";
    private Context context1;
    public HeadlineHelper(Context context,String name ,SQLiteDatabase.CursorFactory factory,int version)
    {
        super(context,name,factory,version);
        context1=context;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_HEADLINE);
        Log.d("shujuku", "onCreate: ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
