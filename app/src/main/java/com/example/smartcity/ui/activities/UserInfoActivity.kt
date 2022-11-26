package com.example.smartcity.ui.activities

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.allViews
import androidx.core.view.isVisible
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


        initView(true,"个人信息")


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

            txtPhone.setText(user.phonenumber.substring(0,7).padEnd(11,'*'))
            txtIDCard.setText(user.idCard.substring(0,6).padEnd(18,'*'))
            txtEmail.setText(user.email)
        }
        setViews(false)



        with(bind) {
            btnModify.setOnClickListener {
                setViews(true)
            }

            btnSave.setOnClickListener{
                if (bind.root.allViews.filter{x->x is  TextView}.map { it as TextView }.toList().checkTextIsEmpty(true)){
                    return@setOnClickListener
                }
                if (txtPhone.text.length != 11)
                {
                    this@UserInfoActivity.buildAlertShow("请输入11位手机号")
                    return@setOnClickListener
                }

                if (txtIDCard.text.length != 18){
                    this@UserInfoActivity.buildAlertShow("请输入18为身份证号")
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
                    setViews(false)
                },
                    token=GContext.loginInfo?.token,
                    json = requestModel.toJson() )
            }
        }
    }

    fun setViews(isModify:Boolean){
        with(bind) {
            txtNickName.isEnabled = isModify
            txtEmail.isEnabled = isModify
            txtPhone.isEnabled = isModify
            txtIDCard.isEnabled = isModify
            rbMale.isEnabled = isModify
            rbFemale.isEnabled = isModify
            val user = GContext.loggedUser!!.user

            if (isModify){
                btnModify.visibility = View.GONE
                btnSave.isVisible = true
                txtPhone.setText(user.phonenumber)
                txtIDCard.setText(user.idCard)

            }else{
                btnModify.visibility = View.VISIBLE
                btnSave.isVisible = false
                txtPhone.setText(user.phonenumber.substring(0,7).padEnd(11,'*'))
                txtIDCard.setText(user.idCard.substring(0,6).padEnd(18,'*'))

            }

        }
    }
}