package com.example.smartcity.ui.home

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyboardShortcutGroup
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.common.msg
import com.example.smartcity.databinding.ActivityPinCityBinding
import com.example.smartcity.ui.BaseActivity
import com.lljjcoder.Interface.OnCityItemClickListener
import com.lljjcoder.bean.CityBean
import com.lljjcoder.bean.DistrictBean
import com.lljjcoder.bean.ProvinceBean
import com.lljjcoder.citywheel.CityConfig
import com.lljjcoder.style.cityjd.ProvinceAdapter
import com.lljjcoder.style.citylist.utils.CityListLoader
import com.lljjcoder.style.citypickerview.CityPickerView
import com.lljjcoder.style.citythreelist.ProvinceActivity

class PinCityActivity : BaseActivity() {
    private lateinit var bind: ActivityPinCityBinding

    val cityPicker = CityPickerView()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityPinCityBinding.inflate(layoutInflater)

        setContentView(bind.root)

        cityPicker.init(this)

        cityPicker.setConfig(
            CityConfig
                .Builder()
                .build()
        )

        /*.title("选择城市")
                .titleTextSize(18)
                .titleTextColor("#000")*/

        cityPicker.setOnCityItemClickListener(object:OnCityItemClickListener(){
            override fun onSelected(
                province: ProvinceBean?,
                city: CityBean?,
                district: DistrictBean?
            ) {
                super.onSelected(province, city, district)
                this@PinCityActivity.msg("${province?.name} - ${city?.name} - ${district?.name}")
            }

            override fun onCancel() {
                this@PinCityActivity.msg("取消")
            }
        })
        bind.btnShowCity.setOnClickListener {

//            cityPicker.showCityPicker()

            val inten = Intent(this,ProvinceActivity::class.java)

            startActivityForResult(inten,ProvinceActivity.RESULT_DATA)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ProvinceActivity.RESULT_DATA){
            if (resultCode == RESULT_OK){
                if (data == null) return

                val province = data.getParcelableExtra<com.lljjcoder.style.citythreelist.CityBean>("province")
                val city = data.getParcelableExtra<com.lljjcoder.style.citythreelist.CityBean>("city")
                val area = data.getParcelableExtra<com.lljjcoder.style.citythreelist.CityBean>("area")

                Log.e("TAG", "onActivityResult: ${province?.name} ${city?.name} ${area?.name}" )


            }
        }
    }
}