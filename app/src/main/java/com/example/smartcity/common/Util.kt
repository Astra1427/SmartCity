package com.example.smartcity.common

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.edit
import androidx.core.view.allViews
import com.bumptech.glide.Glide
import com.example.smartcity.GContext
import com.example.smartcity.ui.BaseActivity
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.InputStreamReader
import kotlin.reflect.KVisibility


const val FirstOpenKey = "FirstOpenKey"

object Util {
    val gson = Gson()
    const val baseURL = "baseUrl"
    const val locationCity = "locationCity"
    const val loginInfo = "loginInfo"

    fun sharedPreferences():SharedPreferences{
        return GContext.context.getSharedPreferences("GContextShare", Context.MODE_PRIVATE)
    }
}

object Msg{
    const val Success = "操作成功！"
    const val Failed = "操作失败！"
}

inline fun<reified T> String.toModel():T?{
    try {
        if (this.isNullOrEmpty()) return null
        return Util.gson.fromJson(this, object:TypeToken<T>(){}.type)
    }
    catch (ex:Exception){
        Log.e("Util", "toModel: $this",ex )
        return null
    }
}
inline fun<reified T> T.toJson():String{
    return Util.gson.toJson(this,object :TypeToken<T>(){}.type)
}

fun Int.readFile(): String {
    return try {
        val file = GContext.context.resources.openRawResource(this)
        val reader =InputStreamReader(file)
        reader.readText()

    }catch (ex:Exception){
        Log.e("Util", "readFile: $this",ex )
        ""
    }
}

fun String.writeText(data:String? = ""){
    Util.sharedPreferences().let {
        it.edit{
            putString(this@writeText,data ?: "")
        }

    }
}


fun String.readText(def:String):String{
    return Util.sharedPreferences().getString(this,def)!!
}

inline fun<reified T:BaseActivity> BaseActivity.goto(map: Map<String,String>? = null){
    val inten = Intent(this,T::class.java).apply {
        map?.forEach{
            putExtra(it.key,it.value)
        }
    }
    startActivity(inten)
}

fun Context.msg( msg:String,showTime:Int = Toast.LENGTH_SHORT){
    Toast.makeText(this,msg,showTime).show()
}
fun View.msgSnack(msg:String, showTime: Int = Snackbar.LENGTH_SHORT, actionText:String ? = null, action:()->Unit={}){
    Snackbar.make(this,msg,showTime).setAction(actionText){
        action.invoke()
    }
}

fun<T:Any> T.isSame(item:T):Boolean{
    val oldString = this.javaClass.declaredFields.map {
        it.isAccessible = true
        it.get(this)
    }.joinToString(",")
    val newString = item.javaClass.declaredFields.map {
        it.isAccessible = true
        it.get(item)
    }.joinToString (",")
    return oldString == newString
}
fun<T:Any> T.getValue(name:String? = null):Any?{
    if (name == null) return ""

    return this.javaClass.declaredFields.firstOrNull {
        it.name == name
    }?.get(this)
}

fun ImageView.loadImg(url:String){
    if (!url.contains(Network.baseUrl!!)){
        Glide.with(this.context).load(Network.baseUrl+url).into(this)
    }else
        Glide.with(this.context).load(url).into(this)
}

inline fun<reified T:BaseActivity> Context.goto(puts:(Intent)->Unit = {}){
    val inten = Intent(this,T::class.java).apply {
        puts.invoke(this)
    }
    startActivity(inten)
}

fun View.checkTextIsEmpty(isMsg:Boolean = false):Boolean{
    this.allViews.forEach {
        if (it is EditText){
            if (it.tag == null && it.text.isNullOrEmpty()){
                if (isMsg){
                    GContext.context.msg("请输入 ${it.hint}")
                }
                return true
            }
        }
    }
    return false
}

fun List<TextView>.checkTextIsEmpty(isMsg:Boolean = false):Boolean{
    this.forEach {
        if (it.tag == null && it.text.isNullOrEmpty()){
            if (isMsg){
                GContext.context.msg("请输入 ${it.hint}")
            }
            return true
        }
    }
    return false
}