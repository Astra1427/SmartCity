package com.example.smartcity.ui.activities.metro

import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.LevelListDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.LayoutInflater
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.databinding.ActivityMetroNoticeBinding
import com.example.smartcity.models.MetroListModel
import com.example.smartcity.models.MetroNoticeListModel
import com.example.smartcity.models.MetroStatementModel
import com.example.smartcity.ui.BaseActivity

class MetroNoticeActivity : BaseActivity() {
    private lateinit var bind: ActivityMetroNoticeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMetroNoticeBinding.inflate(layoutInflater)
        setContentView(bind.root)
        initView(true,"地铁公告")
        with(bind) {
            btnTakeNotice.setOnClickListener {
                alertStatement(1)
            }

            btnTakeCardNotice.setOnClickListener {

                alertStatement(2)

            }

            btnZr.setOnClickListener {
                alertStatement(3)

            }

            // load notices
            Apis.get_api_metro_notice_list.getAsync(onSuc = {
                val result =it.toModel<MetroNoticeListModel>()
                if (result?.rows == null || result.rows.isNullOrEmpty())
                    return@getAsync
                rvNotices.adapter = object:BaseListAdapter<MetroNoticeListModel.RowsDTO>(
                    layoutId =  R.layout.item_onlyone,
                    datas = result.rows.sortedBy { x->x.id }.toMutableList(),
                    isCardView = true,
                ){
                    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                        super.onBindViewHolder(holder, position)
                        holder.title.text = "${position+1}.${datas[position].title}"
                    }
                }.apply {
                    itemClick = {
                        v,i->
//                        this@MetroNoticeActivity.buildAlertShow(Html.fromHtml(datas[i].content,imgGetter,null),datas[i].title)
                        /*this@MetroNoticeActivity.buildAlertShow("",datas[i].title,){
                            val textV = TextView(it.context)
                            textV.text = Html.fromHtml(datas[i].content,textV.getImgGetter(),null)
                            it.setView(textV)
                            it.setPositiveButton("确认"){
                                dialog,position->

                            }
                        }*/
                        this@MetroNoticeActivity.buildAlertShow(Html.fromHtml(datas[i].content),datas[i].title,"确认")
                    }

                }

            })
        }
    }

    fun alertStatement(typeId:Int){
        Apis.get_api_metro_statement.getAsync(mapOf("type" to typeId), onSuc = {
            val result = it.toModel<MetroStatementModel>()
            if (result?.data == null)
                return@getAsync
            this@MetroNoticeActivity.buildAlertShow(Html.fromHtml(result.data.content),result.data.title)
        })
    }


}