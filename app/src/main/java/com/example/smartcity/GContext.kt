package com.example.smartcity

import android.app.Application
import android.content.Context
import android.util.Log
import com.example.smartcity.common.*
import com.example.smartcity.models.LoginResponse
import com.example.smartcity.models.NetResponse
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

    }

    override fun onCreate() {
        super.onCreate()

        context = applicationContext
        CityListLoader.getInstance().loadProData(this)
        Network.baseUrl =Util.baseURL.readText("http://124.93.196.45:10001/")
        loginInfo = Util.loginInfo.readText("").toModel()

        Log.e("TAG", "onCreate: ${Network.baseUrl}", )

    }
}