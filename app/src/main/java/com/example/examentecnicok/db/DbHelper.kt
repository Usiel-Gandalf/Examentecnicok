package com.example.examentecnicok.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Environment

class DbHelper(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION){
    companion object {
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = Environment.getExternalStorageState() + "/bd/EmployeeDatabase.db"
        private val TABLE_USER = "tableUser"
        private val KEY_ID = "id"
        private val USER = "usuario"
        private val COUNTRY = "pais"
        private val STATE = "estado"
        private val GENDER = "genero"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        //creating table with fields
        val CREATE_CONTACTS_TABLE = ("CREATE TABLE " + TABLE_USER + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + USER + " TEXT NOT NULL,"
                + COUNTRY + " TEXT NOT NULL" + STATE + " TEXT NOT NULL" + GENDER + " TEXT NOT NULL" + ")")
        db?.execSQL(CREATE_CONTACTS_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        db!!.execSQL("DROP TABLE IF EXISTS " + TABLE_USER)
        onCreate(db)
    }

}