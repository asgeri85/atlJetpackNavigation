package com.example.atlandroid2

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.atlandroid2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setBottomBar()
    }

    private fun setBottomBar(){
         val navHostFragment =
             supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

         NavigationUI.setupWithNavController(binding.bottomNavBar,navHostFragment.navController)
    }
}