package com.example.smartcity.ui.activities.metro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.Apis
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.common.msg
import com.example.smartcity.common.toModel
import com.example.smartcity.databinding.ActivityMetroMissingBinding
import com.example.smartcity.models.MetroFoundListModel
import com.example.smartcity.ui.BaseActivity

class MetroMissingActivity : BaseActivity() {
    private lateinit var bind: ActivityMetroMissingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityMetroMissingBinding.inflate(layoutInflater)

        setContentView(bind.root)
        initView(true ,"失物招领")

        with(bind) {

            Apis.get_api_metro_found_list.getAsync(onSuc = {
                val response = it.toModel<MetroFoundListModel>()
                if (response?.data   == null ) return@getAsync
                val dates = response.data.map { x->x.publishDate }.toMutableList()

                spDates.adapter = ArrayAdapter<String>(this@MetroMissingActivity,android.R.layout.simple_list_item_1,dates)

                spDates.prompt = "请选择物品遗失时间"


                spDates.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(
                        parent: AdapterView<*>?,
                        view: View?,
                        position: Int,
                        id: Long
                    ) {
                        this@MetroMissingActivity.msg(dates[position])
                        val datas = response.data.firstOrNull { x->x.publishDate == dates[position] }?.metroFoundList
                        if (datas == null) {
                            this@MetroMissingActivity.msg("当日无数据")
                            return
                        }

                        rvMissing.adapter = object:BaseListAdapter<MetroFoundListModel.DataDTO.MetroFoundListDTO>(
                            layoutId =  R.layout.item_h3line,
                            isCardView = true,
                            datas =datas,
                            imgName = "imgUrl",
                            imgHeight = GContext.d1 * 175,
                            imgWidth = GContext.d1 * 100

                        ){
                            override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                                super.onBindViewHolder(holder, position)
                                holder.title.text = "拾取时间：${datas[position].foundTime}"
                                holder.line2?.text = "拾取地点：${datas[position].foundPlace.replace("\n","")}"
                                holder.line3?.text = "认领地点：${datas[position].claimPlace}"
                            }
                        }
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }

                }
            })

        }

    }
}