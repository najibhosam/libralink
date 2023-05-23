package com.example.libralink

import android.media.Ringtone
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)// to detect the icon id
        val navController = findNavController(R.id.fragmentContainerView)// to detect the Fragment id

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment,R.id.messagesFragment,R.id.profileFragment,R.id.optionsFragment))
        setupActionBarWithNavController(navController,appBarConfiguration) // um die titel oben zu stellen

        bottomNavigationView.setupWithNavController(navController)// to marge the bottomNavigationView with fragment

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val AddBooks = AddBooks()
        //val trasaction : FragmentTransaction = supportFragmentManager.beginTransaction()

        when(item.itemId) {
            R.id.miAddBook ->  supportFragmentManager.beginTransaction().apply {
                replace(R.id.main_layout,AddBooks)
                commit()
            }
        }
        return true
    }
}