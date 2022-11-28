package com.example.smartcity.ui.activities.metro

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.cardview.widget.CardView
import androidx.core.text.buildSpannedString
import androidx.core.text.color
import androidx.core.text.scale
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.Apis
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.common.msg
import com.example.smartcity.common.toModel
import com.example.smartcity.databinding.ActivityMetroLineDetailBinding
import com.example.smartcity.models.GetMetroLineIdModel
import com.example.smartcity.models.GetMetroLineModel
import com.example.smartcity.models.MetroListModel
import com.example.smartcity.ui.BaseActivity


class MetroLineDetailActivity : BaseActivity() {
    private lateinit var bind: ActivityMetroLineDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityMetroLineDetailBinding.inflate(layoutInflater)
        setContentView(bind.root)
//        val stationName = intent.getStringExtra("stationName")
//        val lineId = intent.getIntExtra("lineId",0)
        initView(true,"路线信息")

        val metroListDataDTO = intent.getStringExtra("lineJsonData")?.toModel<MetroListModel.DataDTO>()
        if (metroListDataDTO == null)
        {
            this.msg("获取路线信息失败")
            return
        }

        with(bind) {
            Apis.get_api_metro_line.getAsync(mapOf("name" to metroListDataDTO.currentName,"lineIds" to metroListDataDTO.lineId.toString()), onSuc = {
                val response = it.toModel<GetMetroLineModel>()
                if (response?.data == null || response.data.lineList.size == 0) return@getAsync
                val firstLine = response.data.lineList.first()
                layoutTitleBar.tbarTitle.text = firstLine?.name.toString()
                lLineNmae.text = firstLine.name
                lineInfo.text = buildSpannedString {
                    color(Color.BLACK){
                        scale(1.2f){
                            appendLine("${firstLine.first  }  ->  ${firstLine.end}")
                        }
                    }
                    appendLine("始：${firstLine.startTime}   末：${firstLine.endTime}")
                }
                lReachStation.text = metroListDataDTO.nextStep.name
                lReachTime.text = metroListDataDTO.reachTime.toString()+"分钟"
//                lReachM.text = ((1..10).random()*1000).toString() + "米"
            })


            Apis.get_api_metro_line__id_.replace("{id}",metroListDataDTO.lineId.toString()).getAsync(onSuc = {
                val response = it.toModel<GetMetroLineIdModel>()
                if (response?.data == null || response.data.metroStepList.isNullOrEmpty()) return@getAsync
                Log.e(TAG, "length:${response?.data?.metroStepList?.size} --- ${response.data.runStationsName}", )
                lReachM.text = buildSpannedString {
                    appendLine(response.data.km.toString()+"千米")
                    appendLine("剩余"+response.data.stationsNumber.toString().toFloat().toInt()+"站")
                }
                rvStations.adapter =  object : BaseListAdapter<GetMetroLineIdModel.DataDTO.MetroStepListDTO>(
                    layoutId = R.layout.item_metro_station_point,
                    datas = response.data.metroStepList,
                    titleName = "name"
                ){
                    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                        super.onBindViewHolder(holder, position)
                        val model = datas[position]
                        holder.itemView.findViewById<CardView>(R.id.cardActive)?.let {
                            if (model.name == response.data.runStationsName){
                                it.setBackgroundColor(Color.parseColor("#ff33b5e5"))
                                currentItemIndex = position
                            }else{
                                it.setBackgroundColor(Color.WHITE)
                            }
                        }
                    }

                }

            })
        }
    }
}