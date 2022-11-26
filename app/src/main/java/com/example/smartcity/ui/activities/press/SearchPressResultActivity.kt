package com.example.smartcity.ui.activities.press

import android.os.Bundle
import android.text.Html
import android.view.KeyEvent
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.databinding.ActivitySearchPressResultBinding
import com.example.smartcity.models.PressListModel
import com.example.smartcity.ui.BaseActivity

class SearchPressResultActivity : BaseActivity() {
    private lateinit var bind: ActivitySearchPressResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivitySearchPressResultBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val searchWord = intent.getStringExtra("searchWord")

        initView(true,"新闻搜索")

        bind.txtSearch.setText(searchWord)
        searchPress()

        bind.txtSearch.setOnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP){
                searchPress()
                true
            }
            false
        }
    }

    fun searchPress(){
        if (bind.txtSearch.text.isNullOrEmpty()){
            this.msg("请输入搜索内容")
            return
        }
        val d1 = resources.getDimension(R.dimen.d1).toInt()

        Apis.get_press_press_list.getAsync(mapOf("title" to bind.txtSearch.text.toString()), onSuc = {
            val press = it.toModel<PressListModel>()
            if (press?.rows == null) return@getAsync
            press.rows.first().title
            bind.rvNews.adapter = null
            bind.rvNews.adapter = object:BaseListAdapter<PressListModel.RowsDTO>(
                layoutId = R.layout.item_v3line,
                datas = press.rows,
                imgName="cover",
                imgWidth = d1 * 200,
                imgHeight = d1 * 120,
                oddLayoutId = R.layout.item_h3line,
                oddImgWidth = d1 * 120,
                oddImgHeight = d1 * 200,
                isCardView = true,
                titleName = "title"
            ){
                override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                    super.onBindViewHolder(holder, position)
                    holder.line2?.text = Html.fromHtml(datas[position].content)
                    holder.line3?.text = "评论数：${datas[position].commentNum}       ${datas[position].publishDate}"
                }
            }.apply {
                itemClick={
                        v,i->
                    this@SearchPressResultActivity.goto<PressDetailActivity>(){
                        it.putExtra("pressJsonData",datas[i].toJson())
                    }
                }

            }.also {
                bind.txtSearch.isFocusable = true
            }

        })
    }
}