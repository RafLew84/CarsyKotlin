package com.example.carsykotlin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.carsykotlin.R
import com.example.carsykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}