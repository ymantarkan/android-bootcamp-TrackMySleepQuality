package com.example.database_and_recyclerview.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "emotion_table")
data class Emotion (
    @PrimaryKey(autoGenerate = true)
    var id :Long=0L,
    @ColumnInfo(name = "startTime")
    val startTimeMili:Long=System.currentTimeMillis(),
    @ColumnInfo(name = "endTime")
    var endTimeMili:Long=startTimeMili,
    @ColumnInfo(name = "emotion")
    var emotionQuality:Int=-1


        )
{
}