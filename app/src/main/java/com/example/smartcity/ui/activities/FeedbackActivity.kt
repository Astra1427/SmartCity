package com.example.smartcity.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smartcity.GContext
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.postAsync
import com.example.smartcity.databinding.ActivityFeedbackBinding
import com.example.smartcity.models.NetResponse
import com.example.smartcity.ui.BaseActivity

class FeedbackActivity : BaseActivity() {
    private lateinit var bind: ActivityFeedbackBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityFeedbackBinding.inflate(layoutInflater)
        setContentView(bind.root)
        initView(true,"意见反馈")
        with(bind) {
            btnSubmit.setOnClickListener {
                if (bind.root.checkTextIsEmpty(true)){
                    return@setOnClickListener
                }
                val json = mapOf("content" to txtContent.text.toString(),"title" to txtTitle.text.toString()).toJson()
                Apis.post_api_common_feedback.postAsync(json=json,token=GContext.loginInfo?.token?.toString(),
                onSuc = {
                    val response = it.toModel<NetResponse>()
                    this@FeedbackActivity.msg(response?.msg.toString())
                })
            }
        }
    }
}