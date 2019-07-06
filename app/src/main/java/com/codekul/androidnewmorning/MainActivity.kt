package com.codekul.androidnewmorning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    lateinit var fragOne: OneFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(TwoFragment())

        fragOne = supportFragmentManager.findFragmentById(R.id.fragment) as OneFragment
    }

    fun loadFragment(frag: Fragment) {
        val txn = supportFragmentManager.beginTransaction()
        txn.replace(R.id.frame, frag)
        txn.commit()
    }

    fun nowChangeImage(wh: Int) {
        Log.i("@codekul", "Activity Received Image Change event")
        fragOne.onImgChange(wh)
    }
}
