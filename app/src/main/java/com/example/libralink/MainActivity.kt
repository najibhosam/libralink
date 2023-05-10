package com.example.libralink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
}