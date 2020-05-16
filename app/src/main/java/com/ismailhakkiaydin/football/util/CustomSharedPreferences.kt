package com.ismailhakkiaydin.football.util

import android.content.Context
import android.content.SharedPreferences
import androidx.core.content.edit
import androidx.preference.PreferenceManager

class CustomSharedPreferences {

    companion object{
        private val COUNTRY_ID = "country_id"
        private val PREFERENCES_TIME = "preferences_time"
        private val RB_ID = "rb_id"
        private var sharedPreferences: SharedPreferences? = null

        @Volatile
        private var instance: CustomSharedPreferences? = null
        private val lock = Any()

        operator fun invoke(context: Context) : CustomSharedPreferences = instance ?: synchronized(lock){
            instance ?: makeCustomSharedPreferences(context).also {
                instance = it
            }
        }

        private fun makeCustomSharedPreferences(context: Context): CustomSharedPreferences {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
            return CustomSharedPreferences()
        }

    }
    fun saveCountryId(countryId: Int){
        sharedPreferences?.edit(commit = true){
            putInt(COUNTRY_ID,countryId)
        }
    }

    fun getCountryId()= sharedPreferences?.getInt(COUNTRY_ID,524)

    fun saveRbCountry(rb : Int){
        sharedPreferences?.edit(commit = true){
            putInt(RB_ID,rb)
        }
    }

    fun getRbCountry() = sharedPreferences?.getInt(RB_ID, 0)

    fun saveTime(time: Long) {
        sharedPreferences?.edit(commit = true){
            putLong(PREFERENCES_TIME,time)
        }
    }

    fun getTime() = sharedPreferences?.getLong(PREFERENCES_TIME,0)


}