package com.example.smartcity.ui.activities

import android.graphics.Color
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
import com.example.smartcity.common.msg
import com.example.smartcity.common.toModel
import com.example.smartcity.databinding.ActivityMyOrderListBinding
import com.example.smartcity.models.AllOrderListModel
import com.example.smartcity.ui.BaseActivity

class MyOrderListActivity : BaseActivity() {

    private lateinit var bind: ActivityMyOrderListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        bind = ActivityMyOrderListBinding.inflate(layoutInflater)

        setContentView(bind.root)

        initView(true,"订单列表")

        val d1 = resources.getDimension(R.dimen.d1).toInt()
        //load order list
        Apis.get_api_allorder_list.getAsync(heads = mapOf("Authorization" to GContext.loginInfo?.token.toString()),
            onSuc = {
                val orderListModel = it.toModel<AllOrderListModel>()
                if (orderListModel?.code != 200){

                    this@MyOrderListActivity.msg("获取订单列表失败 ${orderListModel?.msg}")

                    return@getAsync

                }

                Log.e(TAG, "onCreate: ${orderListModel?.rows?.size}", )

                bind.rvOrderList.adapter =object: BaseListAdapter<AllOrderListModel.RowsDTO>(layoutId= R.layout.item_onlyone,
                    datas=orderListModel?.rows!!,
                    titleName = "name",
                    isCardView = true, onlyTitle = false

                ){
                    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

                        with(holder) {
                            title.text = buildSpannedString{
                                color(Color.BLACK){
                                    scale(1.3f){
                                        append(datas[position].name)
                                    }
                                }
                                appendLine("")
                                append(datas[position].orderNo)
                                appendLine("")
                                appendLine(datas[position].orderTypeName)
                                appendLine(datas[position].orderStatus+"     "+(datas[position].payTime ?: ""))
                            }
                        }
                    }
                }.apply {
                    itemClick = {s,i->

                        this@MyOrderListActivity.msg(datas[i].name)
                    }
                }
        })


    }
}