package com.example.nkalchos19.aim1;

import android.provider.BaseColumns;

public class DBContact {

    // Prevent this class from being instantiated
    private DBContact() {}



    public static String TABLE1 = "Table1";


    public static class Table1 implements BaseColumns
    {
        // Define column names
        public static final String COLUMN1 = "col1";
        public static final String COLUMN2 = "col2";
        public static final String COLUMN3 = "col3";
        public static final String COLUMN4 = "col4";
        public static final String COLUMN5 = "col5";
        public static final String COLUMN6 = "col6";

    }


}