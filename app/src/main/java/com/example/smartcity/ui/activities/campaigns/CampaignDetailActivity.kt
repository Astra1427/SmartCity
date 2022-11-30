package com.example.smartcity.ui.activities.campaigns

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.graphics.drawable.LevelListDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.TextUtils
import androidx.core.text.buildSpannedString
import androidx.core.text.scale
import androidx.core.view.isVisible
import androidx.core.view.updateLayoutParams
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.common.Network.postAsync
import com.example.smartcity.common.Network.success_code
import com.example.smartcity.databinding.ActivityActivityDetailBinding
import com.example.smartcity.databinding.ActivityPressDetailBinding
import com.example.smartcity.models.ActivityCommentListModel
import com.example.smartcity.models.ActivityListIdModel
import com.example.smartcity.models.ActivityListModel
import com.example.smartcity.models.ActivitySignupCheckModel
import com.example.smartcity.models.NetResponse
import com.example.smartcity.ui.BaseActivity
import java.time.LocalDateTime

class CampaignDetailActivity : BaseActivity() {

    var model: ActivityListIdModel.DataDTO? = null
    private lateinit var bind: ActivityActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityActivityDetailBinding.inflate(layoutInflater)
        setContentView(bind.root)

        initView(true,"活动详情")
        model = intent.getStringExtra("jsonData")?.toModel<ActivityListIdModel.DataDTO>()

        if (model == null){
            this.msg("获取数据失败！")
            return
        }
        with(bind) {

            val model = model!!
            txtTitle.text = model.name
            imgCover.loadImg(model.imgUrl)
            txtContent.text = Html.fromHtml(model.content,Html.ImageGetter{
                val ld = LevelListDrawable()
                Glide.with(this@CampaignDetailActivity)
                    .asDrawable()
                    .load((if(it.contains("http") ) it else Network.baseUrl + it))
                    .into(object:SimpleTarget<Drawable>(){
                        override fun onResourceReady(p0: Drawable, p1: Transition<in Drawable>?) {
                            ld.addLevel(1,1,p0)
                            val imgWidth = if(p0.intrinsicWidth*2 > window.windowManager.defaultDisplay.width) window.windowManager.defaultDisplay.width else p0.intrinsicWidth*2
                            ld.setBounds(0,0,imgWidth,p0.intrinsicHeight*2)
                            ld.level = 1
                            txtContent.invalidate()
                            txtContent.text = txtContent.text
                        }
                    })
                ld
            },null)


            Apis.get_api_activity_comment_list.getAsync(mapOf("activityId" to model.id,"pageSize" to 40, "pageNum" to 0), onSuc = {
                val result = it.toModel<ActivityCommentListModel>()
                if (result?.rows == null || result.rows.isNullOrEmpty())
                    return@getAsync
                rvComments.adapter = object:BaseListAdapter<ActivityCommentListModel.RowsDTO>(
                    layoutId = R.layout.item_v2line,
                    datas = result.rows.sortedByDescending { x->x.commentTime },
                ){
                    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                        super.onBindViewHolder(holder, position)
                        with(holder) {
                            holder.title.text = buildSpannedString {
                                scale(1.3f){
                                    appendLine(datas[position].userName)
                                }
                                appendLine(datas[position].content)
                                appendLine(datas[position].commentTime)
                            }
                            holder.title.ellipsize = null
                            holder.title.isSingleLine = false
                            holder.line2?.updateLayoutParams {
                                width = GContext.match_parent
                                height = GContext.d1
                            }
                            holder.line2?.setBackgroundColor(Color.GRAY)
                        }
                    }
                }

            })

            Apis.get_api_activity_activity_list.getAsync(mapOf("recommend" to "Y"), onSuc = {
                val result = it.toModel<ActivityListModel>()
                if (result?.rows == null || result.rows.isNullOrEmpty()){
                    return@getAsync
                }
                rvRecommend.adapter = object:BaseListAdapter<ActivityListModel.RowsDTO>(
                    layoutId = R.layout.item_v3line,
                    datas = if (result.rows.apply { removeIf { x->x.id == model.id } }.size > 3) result.rows.take(3) else result.rows,
                    isCardView = true,
                    imgWidth = GContext.match_parent,
                    imgHeight = GContext.d1 * 100,
                    imgName = "imgUrl"
                ){
                    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                        super.onBindViewHolder(holder, position)
                        with(holder) {
                            title.text = datas[position].name
                            line2?.text = Html.fromHtml(datas[position].content)
                            line3?.text = "点赞数：${datas[position].likeNum}       报名人数：${datas[position].signupNum}"
                        }
                    }
                }.apply {
                    itemClick = {
                        v,i->
                        this@CampaignDetailActivity.goto<CampaignDetailActivity>(){
                            it.putExtra("jsonData",datas[i].toJson())
                        }
                    }
                }
            })

            btnJoin.setOnClickListener {
                if (btnJoin.text == "已报名"){
                    this@CampaignDetailActivity.msg("您已成功报名该活动，无需重复报名")
                    return@setOnClickListener
                }

//                {
//                    "activityId": 1
//                }
                Apis.post_api_activity_signup.postAsync(token = GContext.loginInfo!!.token,
                    json = mapOf("activityId" to model.id).toJson(),
                    onSuc = {
                        val result = it.toModel<NetResponse>()
                        this@CampaignDetailActivity.msg(result?.msg.toString())
                        if (result?.msg == "操作成功"){
                            btnJoin.text = "已报名"
                            btnJoin.setBackgroundColor(GContext.lightGreen)
                        }
                })
            }
        }
    }

    override fun onResume() {
        super.onResume()
        with(bind) {
            //check signup
            Apis.get_api_activity_signup_check.getAsync(mapOf("activityId" to model!!.id), heads = mapOf("Authorization" to GContext.loginInfo!!.token), onSuc = {
                val result = it.toModel<ActivitySignupCheckModel>()
                if (result?.isSignup == true)
                {
                    btnJoin.text = "已报名"
                    btnJoin.setBackgroundColor(GContext.lightGreen)
                }
            })
        }
    }
}