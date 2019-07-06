package com.codekul.storage

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appPrefs = getSharedPreferences("my_prefs", Context.MODE_PRIVATE)
        val actPrefs = getPreferences(Context.MODE_PRIVATE)

        btShRd.setOnClickListener {
            readFromSharedPrefs(appPrefs)
        }

        btShWr.setOnClickListener {
            writeToSharedPrefs(appPrefs)
        }
    }

    fun writeToSharedPrefs(prefs : SharedPreferences) {
        val editor = prefs.edit()
        editor.putInt("top_score", 86)
        editor.putString("str", "android")
        editor.putBoolean("bool", true)
        editor.putFloat("flt", 89.65f)
        editor.apply()
    }

    fun readFromSharedPrefs(prefs : SharedPreferences) {
        val prefsDt = """
                Boolean ${prefs.getBoolean("bool", false)}
                Int ${prefs.getInt("top_score", -1)}
                String ${prefs.getString("str", "codekul")}
        """.trimIndent()

        Log.i("@codekul", prefsDt)
    }
}
