package com.example.smartcity.ui.home

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.children
import androidx.core.view.isVisible
import com.example.smartcity.R
import com.lljjcoder.style.citylist.utils.CityListLoader
import com.lljjcoder.style.citythreelist.CityBean
import com.lljjcoder.style.citythreelist.ProvinceActivity

class CityPickerActivity: ProvinceActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<LinearLayout>(R.id.hotsCityContainer).isVisible = true
        val cityList = CityListLoader.getInstance().proListData

        findViewById<LinearLayout>(R.id.hotCitiesLayout).children.forEach {v->
            v.setOnClickListener { sender ->
                if (sender is TextView){
                    val cityName = sender.text.toString() +"市"

                    val currentCity = cityList.firstOrNull{
                        it.cityList.any{x->x.name == cityName }
                    }

                    val province:CityBean = CityBean().apply {
                        name = currentCity?.name
                        id = currentCity?.id
                    }
                    val city = CityBean().apply {
                        currentCity?.cityList?.firstOrNull { x->x.name == cityName }.also {
                            name = it?.name
                            id = it?.id
                        }
                    }
                    val inten = Intent().apply {
                        putExtra("province",province)
                        putExtra("city",city)
                    }
                    this.setResult(RESULT_OK,inten)
                    this.finish()
                }

            }

        }

    }
}