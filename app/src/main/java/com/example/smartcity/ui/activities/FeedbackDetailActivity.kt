package com.example.smartcity.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartcity.databinding.ActivityFeedbackDetailBinding
import com.example.smartcity.ui.BaseActivity

class FeedbackDetailActivity : BaseActivity() {
    private lateinit var bind: ActivityFeedbackDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityFeedbackDetailBinding.inflate(layoutInflater)
        setContentView(bind.root)
        initView(true,"反馈详情")
        with(bind) {
            lTitle.text = intent.getStringExtra("feedTitle")
            lContent.text = intent.getStringExtra("feedContent")
            lUserName.text = intent.getStringExtra("feedUserName")
        }
    }
}