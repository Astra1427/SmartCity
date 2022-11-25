package com.example.smartcity.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.AbsSpinner
import android.widget.EditText
import androidx.core.view.allViews
import com.example.smartcity.GContext
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.putAsync
import com.example.smartcity.databinding.ActivityPasswordModifyBinding
import com.example.smartcity.models.NetResponse
import com.example.smartcity.ui.BaseActivity

class PasswordModifyActivity : BaseActivity() {
    private lateinit var bind: ActivityPasswordModifyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityPasswordModifyBinding.inflate(layoutInflater)
        setContentView(bind.root)

        initView(true,"修改密码")

        with(bind) {
            btnConfirm.setOnClickListener {
                if (this.root.allViews.filter { x->x is EditText }.map { x->x as EditText }.toList().checkTextIsEmpty(true)){
                    return@setOnClickListener
                }

                if (txtPwd.text.toString()  != txtConfirmPwd.text.toString()){
                    this@PasswordModifyActivity.msg("二次密码不一致")
                    return@setOnClickListener
                }

                val requestJson = mapOf("newPassword" to txtPwd.text.toString(),"oldPassword" to txtOldPwd.text.toString()).toJson()
                Apis.put_api_common_user_resetPwd.putAsync(json = requestJson, token = GContext.loginInfo?.token, onSuc = {
                    val response =  it.toModel<NetResponse>()
                    if (response?.code != 200){
                        this@PasswordModifyActivity.msg(Msg.Failed + response?.msg)
                        Log.e(TAG, "onCreate: ${response?.msg}", )
                        return@putAsync
                    }
                    this@PasswordModifyActivity.msg(Msg.Success)
                })
            }
        }
    }
}