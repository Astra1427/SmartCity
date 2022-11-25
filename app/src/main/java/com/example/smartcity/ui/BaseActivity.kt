package com.example.smartcity.ui

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.smartcity.R
import com.example.smartcity.common.ActivityController.add
import com.example.smartcity.common.ActivityController.remove

open class BaseActivity:AppCompatActivity() {

//    lateinit var bind:T

    val TAG = this.javaClass.simpleName
    val btnBack: ImageView? by lazy { findViewById<ImageView>(R.id.btnBack) }
    val tbarTitle: TextView? by lazy { findViewById<TextView>(R.id.tbarTitle) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.add()


    }

    fun initView(isBackButton:Boolean = false,title:String = TAG){
        btnBack?.setOnClickListener {
            this.finish()
        }
        btnBack?.isVisible = isBackButton
        tbarTitle?.text = title
    }

    override fun onDestroy() {
        super.onDestroy()
        this.remove()
    }

}