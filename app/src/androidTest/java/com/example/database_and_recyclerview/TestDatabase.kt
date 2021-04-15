package com.example.database_and_recyclerview

import androidx.room.Room
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.InstrumentationConnection
import androidx.test.platform.app.InstrumentationRegistry
import com.example.database_and_recyclerview.database.Emotion
import com.example.database_and_recyclerview.database.EmotionDatabaseDao
import com.example.database_and_recyclerview.database.database
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class TestDatabase {
    private lateinit var EmotionDatabaseDao:EmotionDatabaseDao
    private lateinit var database: database
    @Before
    fun createDatabase(){
        val contex=InstrumentationRegistry.getInstrumentation().targetContext
        database= Room.inMemoryDatabaseBuilder(contex,database::class.java)
            .allowMainThreadQueries()
            .build()

    }
    @After
    @Throws(IOException::class)
    fun closeDatabase(){
        database.close()
    }
    @Test
    @Throws(Exception::class)
    fun addEmotionRead(){
        val emotion=Emotion()
        EmotionDatabaseDao.add(emotion)
        val endEmotion=EmotionDatabaseDao.readEndEmotion()
        assertEquals(endEmotion?.emotionQuality,-1)


    }
}