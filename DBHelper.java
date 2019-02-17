package com.example.nkalchos19.aim1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "sampledata.db";

    private final String CREATE_TABLE1 =
            "CREATE TABLE " + DBContact.TABLE1 + "(" +
                    DBContact.Table1._ID + " INTEGER PRIMARY KEY," +
                    DBContact.Table1.COLUMN1 + " TEXT," +
                    DBContact.Table1.COLUMN2 + " TEXT," +
                    DBContact.Table1.COLUMN3 + " TEXT," +
                    DBContact.Table1.COLUMN4 + " TEXT," +
                    DBContact.Table1.COLUMN5 + " TEXT," +
                    DBContact.Table1.COLUMN6 + " TEXT )";



    public DBHelper(@Nullable Context context)
    {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + DBContact.TABLE1
                + "("
                + DBContact.Table1._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + DBContact.Table1.COLUMN1 + " TEXT, "
                + DBContact.Table1.COLUMN2 + " TEXT, "
                + DBContact.Table1.COLUMN3 + " TEXT, "
                + DBContact.Table1.COLUMN4 + " TEXT, "
                + DBContact.Table1.COLUMN5 + " TEXT, "
                + DBContact.Table1.COLUMN6 + " TEXT "
                + ")"
        );


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        onCreate(db);
    }
}
