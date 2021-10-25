package com.charlie.naversearch

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.charlie.naversearch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.toolbar.setTitleTextColor(Color.WHITE)

        setSupportActionBar(binding.toolbar)


        NavigationUI.setupWithNavController(binding.bottomNav, findNavController(R.id.host_nav))
    }
}