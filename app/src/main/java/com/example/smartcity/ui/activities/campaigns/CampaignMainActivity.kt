package com.example.smartcity.ui.activities.campaigns

import android.graphics.drawable.Drawable
import android.graphics.drawable.LevelListDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.databinding.ActivityCampaignMainBinding
import com.example.smartcity.models.ActivityCategoryListModel
import com.example.smartcity.models.ActivityListIdModel
import com.example.smartcity.models.ActivityListModel
import com.example.smartcity.models.ActivityRotationListModel
import com.example.smartcity.ui.BaseActivity
import com.example.smartcity.ui.activities.press.PressDetailActivity
import com.google.android.material.tabs.TabLayout
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator

class CampaignMainActivity : BaseActivity() {
    private lateinit var bind: ActivityCampaignMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityCampaignMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        initView(true,"活动管理")
        Apis.get_api_activity_rotation_list.getAsync(onSuc = {
            val result = it.toModel<ActivityRotationListModel>()
            if (result?.rows == null || result.rows.isNullOrEmpty())
                return@getAsync

            bind.bannerCampaign.setIndicator(CircleIndicator(this))
                .addBannerLifecycleObserver(this)
                .setLoopTime(3000)

            bind.bannerCampaign.adapter =object: BannerImageAdapter<ActivityRotationListModel.RowsDTO>(result.rows){
                override fun onBindView(
                    p0: BannerImageHolder?,
                    p1: ActivityRotationListModel.RowsDTO?,
                    p2: Int,
                    p3: Int
                ) {
                    p0?.imageView?.loadImg(p1?.advImg)
                }
            }.apply { 
                setOnBannerListener { any, i ->

                    Apis.get_api_activity_activity__id_.replace("{id}",getData(i).targetId.toString()).getAsync(onSuc = {result->
                        val model = result.toModel<ActivityListIdModel>()

                        this@CampaignMainActivity.goto<CampaignDetailActivity>{
                            it.putExtra("jsonData",model?.data.toJson())
                        }

                    })

                }
            }

            with(bind) {
                Apis.get_api_activity_category_list.getAsync(onSuc = {
                    val result = it.toModel<ActivityCategoryListModel>()
                    if (result?.data == null || result.data.isNullOrEmpty())
                        return@getAsync
                    result.data.sortedBy { x->x.sort }.forEach {
                        tabCampaignCategories.addTab(
                            tabCampaignCategories.newTab().apply {
                                text = it.name
                                val dl = LevelListDrawable()
                                Glide.with(this@CampaignMainActivity).asDrawable().load(
                                    Network.baseUrl+it.imgUrl).into(object:SimpleTarget<Drawable>(){
                                    override fun onResourceReady(
                                        p0: Drawable,
                                        p1: Transition<in Drawable>?
                                    ) {
                                        dl.addLevel(1,1,p0)
                                        dl.setBounds(0,0,p0.intrinsicWidth,p0.intrinsicHeight)
                                        dl.level = 1
                                    }
                                })
                                icon = dl
                                tag = it.id
                            }
                        )
                    }
                })

                tabCampaignCategories.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
                    override fun onTabSelected(tab: TabLayout.Tab?) {
                        Apis.get_api_activity_activity_list.getAsync(mapOf("categoryId" to tab?.tag.toString()), onSuc = {
                            val result = it.toModel<ActivityListModel>()
                            if (result?.rows == null || result.rows.isNullOrEmpty())
                                return@getAsync
                            rvCampaigns.adapter = object:BaseListAdapter<ActivityListModel.RowsDTO>(
                                layoutId = R.layout.item_v3line,
                                datas = result.rows,
                                imgHeight = GContext.d1 * 100,
                                imgWidth = RecyclerView.LayoutParams.MATCH_PARENT,
                                oddLayoutId = R.layout.item_h3line,
                                oddImgWidth = GContext.d1 * 100,
                                oddImgHeight = GContext.d1 * 150,
                                isCardView = true,
                                imgName = "imgUrl"
                            ){
                                override fun onBindViewHolder(
                                    holder: BaseViewHolder,
                                    position: Int
                                ) {
                                    super.onBindViewHolder(holder, position)
                                    with(holder) {
                                        title.text = datas[position].name
                                        line2?.text = Html.fromHtml(datas[position].content)
                                        line3?.text = "点赞数：${datas[position].likeNum}       报名人数：${datas[position].signupNum}"
                                    }
                                }
                            }
                                .apply {
                                    itemClick = {
                                            v,i->
                                        this@CampaignMainActivity.goto<CampaignDetailActivity>(){
                                            it.putExtra("jsonData",datas[i].toJson())
                                        }
                                    }
                                }

                        })
                    }

                    override fun onTabUnselected(tab: TabLayout.Tab?) {
                    }

                    override fun onTabReselected(tab: TabLayout.Tab?) {
                    }

                })
            }
        })
    }
}