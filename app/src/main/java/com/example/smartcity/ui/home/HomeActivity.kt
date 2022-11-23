package com.example.smartcity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartcity.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var bind: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityHomeBinding .inflate(layoutInflater)
        setContentView(bind.root)



    }
}