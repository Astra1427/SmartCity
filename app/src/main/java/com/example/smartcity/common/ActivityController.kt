package com.example.smartcity.common


import com.example.smartcity.ui.BaseActivity
import com.google.gson.reflect.TypeToken

object ActivityController {

    val activities :ArrayList<BaseActivity> = ArrayList()

    inline fun<reified T:BaseActivity> findT(): BaseActivity? {
        return activities.firstOrNull{
            it is T
        }
    }

    fun BaseActivity.add(){
        activities.add(this)
    }

    fun BaseActivity.remove(){
        activities.remove(this)
    }

    fun finishAll(){
        activities.forEach {
            it.finish()
        }
    }

    fun getTop():BaseActivity{
        return activities.last()
    }

}