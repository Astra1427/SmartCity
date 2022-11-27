package com.example.smartcity.ui.activities.metro

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.core.text.buildSpannedString
import androidx.core.text.color
import androidx.core.view.marginTop
import androidx.core.view.setMargins
import androidx.recyclerview.widget.RecyclerView
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.databinding.ActivityMetroMainBinding
import com.example.smartcity.models.GetPressPressIdModel
import com.example.smartcity.models.MetroListModel
import com.example.smartcity.models.MetroRotationListModel
import com.example.smartcity.ui.BaseActivity
import com.example.smartcity.ui.activities.press.PressDetailActivity
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator
import java.awt.font.TextAttribute


class MetroMainActivity : BaseActivity() {
    private lateinit var bind: ActivityMetroMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMetroMainBinding.inflate(layoutInflater)
        setContentView(bind.root)

        initView(true,"城市地铁")
        bind.bannerAdvi.setIndicator(CircleIndicator(this))
            .addBannerLifecycleObserver(this)
            .isAutoLoop(true)
            .setLoopTime(3000)




        with(bind) {
            Apis.get_api_metro_rotation_list.getAsync(onSuc = {
                val response = it.toModel<MetroRotationListModel>()
                if (response?.rows == null) return@getAsync
                bannerAdvi.adapter = object : BannerImageAdapter<MetroRotationListModel.RowsDTO>(response.rows){
                    override fun onBindView(
                        p0: BannerImageHolder?,
                        p1: MetroRotationListModel.RowsDTO?,
                        p2: Int,
                        p3: Int
                    ) {
                        p0?.imageView?.loadImg(p1!!.advImg)
                    }
                }.apply { 
                    setOnBannerListener { any, i ->
                        Apis.get_press_press__id_.replace("{id}",this.getData(i).targetId.toString()).getAsync(onSuc = {
                            val response = it.toModel<GetPressPressIdModel>()
                            if (response?.data == null)return@getAsync
                            this@MetroMainActivity.goto<PressDetailActivity>(){
                                it.putExtra("pressJsonData",response.data.toJson())
                            }
                        })
                    }
                }
            })

            Apis.get_api_metro_list.getAsync(mapOf("currentName" to "建国门"), onSuc = {
                val response = it.toModel<MetroListModel>()
                if (response?.data == null) return@getAsync
                rvLines.adapter = object :BaseListAdapter<MetroListModel.DataDTO>(
                    layoutId = android.R.layout.simple_list_item_2,
                    datas = response.data,
                ){
                    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                        super.onBindViewHolder(holder, position)
                        holder.title.text = buildSpannedString {
                            appendLine(datas[position].lineName)
                            appendLine("下一站："+datas[position].nextStep.name)
                            color(Color.parseColor("#ff99cc00")){
                                appendLine(datas[position].reachTime.toString()+"分钟")
                            }
                        }
                        holder.line2?.let {
                            it.text = "------------------------------------------------------------------------------------------------"
                            it.isSingleLine = true
                            it.setTextColor(Color.GRAY)
                        }
                    }
                }.apply {
                    itemClick ={
                        v,i->
                        this@MetroMainActivity.goto<MetroLineDetailActivity>(){
                            Log.e(TAG, "onCreate: ${datas[i].lineId}", )
                            it.putExtra("lineJsonData",datas[i].toJson())
                        }
                    }
                }
            })
        }
    }
}