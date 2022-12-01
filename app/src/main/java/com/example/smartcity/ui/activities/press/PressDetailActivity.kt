package com.example.smartcity.ui.activities.press

import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.LevelListDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.core.text.buildSpannedString
import androidx.core.view.updateLayoutParams
import com.bumptech.glide.Glide
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.*
import com.example.smartcity.common.ActivityController.add
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
        var pressModel :PressListModel.RowsDTO? = null

        pressModel = intent.getStringExtra("pressJsonData")?.toModel<PressListModel.RowsDTO>()



        if (pressModel == null){
            this@PressDetailActivity.alertMsg("获取新闻信息失败！")
            return
        }

        with(bind) {

            val pressModel = pressModel!!

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

            txtContent.text = Html.fromHtml(pressModel.content,
            imageGetter2,null)
            pressModel.cover?.let {
                imgCover.loadImg(it)
            }

            Apis.get_press_comments_list.getAsync(heads = mapOf("Authorization" to GContext.loginInfo?.token.toString()), args = mapOf("newsId" to pressModel.id), onSuc = {
                val response = it.toModel<PressCommentListModel>()
                if (response?.rows == null){
                    return@getAsync
                }
                val rows = response.rows

                rvComments.adapter = object :BaseListAdapter<PressCommentListModel.RowsDTO>(layoutId = android.R.layout.simple_list_item_2,
                datas = rows,
                ){
                    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                        super.onBindViewHolder(holder, position)

                        holder.title.text = buildSpannedString {
                            appendLine(datas[position].userName)
                            appendLine(datas[position].content ?: "")
                            appendLine("支持："+datas[position].likeNum.toString() + " ".repeat(10)+datas[position].commentDate)
                        }
                        holder.line2?.let{
                            it.updateLayoutParams {
                                height = 2
                            }
                            it.setBackgroundColor(Color.BLACK)
                        }

                    }
                }



            })
        }
    }
}