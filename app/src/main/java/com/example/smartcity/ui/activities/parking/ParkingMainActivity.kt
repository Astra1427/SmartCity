package com.example.smartcity.ui.activities.parking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.databinding.ActivityParkingMainBinding
import com.example.smartcity.models.ParkLotListModel
import com.example.smartcity.ui.BaseActivity

class ParkingMainActivity : BaseActivity() {
    private var parks: MutableList<ParkLotListModel.RowsDTO> = mutableListOf()
    private  var adapter: BaseListAdapter<ParkLotListModel.RowsDTO>? = null
    private lateinit var bind: ActivityParkingMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityParkingMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        initView(true,"停哪儿")


        with(bind) {
            btnLoadMore.setOnClickListener {
                if(adapter == null){
                    initData()
                    return@setOnClickListener
                }
                adapter?.loadMore?.invoke()
                android.R.layout.list_content
            }

            tbBar.btnIcon1.setImageResource(android.R.drawable.ic_menu_save)

            nestSc.setOnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->

                Log.e(TAG, "setOnScrollChangeListener: $v,$scrollX,$scrollY,$oldScrollX,$oldScrollY", )
                Log.e(TAG, "setOnScrollChangeListener: sub:${nestSc.getChildAt(0).measuredHeight - nestSc.measuredHeight}", )

                if (scrollY == nestSc.getChildAt(0).measuredHeight - nestSc.measuredHeight){
                    //到底了  loadmore
                    //adapter?.loadMore?.invoke()
                }
            }
        }

        initData()
    }

    var pageIndex:Int = 0
    var pageSize:Int = 6
    fun initData(){
        Apis.get_api_park_lot_list.getAsync(args=mapOf("pageIndex" to pageIndex,"pageSize" to pageSize),onSuc = {
            pageIndex = 1
            val result = it.toModel<ParkLotListModel>()
            if (result?.rows == null || result.rows.isNullOrEmpty())
                return@getAsync
            parks = result.rows.sortedBy { x->x.distance }.toMutableList()
            adapter = object:BaseListAdapter<ParkLotListModel.RowsDTO>(
                layoutId = R.layout.item_h3line,
                imgHeight = GContext.match_parent,
                imgWidth = GContext.d1 * 75,
                isCardView = true,
                datas = parks.take(pageSize*2).toMutableList(),
                imgName = "imgUrl",
                isAutoLoadMore = false
            ){
                override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                    super.onBindViewHolder(holder, position)
                    with(holder) {
                        datas[position].let { model->
                            title.text = model.parkName
                            line2?.text = model.address
                            line3?.ellipsize = null
                            line3?.text = "空位：${model.vacancy}   距离：${model.distance}m   费率：${model.rates}"
                        }
                    }
                }
            }.apply {
                itemClick = {
                    v,i->
                    this@ParkingMainActivity.goto<ParkDetailActivity>(){
                        it.putExtra("jsonData",datas[i].toJson())
                    }
                }
                loadMore = {

                    /*Apis.get_api_park_lot_list.getAsync(args=mapOf("pageIndex" to pageIndex,"pageSize" to pageSize),onSuc = {
                        val result1 = it.toModel<ParkLotListModel>()
                        if (result1?.rows == null || result1.rows.isNullOrEmpty())
                        {
                            bind.btnLoadMore.let {
                                it.text = "到底了...".apply {
                                    msg()
                                }
                                it.setBackgroundColor(GContext.lightGreen)
                            }
                            return@getAsync
                        }
                    })*/
                    val ds = parks.filterIndexed { index, rowsDTO -> index+1 > pageIndex*pageSize }.take(pageSize)
                    if (ds.isEmpty()){
                        bind.btnLoadMore.let {
                            it.text = "到底了...".apply {
                                msg()
                            }
                            it.setBackgroundColor(GContext.lightGreen)
                        }
                        bind.progressContainer.isVisible = false
                    }else{
                        adapter?.datas?.addAll(ds)
                        adapter?.notifyItemInserted(adapter?.datas?.size ?: 0)
                        Log.e(TAG, "initData: $pageIndex", )
                        pageIndex.toString().msg()
                        pageIndex++
                    }
                }
                pageIndex++
            }
            bind.rvParks.adapter = adapter

        })


    }


}