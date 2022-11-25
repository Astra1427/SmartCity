package com.example.smartcity.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.text.buildSpannedString
import androidx.core.text.color
import androidx.core.text.scale
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.Apis
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.common.goto
import com.example.smartcity.common.toModel
import com.example.smartcity.databinding.ActivityFeedbackLogBinding
import com.example.smartcity.models.CommonFeedBackModel
import com.example.smartcity.ui.BaseActivity

class FeedbackLogActivity : BaseActivity() {
    private lateinit var bind: ActivityFeedbackLogBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityFeedbackLogBinding.inflate(layoutInflater)
        setContentView(bind.root)

        initView(true,"意见反馈历史")



        with(bind) {
            Apis.get_api_common_feedback_list.getAsync(heads= mapOf("Authorization" to GContext.loginInfo?.token.toString()),
            onSuc = {

                val response = it.toModel<CommonFeedBackModel>()!!

                Log.e(TAG, "onCreate: ${response.rows.size}", )
                rvLogs.adapter = object:BaseListAdapter<CommonFeedBackModel.RowsDTO>(layoutId = R.layout.item_onlyone,
                    datas = response.rows,
                    isCardView = true
                ){
                    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                        super.onBindViewHolder(holder, position)
                        holder.title.text = buildSpannedString {
                            appendLine("")
                            scale(1.5f){
                                append(datas[position].title)
                            }
                            appendLine("")
                            append(if(datas[position].content.length < 20) datas[position].content else datas[position].content.substring(0,20)+"...")
                            appendLine("")
                        }
                    }
                }.apply {
                    itemClick = {sender,position->
                        this@FeedbackLogActivity.goto<FeedbackDetailActivity> {
                            it.putExtra("feedTitle",datas[position].title)
                            it.putExtra("feedContent",datas[position].content)
                            it.putExtra("feedUserName",GContext.loggedUser?.user?.userName.toString())
                        }
                    }
                }
            })
        }
    }
}