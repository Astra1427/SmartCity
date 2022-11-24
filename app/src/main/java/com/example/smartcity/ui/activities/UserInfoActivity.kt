package com.example.smartcity.ui.activities

import android.os.Bundle
import android.widget.TextView
import androidx.core.view.allViews
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.putAsync
import com.example.smartcity.databinding.ActivityUserInfoBinding
import com.example.smartcity.models.NetResponse
import com.example.smartcity.models.PutCommonUserRequest
import com.example.smartcity.ui.BaseActivity
import kotlin.coroutines.Continuation

class UserInfoActivity : BaseActivity() {
    private lateinit var bind: ActivityUserInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityUserInfoBinding.inflate(layoutInflater)
        setContentView(bind.root)




        with(bind) {

            layoutTitle.btnBack.setOnClickListener {
                this@UserInfoActivity.finish()
            }

            if (GContext.loggedUser == null) {
                this@UserInfoActivity.finish().also {
                    ActivityController.getTop().msg("登录信息失效")
                }
                return
            }

            val user = GContext.loggedUser!!.user

            txtNickName.setText(user.nickName)
            rbMale.isChecked = true
            rbFemale.isChecked = user.sex != "0"
            txtPhone.setText(user.phonenumber)
            txtIDCard.setText(user.idCard)
            txtEmail.setText(user.email)
        }



        with(bind) {
            btnModify.setOnClickListener {

                if (bind.root.allViews.filter{x->x is  TextView}.map { it as TextView }.toList().checkTextIsEmpty(true)){
                    return@setOnClickListener
                }

                val requestModel = PutCommonUserRequest(txtEmail.text.toString(),txtIDCard.text.toString(),txtNickName.text.toString(),txtPhone.text.toString(),if(rbMale.isChecked) "0" else "1")
                Apis.put_api_common_user.putAsync(onSuc = {
                    val response = it.toModel<NetResponse>()
                    if (response?.code != 200){
                        this@UserInfoActivity.msg(Msg.Failed+response?.msg)
                        return@putAsync
                    }
                    this@UserInfoActivity.msg(Msg.Success)
                    GContext.loggedUser!!.user.let {
                        it.nickName = requestModel.nickName
                        it.sex = requestModel.sex
                        it.phonenumber = requestModel.phonenumber
                        it.idCard = requestModel.idCard
                        it.email = requestModel.email
                    }
                },
                    token=GContext.loginInfo?.token,
                    json = requestModel.toJson() )
            }
        }
    }
}