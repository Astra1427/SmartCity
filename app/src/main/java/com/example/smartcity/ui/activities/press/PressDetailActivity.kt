package com.example.smartcity.ui.activities.press

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.LevelListDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.smartcity.GContext
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.databinding.ActivityPressDetailBinding
import com.example.smartcity.models.PressCommentListModel
import com.example.smartcity.models.PressListModel
import com.example.smartcity.ui.BaseActivity
import java.io.File
import java.io.FileReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.URL
import java.net.URLConnection

class PressDetailActivity : BaseActivity() {
    private lateinit var bind: ActivityPressDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityPressDetailBinding.inflate(layoutInflater)
        setContentView(bind.root)

        initView(true,"新闻详情")
        val pressId = intent.getIntExtra("pressId",0)

        val pressModel = intent.getStringExtra("pressJsonData")?.toModel<PressListModel.RowsDTO>()

        if (pressModel == null){
            this.alertMsg("获取新闻信息失败！")
            return
        }
        with(bind) {
            txtTitle.text = pressModel.title


            val imageGetter1 = object:Html.ImageGetter{
                override fun getDrawable(source: String?): Drawable {
                    val drawable = LevelListDrawable()
                    val bUrl = if (source!!.contains("http")) "" else Network.baseUrl
                    Glide.with(this@PressDetailActivity)
                        .asBitmap()
                        .load(bUrl + source)
                        .into(object: SimpleTarget<Bitmap>() {
                            override fun onResourceReady(p0: Bitmap, p1: Transition<in Bitmap>?) {
                                if (p0 == null) return
                                p0.getScaledHeight(4)
                                p0.getScaledWidth(4)
                                val bitmapDrawable = BitmapDrawable(p0)
                                drawable.addLevel(1,1,bitmapDrawable)
                                drawable.setBounds(0,0,p0.width*2,p0.height*2)

                                drawable.level = 1
                                txtContent.invalidate()
                                txtContent.text = txtContent.text
                            }
                        })
                    return drawable
                }
            }

            val imageGetter2 = Html.ImageGetter { source ->
                val drawable = LevelListDrawable()
                Glide.with(this@PressDetailActivity)
                    .asDrawable()
                    .load((if(source!!.contains("http")) "" else Network.baseUrl) + source)
                    .into(object:SimpleTarget<Drawable>(){
                        override fun onResourceReady(
                            p0: Drawable,
                            p1: Transition<in Drawable>?
                        ) {

                            drawable.addLevel(1,1,p0)
                            drawable.setBounds(0,0,p0.intrinsicWidth*2,p0.intrinsicHeight*2)

                            drawable.level = 1
                            txtContent.invalidate()
                            txtContent.text = txtContent.text
                        }
                    })
                return@ImageGetter drawable
            }

            txtContent.text = Html.fromHtml(pressModel.content+"<img src='https://profile-avatar.csdnimg.cn/d4b90ea1957f45139b11ffda5011c252_weixin_34273481.jpg'><img src='https://profile-avatar.csdnimg.cn/d4b90ea1957f45139b11ffda5011c252_weixin_34273481.jpg'>",
            imageGetter2,null)
            imgCover.loadImg(pressModel.cover)

            Apis.get_press_comments_list.getAsync(heads = mapOf("Authorization" to GContext.loginInfo?.token.toString()), args = mapOf("newsId" to pressModel.id), onSuc = {
                val response = it.toModel<PressCommentListModel>()
                if (response?.rows == null){
                    return@getAsync
                }
                val rows = response.rows
/*
                rvComments.adapter = object :BaseListAdapter<PressCommentListModel.RowsDTO>(){

                }*/



            })
        }
    }
}