package com.saturnpro.movieproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val topAppBar :  MaterialToolbar= findViewById(R.id.topAppBar)
        topAppBar?.setOnMenuItemClickListener() {
            when (it.itemId) {
                R.id.settings -> {
                    Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
        val bottomAppBar : BottomNavigationView= findViewById(R.id.bottom_navigation)
        bottomAppBar.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.favorites -> {
                    Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, "Посмотреть похже", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.selections -> {
                    Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }

    fun clickMenu(view: View) {
        Toast.makeText(this, "Меню", Toast.LENGTH_SHORT)
    }
    fun clickFavorite(view: View) {
        Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT)
    }
    fun clickSeeLater(view: View) {
        Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT)
    }
    fun clickChoice(view: View) {
        Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT)
    }
    fun clickSettings(view: View) {
        Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT)
    }

}

private fun AppBarLayout.setOnMenuOnItemClickListener(function: () -> Unit) {

}
