package com.example.smartcity

import android.app.Application
import android.content.Context
import android.graphics.Color
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.smartcity.common.*
import com.example.smartcity.models.LoginResponse
import com.example.smartcity.models.PinCity
import com.example.smartcity.models.PressCatogoryModel
import com.example.smartcity.models.PressListModel
import com.example.smartcity.models.RotationListModel
import com.example.smartcity.models.ServiceModel
import com.example.smartcity.models.UserInfoModel
import com.lljjcoder.style.citylist.utils.CityListLoader

class GContext:Application() {
    companion object{
        lateinit var context: Context

        val pinCity: PinCity by lazy { R.raw.p_city.readFile().toModel()!! }
        var rotationListModel: RotationListModel? = null
        var serviceModel: ServiceModel? = null
        var hotPressListModel: PressListModel? = null
        var pressCatogoryModel: PressCatogoryModel? = null


        var loginInfo:LoginResponse? = null

        var loggedUser:UserInfoModel? = null
        val d1:Int by lazy {GContext.context.resources.getDimension(R.dimen.d1).toInt()}
        const val match_parent = RecyclerView.LayoutParams.MATCH_PARENT
        const val wrap_content = RecyclerView.LayoutParams.WRAP_CONTENT

        var lightGreen = Color.parseColor("#ff99cc00")
        var lightBlue = Color.parseColor("#ff33b5e5")
    }

    override fun onCreate() {
        super.onCreate()

        context = applicationContext
        CityListLoader.getInstance().loadProData(this)
        Network.baseUrl =Util.baseURL.readText("http://124.93.196.45:10001/")
        loginInfo = Util.loginInfo.readText("").toModel()

        Log.e("TAG", "onCreate: ${Network.baseUrl}", )
        repeat(20){
            keys.add("dd$it")
        }

    }
}