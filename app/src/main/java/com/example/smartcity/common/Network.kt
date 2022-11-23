package com.example.smartcity.common

import android.util.Log
import com.example.smartcity.GContext
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException

object Network {

    //http://124.93.196.45:10001//prod-api/api/login
    var baseUrl:String? = null

    val client = OkHttpClient()


    const val success_code = 200
    const val failed_code = 500

    fun String.getAsync(args:Map<String,Any?>?=null, onSuc: (String) -> Unit={}, onFail: ((Exception) -> Unit)? = null, heads: Map<String,String>?=null){
        var getArgs = "?"
        args?.forEach {
            if (it.value  != null)
                getArgs += "&${it.key}=${it.value}"
        }

        val request = Request.Builder().url(baseUrl+this+getArgs).apply {
            heads?.forEach {
                addHeader(it.key,it.value)
            }
        }.build()
        Log.d(this, "getAsync: ${baseUrl+this+getArgs}")

        sendRequest(request,onSuc,onFail)
    }

    fun String.postAsync(onSuc: (String) -> Unit, onFail: ((Exception) -> Unit)? = null, token:String? = null,json:String){
        val media = "application/json".toMediaTypeOrNull()!!

        val requestBody = json.toRequestBody(media)
        val reqeust = Request.Builder()
            .post(requestBody)
            .url(baseUrl+this)
            .apply {
                token?.let{
                    addHeader("Authorization",it)
                }
            }.build()
        sendRequest(reqeust,onSuc,onFail)
    }




    private fun sendRequest(request: Request, onSuc: (String) -> Unit={}, onFail: ((Exception) -> Unit)?={GContext.context.msg("网络异常")}){
        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                ActivityController.getTop().runOnUiThread {
                    Log.e("TAG", "onFailure: ${call.request().url}", e)
                    onFail?.invoke(e)
                }
            }

            override fun onResponse(call: Call, response: Response) {
                val result = response.body?.string()

                ActivityController.getTop().runOnUiThread {
                    if (result == null){
                        //operation success! but no result
                        //...
                        Log.w("sendRequest", "onResponse: Success! but no result" )
                    }else if(result.contains("\"code\": 401")){
                        //goto login page
//                    ActivityController.getTop().goto<LoginActivity>()
                    }else{
                        onSuc.invoke(result)
                    }
                }
            }

        })
    }


}
