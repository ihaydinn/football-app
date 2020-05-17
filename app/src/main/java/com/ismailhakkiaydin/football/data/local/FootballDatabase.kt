package com.ismailhakkiaydin.football.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ismailhakkiaydin.football.model.leaguetable.Standing
import com.ismailhakkiaydin.football.model.topscorer.Topscorer

@Database(entities = (arrayOf(Topscorer::class)),version = 2)
abstract class FootballDatabase: RoomDatabase() {

    abstract fun footballDao() : FootballDao

    companion object{
        @Volatile
        private var instance : FootballDatabase?=null
        private val lock = Any()
        operator fun invoke(context: Context)= instance?: synchronized(lock){
            instance?:makeDatabase(context).also{
                instance = it
            }
        }

        private fun makeDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,FootballDatabase::class.java, "footballdatabase")
            .fallbackToDestructiveMigration().build()
    }

}