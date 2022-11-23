package com.example.smartcity

import android.os.Bundle
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.postAsync
import com.example.smartcity.databinding.ActivityLoginBinding
import com.example.smartcity.models.LoginRequest
import com.example.smartcity.ui.BaseActivity
import com.example.smartcity.ui.activities.RegisterActivity
import com.example.smartcity.ui.fragments.LoginRouteEvent
import org.greenrobot.eventbus.EventBus

class LoginActivity : BaseActivity() {
    private lateinit var bind: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        bind = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(bind.root)

        with(bind) {
            btnLogin.setOnClickListener {sender->

                if (txtUserName.text.isNullOrEmpty() || txtPwd.text.isNullOrEmpty())
                {
                    this@LoginActivity.msg("请输入用户名和密码")
                    return@setOnClickListener
                }


                Apis.post_api_login.postAsync(onSuc = {
                    GContext.loginInfo = it.toModel()
                    GContext.loginInfo.let {
                        if (it?.code != 200){
                            sender.msgSnack("登陆失败：\n${it?.msg}")
                            return@postAsync
                        }

                        this@LoginActivity.msg("登陆成功")
                        Util.loginInfo.writeText(it.toJson())
                        this@LoginActivity.finish()

                    }
                }, json = LoginRequest(txtUserName.text.toString(),txtPwd.text.toString()).toJson())
            }


            btnRegister.setOnClickListener {
                this@LoginActivity.goto<RegisterActivity>()
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        EventBus.getDefault().post(LoginRouteEvent(true))
    }
}