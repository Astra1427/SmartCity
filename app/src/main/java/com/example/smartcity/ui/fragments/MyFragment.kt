package  com.example.smartcity.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.example.smartcity.GContext
import com.example.smartcity.LoginActivity
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.databinding.FragmentMyBinding
import com.example.smartcity.models.LoginResponse
import okhttp3.internal.ignoreIoExceptions
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class MyFragment: BaseFragment<FragmentMyBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _bind = FragmentMyBinding.inflate(layoutInflater)

        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        EventBus.getDefault().register(this)

        bind.btnLogin.setOnClickListener {
            this.requireActivity().goto<LoginActivity>()
        }

        bind.btnLogout.setOnClickListener {
            GContext.loginInfo = null
            GContext.loggedUser = null
            Util.loginInfo.writeText("")
            this.requireActivity().goto<LoginActivity>()
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }

    var isLoginBack = false
    @Subscribe(threadMode = ThreadMode.POSTING, sticky = true, priority = 2)
    fun gotoLoginPage(loginInfo: LoginRouteEvent){
        Log.e("TAG", "gotoLoginPage: $loginInfo.isLoginBack", )
        isLoginBack = loginInfo.isLoginBack
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG", "onResume: $isLoginBack", )

        if (!isLoginBack)
        {
            bind.btnLogout.isVisible = false
            bind.btnLogin.isVisible = true
            bind.layoutTabItems.isVisible = false

            if ( GContext.loginInfo == null){
                this.requireActivity().goto<LoginActivity>()
                return
            }
            if (GContext.loginInfo?.code!=200){
                bind.root.msgSnack("登陆失败：\n${GContext.loginInfo?.msg}")
                this.requireActivity().goto<LoginActivity>()
                return
            }
        }


        //load user info
        if (GContext.loginInfo == null) {
            bind.btnLogout.isVisible = false
            bind.btnLogin.isVisible = true
            bind.layoutTabItems.isVisible = false
            bind.text1.text = "请登录"
            return
        }


        if (GContext.loggedUser?.user == null){

            Apis.get_api_common_user_getInfo.getAsync(heads = mapOf("Authorization" to GContext.loginInfo!!.token), onSuc = {
                GContext.loggedUser = it.toModel()
                if (GContext.loggedUser?.user == null){
                    this.requireActivity().msg("获取用户信息失败！请检查网络连接是否正常")
                    return@getAsync
                }

                loadUserInfo()
            })
            return
        }
        loadUserInfo()


    }

    fun loadUserInfo(){
        bind.btnLogout.isVisible = true
        bind.btnLogin.isVisible = false
        bind.layoutTabItems.isVisible = true
        isLoginBack = false
        val user = GContext.loggedUser!!.user
        with(bind) {
            text1.text = user.userName
            icon.loadImg(user.avatar)
        }
    }
}

class LoginRouteEvent(val isLoginBack:Boolean)