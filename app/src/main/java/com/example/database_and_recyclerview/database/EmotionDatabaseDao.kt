package com.example.database_and_recyclerview.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface EmotionDatabaseDao  {
    @Insert
    fun add(emotion:Emotion)
    @Query("SELECT * FROM EMOTION_TABLE ORDER BY id DESC")
    fun readTable():LiveData<List<Emotion>>
    @Query("SELECT * FROM EMOTION_TABLE WHERE  id=:id")
    fun readId(id:Long):Emotion?
    @Query("SELECT * FROM EMOTION_TABLE ORDER BY id DESC LIMIT 1")
    fun readEndEmotion():Emotion?
    @Update
    fun update(emotion: Emotion)
    @Query("DELETE FROM EMOTION_TABLE")
    fun deleteAll()
    @Query("DELETE FROM EMOTION_TABLE WHERE id =:id")
    fun deleteEmotion(id:Long)
}