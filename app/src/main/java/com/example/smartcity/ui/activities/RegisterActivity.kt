package com.example.smartcity.ui.activities

import android.os.Bundle
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.postAsync
import com.example.smartcity.databinding.ActivityRegisterBinding
import com.example.smartcity.models.NetResponse
import com.example.smartcity.models.RegisterRequest
import com.example.smartcity.ui.BaseActivity

class RegisterActivity : BaseActivity() {
    private lateinit var bind: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(bind.root)
        with(bind) {
            btnRegister.setOnClickListener {sender->
                if (layoutRegister.checkTextIsEmpty(true)){
                    return@setOnClickListener
                }
                if (txtPwd.text.toString() != txtConfirmPwd.text.toString())
                {
                    this@RegisterActivity.msg("二次密码不一致！")
                    return@setOnClickListener
                }

                Apis.post_api_register.postAsync(onSuc = {
                     val response = it.toModel<NetResponse>()
                    if (response?.code != 200){
                        sender.msgSnack("注册失败: \n${response?.msg}")
                        this@RegisterActivity.msg("注册失败！${response?.msg}")
                        return@postAsync
                    }
                    this@RegisterActivity.msg("注册成功")
                    this@RegisterActivity.finish()
                }, json = RegisterRequest("/profile/2020/10/26/27e7fd58-0972-4dbf-941c-590624e6a886.png",txtUserName.text.toString(),txtNickName.text.toString(),txtPwd.text.toString(),txtPhone.text.toString(),if(rbMale.isChecked) "0" else "1",txtEmail.text.toString(),txtIDCard.text.toString()).toJson())
            }
        }
    }
}