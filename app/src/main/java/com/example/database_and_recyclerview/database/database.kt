package com.example.database_and_recyclerview.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Emotion::class],version=1, exportSchema= false)
abstract class database:RoomDatabase() {
    abstract val EmotionDatabaseDao:EmotionDatabaseDao
    companion object{
        @Volatile
        private var EXAMPLE_OBJECT:database?=null
        fun getExample(context: Context):database{
            synchronized(this){
                var example= EXAMPLE_OBJECT
                if(example==null){
                    example= Room.databaseBuilder(
                        context.applicationContext,
                        database::class.java,
                        "emotion_database"

                        )
                        .fallbackToDestructiveMigration()
                        .build()
                    EXAMPLE_OBJECT=example
                }
                return example
            }
        }
    }
}