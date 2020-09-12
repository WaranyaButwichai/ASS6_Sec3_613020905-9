package com.example.ass6_sec3_613020905_9

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.fragment_two.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction().add(R.id.framelayout, OneFragment()).commit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu, menu)
        return super.onCreateOptionsMenu(menu)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.icon1 -> {
                supportFragmentManager.beginTransaction().add(R.id.framelayout, TwoFragment())
                    .commit()
            }
            R.id.icon2 -> {
                supportFragmentManager.beginTransaction().add(R.id.framelayout, ThreeFragment())
                    .commit()
            }
        }

        return super.onOptionsItemSelected(item)
    }
}

