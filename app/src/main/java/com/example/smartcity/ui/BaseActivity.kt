package com.example.smartcity.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smartcity.common.ActivityController.add
import com.example.smartcity.common.ActivityController.remove

open class BaseActivity:AppCompatActivity() {

//    lateinit var bind:T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        this.add()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.remove()
    }

}