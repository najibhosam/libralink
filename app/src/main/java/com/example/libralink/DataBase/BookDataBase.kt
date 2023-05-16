package com.example.libralink.DataBase

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context


@Database(entities = [Books::class], version = 1)
abstract class BookDataBase : RoomDatabase(){
    abstract fun booksDao(): BooksDao

    companion object{
        @Volatile
        private var INSTANCE : BookDataBase? = null

        fun getDatabase(context: Context): BookDataBase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }

            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    BookDataBase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}