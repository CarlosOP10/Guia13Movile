package edu.bo.guia11_16
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

class Prefs(context:Context) {
    val PREFS_FILENAME = "edu.bo.guia11_16.pref"
    val KEY_USER ="user"
    //val prefs: SharedPreferences = context.getSharedPreferences(PREFS_FILENAME, 0)
    val prefs: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
    var user: String
        get() = prefs.getString(KEY_USER, null).toString()
        set(value) = prefs.edit().putString(KEY_USER, value).apply()

}