package com.example.smartcity.ui.activities.parking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.buildSpannedString
import com.example.smartcity.R
import com.example.smartcity.common.ActivityController.add
import com.example.smartcity.common.loadImg
import com.example.smartcity.common.msg
import com.example.smartcity.common.toModel
import com.example.smartcity.databinding.ActivityParkDetailBinding
import com.example.smartcity.models.ParkLotListModel
import com.example.smartcity.ui.BaseActivity

class ParkDetailActivity : BaseActivity() {
    private lateinit var bind: ActivityParkDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityParkDetailBinding.inflate(layoutInflater)
        setContentView(bind.root)
        initView(true,"停车详情")
        val model = intent.getStringExtra("jsonData")?.toModel<ParkLotListModel.RowsDTO>()
        if (model == null){
            "数据丢失！".msg()
            return
        }
        with(bind) {
            lTitle.text = model.parkName
            imgPark.loadImg(model.imgUrl)
            lParkInfo.text = buildSpannedString {
                appendLine(model.address)
                appendLine("距离你"+ model.distance+"m")
                appendLine(if(model.open == "Y") "对外开放" else "不对外开放")
                appendLine("${model.rates}元/小时  最高${model.priceCaps}元/天")
            }
        }
    }
}