package com.reptil.panda.euphoria.Storage

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import com.reptil.panda.euphoria.R
import kotlin.reflect.KProperty

//TODO provjeri room/realm baze

class DelegatedPreferences<T>(val context: Context, val key: String, val defaultValue: T) {
    val prefs: SharedPreferences by lazy {
        context.getSharedPreferences(
                context.getString(R.string.app_name), Context.MODE_PRIVATE)
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T {
        return findPreferences(key, defaultValue)
    }



    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
        savePreference(key, value)
    }

    @Suppress("UNCHECKED_CAST")
    private fun findPreferences(key: String, defaultValue: T): T {
        with(prefs)
        {
            val result: Any = when (defaultValue) {
                is Boolean -> getBoolean(key, defaultValue)
                is Int -> getInt(key, defaultValue)
                is Long -> getLong(key, defaultValue)
                is Float -> getFloat(key, defaultValue)
                is String -> getString(key, defaultValue)
                else -> throw IllegalArgumentException()
            }
            return result as T
        }
    }

    @SuppressLint("CommitPrefEdits")
    private fun savePreference(key: String, value: T) {
        with(prefs.edit())
        {
            when (value) {
                is Boolean -> putBoolean(key, value)
                is Int -> putInt(key, value)
                is Long -> putLong(key, value)
                is Float -> putFloat(key, value)
                is String -> putString(key, value)
                else -> throw IllegalArgumentException()
            }.apply()
        }
    }


    object PrefKey {
        val AUTO_UPDATE_STATUS = "AUTO_UPDATE_STATUS"
        val AUTO_UPDATE_DURATION = "AUTO_UPDATE_DURATION"
    }


}