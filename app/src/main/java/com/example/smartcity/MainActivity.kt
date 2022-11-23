package com.example.smartcity

import android.content.Intent
import android.media.Image
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.view.children
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.core.view.updateLayoutParams
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.bumptech.glide.Glide
import com.example.smartcity.common.*
import com.example.smartcity.databinding.ActivityMainBinding
import com.example.smartcity.databinding.ItemWelcomeBinding
import com.example.smartcity.ui.BaseActivity
import com.example.smartcity.ui.NavigationActivity
import com.youth.banner.adapter.BannerAdapter
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.indicator.CircleIndicator
import com.youth.banner.listener.OnPageChangeListener
import kotlin.math.log

class MainActivity : BaseActivity() {
    private lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (Util.sharedPreferences().contains(FirstOpenKey)){
            this.goto<NavigationActivity>()
            finish()
            return
        }

        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)


        with(bind) {

            val networkImgs =  listOf("http://124.93.196.45:10001/prod-api/profile/upload/image/2022/03/14/aa55c97a-201f-4c3c-8434-cae5f5e50f00.png",
                "http://124.93.196.45:10001/prod-api/profile/upload/image/2022/03/14/7c5da30c-bfc0-43a3-af34-8dcb1db55a32.jpeg",
                "http://124.93.196.45:10001/prod-api/profile/upload/image/2022/03/14/bc456d48-c162-4887-9a01-5ed296ef7f8f.jpeg",
                "http://124.93.196.45:10001/prod-api/profile/upload/image/2022/03/14/0f55551f-f299-4fb2-b79d-b58002e97fe0.jpeg",
                "http://124.93.196.45:10001/prod-api/profile/upload/image/2022/03/14/63068fbb-d1d7-4a54-9d6d-7d6b37a59af4.jpeg")

            val localImgs = listOf(R.drawable.banner1
                ,R.drawable.banner2
                ,R.drawable.banner3
                ,R.drawable.banner4
                ,R.drawable.banner5
            )
            val adapter = LocalBanAdapter(localImgs)


            banner.setAdapter(adapter,false)
                .addBannerLifecycleObserver(this@MainActivity)
                .setIndicator(CircleIndicator(this@MainActivity))
                .setCurrentItem(0,false)
                .isAutoLoop(false)
                .addOnPageChangeListener(object :OnPageChangeListener{
                    override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
//                        Log.e("TAG", "onPageScrolled: 1", )
                    }

                    override fun onPageSelected(p0: Int) {
//                        Log.e("TAG", "onPageSelected: 2", )
                    }

                    override fun onPageScrollStateChanged(p0: Int) {
//                        Log.e("TAG", "onPageScrollStateChanged: 3", )
                    }

                })

//            Glide.with(bind.imgTest.context).load("http://124.93.196.45:10001/prod-api/profile/upload/image/2022/03/14/63068fbb-d1d7-4a54-9d6d-7d6b37a59af4.jpeg").into(bind.imgTest)


        }


    }


}

class BanAdapter(val datas : List<String>):
    BannerAdapter<String, BanAdapter.ViewHolder>(datas) {

    inner class ViewHolder(bind: ItemWelcomeBinding):RecyclerView.ViewHolder(bind.root){
        val imgWelcome = bind.imgWelcome
        val btnNetwork = bind.btnNetwork
        val btnGo = bind.btnGo
        init {
            /*if (adapterPosition == datas.size-1){
                btnNetwork.visibility = View.VISIBLE
                btnGo.isInvisible = true
            }*/
        }
    }

    override fun getItemViewType(position: Int): Int {
        Log.e("TAG", "getPosition: $position", )
        if (position == datas.size-1) return 1
        return 0
    }

    override fun onCreateHolder(p0: ViewGroup?, p1: Int): ViewHolder {

        Log.e("TAG", "onCreateHolder: $p1", )
        val holder = ViewHolder(ItemWelcomeBinding.inflate(LayoutInflater.from(p0!!.context),p0,false))
        if (p1 == 1)
        {
            holder.btnGo.updateLayoutParams {
                this.width = RecyclerView.LayoutParams.WRAP_CONTENT
                this.height = RecyclerView.LayoutParams.WRAP_CONTENT
            }
            holder.btnNetwork.updateLayoutParams {
                this.width = RecyclerView.LayoutParams.WRAP_CONTENT
                this.height = RecyclerView.LayoutParams.WRAP_CONTENT
            }
        }

        return holder
    }

    override fun onBindView(holder: ViewHolder?, p1: String?, p2: Int, p3: Int) {



        Glide.with(holder!!.imgWelcome.context).load(datas[p2])
            .into(holder.imgWelcome)

        Log.e("TAG", "onBindView: ${holder.btnNetwork.isVisible}", )
    }

}

class LocalBanAdapter(val datas:List<Int>):BannerAdapter<Int,LocalBanAdapter.ViewHolder>(datas){
    inner class ViewHolder(bind:ItemWelcomeBinding):RecyclerView.ViewHolder(bind.root){
        val imgWelcome = bind.imgWelcome
        val btnNetwork = bind.btnNetwork
        val btnGo = bind.btnGo
        val txtIP = bind.txtIP
        val txtPort = bind.txtPort
        val btnConfirm = bind.btnConfirm
        val btnCancel = bind.btnCancel
        val cardNetwork = bind.cardNetwork
    }

    override fun getItemViewType(position: Int): Int {
        return if(position ==datas.size-1) 1
        else 0
    }

    override fun onCreateHolder(p0: ViewGroup?, p1: Int): ViewHolder {
        val holder = ViewHolder(ItemWelcomeBinding.inflate(LayoutInflater.from(p0!!.context),p0,false))
        with(holder) {
            if (p1 == 1){
                btnGo.setOnClickListener {
                    val welPage = ActivityController.findT<MainActivity>()

                    welPage?.let {
                        it.goto<NavigationActivity>()
                        FirstOpenKey.writeText("Yes")
                    }
                    welPage?.finish()
                    Log.e("TAG", "onCreateHolder: goto${welPage == null}", )
                }
                btnNetwork.setOnClickListener {
                    val url = Uri.parse(Network.baseUrl)
                    holder.txtIP.setText(url.host)
                    holder.txtPort.setText(url.port.toString())
                    holder.cardNetwork.isVisible = true
                }
                btnConfirm.setOnClickListener {
                    with(holder) {
                        if (txtIP.text.isNullOrEmpty() || txtPort.text.isNullOrEmpty()){
                            GContext.context.msg("请输入IP和端口！")
                            return@setOnClickListener
                        }
                        try {
                            val uri = Uri.parse("http://${txtIP.text}:${txtPort.text}")
                            //save ip and port
                            Util.baseURL.writeText(uri.toString())
                            Log.e("TAG", "onCreateHolder: $uri", )
                            Network.baseUrl = uri.toString()
                            GContext.context.msg(Msg.Success)
                        }
                        catch (ex:Exception){
                            GContext.context.msg("请输入格式正确IP地址和端口号！")
                        }
                    }
                }
                btnCancel.setOnClickListener {
                    holder.cardNetwork.isVisible = false
                }
            }else{
                btnNetwork.updateLayoutParams {
                    width = 0
                    height = 0
                }

                btnGo.updateLayoutParams {
                    width = 0
                    height = 0
                }
            }
        }
        return holder
    }

    override fun onBindView(holder: ViewHolder?, p1: Int?, p2: Int, p3: Int) {
        holder!!.imgWelcome.setImageResource(datas[p2])
    }


}