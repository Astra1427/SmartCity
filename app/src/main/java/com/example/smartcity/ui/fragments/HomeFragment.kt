package com.example.smartcity.ui.fragments

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Html
import android.util.Log
import android.view.*
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.*
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.databinding.FragmentHomeBinding
import com.example.smartcity.models.GetPressPressIdModel
import com.example.smartcity.models.PressListModel
import com.example.smartcity.models.RotationListModel
import com.example.smartcity.models.RotationListModel.RowsDTO
import com.example.smartcity.models.ServiceModel
import com.example.smartcity.ui.JumpTabEvent
import com.example.smartcity.ui.activities.metro.MetroMainActivity
import com.example.smartcity.ui.activities.press.PressDetailActivity
import com.example.smartcity.ui.activities.press.SearchPressResultActivity
import com.example.smartcity.ui.home.CityPickerActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.lljjcoder.style.citythreelist.CityBean
import com.lljjcoder.style.citythreelist.ProvinceActivity
import com.youth.banner.adapter.BannerAdapter
import com.youth.banner.adapter.BannerImageAdapter
import com.youth.banner.holder.BannerImageHolder
import com.youth.banner.indicator.CircleIndicator
import com.youth.banner.listener.OnBannerListener
import org.greenrobot.eventbus.EventBus

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    private var localPress: PressListModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _bind = FragmentHomeBinding.inflate(layoutInflater)
        return bind.root

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == ProvinceActivity.RESULT_DATA){
            if (resultCode == Activity.RESULT_OK){
                if (data == null ) return
                val province = data.getParcelableExtra<CityBean>("province")
                val city = data.getParcelableExtra<CityBean>("city")
                city?.let {
                    bind.txtLocation.text = it.name
                    Util.locationCity.writeText(it.name)
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val d1 = resources.getDimension(R.dimen.d1).toInt()


        // set searchText Return event

        Log.e(TAG, "onViewCreated: txtSearch${bind.txtSearch == null}")
        bind.txtSearch?.setOnKeyListener { v, keyCode, event ->
            Log.e(TAG, "onViewCreated: ${event.keyCode} ||| $keyCode")

            if (event != null && KeyEvent.KEYCODE_ENTER == event.keyCode && event.action == KeyEvent.ACTION_UP){
                //goto search result page
                this.requireActivity().goto<SearchPressResultActivity>(){
                    it.putExtra("searchWord",bind.txtSearch?.text.toString())
                }

                true
            }
            false
        }

        //load title bar data

        bind.txtLocation.text = Util.locationCity.readText("佳木斯市")
        bind.layoutLocation.setOnClickListener {
            val inten = Intent(this.requireActivity(),CityPickerActivity::class.java)
            startActivityForResult(inten,ProvinceActivity.RESULT_DATA)
        }

        // load banenr

        
        Apis.get_api_rotation_list.getAsync(mapOf("type" to 2),
            onSuc = {
                this@HomeFragment.requireActivity().runOnUiThread{
                    GContext.rotationListModel = it.toModel<RotationListModel>()

                    /*val adapter = HomeBannerAdapter(this@HomeFragment.requireContext(), GContext.rotationListModel!!.rows)
                    adapter.itemClick = {
                        GContext.context.msg(it.targetId.toString())
                    }*/
                    bind.bannerHome.setAdapter(object:BannerImageAdapter<RowsDTO>(GContext.rotationListModel!!.rows){
                        override fun onBindView(
                            p0: BannerImageHolder?,
                            p1: RowsDTO?,
                            p2: Int,
                            p3: Int
                        ) {
                            if (p1 == null)return
                            p0!!.imageView.scaleType = ImageView.ScaleType.CENTER_CROP
                            Glide.with(p0!!.imageView!!.context).load(Network.baseUrl+ p1?.advImg).into(p0!!.imageView)
                        }
                    })
                        .setIndicator(CircleIndicator(this@HomeFragment.activity))
                        .addBannerLifecycleObserver(this@HomeFragment.activity)
                        .setOnBannerListener(object :OnBannerListener<RowsDTO>{
                            override fun OnBannerClick(p0: RowsDTO?, p1: Int) {
                                GContext.context.msg(p0?.targetId.toString())
                                Apis.get_press_press__id_.replace("{id}",p0?.id.toString()).getAsync(onSuc = {result->
                                    val response =  result.toModel<GetPressPressIdModel>()
                                    this@HomeFragment.requireActivity().goto<PressDetailActivity>{
                                        it.putExtra("pressJsonData",response?.data.toJson())
                                    }
                                })


                            }
                        })

                }
            }
        )

        // load service list
        Apis.get_api_service_list.getAsync(onSuc = {
            this@HomeFragment.requireActivity().runOnUiThread{
                GContext.serviceModel = it.toModel<ServiceModel>()
                val allS = ServiceModel.RowsDTO()
                allS.imgUrl = GContext.serviceModel!!.rows[10].imgUrl
                allS.serviceName = "全部服务"
                val layoutM = bind.rvServices.layoutManager as GridLayoutManager
                val showServices = GContext.serviceModel!!.rows.take(layoutM.spanCount*2 - 1).sortedBy { it.sort }.toMutableList()
                showServices.add(allS)
//                bind.rvServices.adapter = ServiceListAdapter(showServices)
                bind.rvServices.adapter = object:BaseListAdapter<ServiceModel.RowsDTO>(R.layout.item_v1line,
                    datas = showServices,
                    imgHeight =  d1 * 60,
                    imgWidth = d1 * 60,
                    imgName = "imgUrl",
                    titleName = "serviceName"
                ){
                    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                        super.onBindViewHolder(holder, position)
                        holder.title.ellipsize = null
                        holder.title.textSize = 13f
                        holder.title.gravity = Gravity.CENTER_HORIZONTAL
                    }
                }
                    .apply {
                        itemClick = {s,i->
                            when (datas[i].serviceName) {
                                "全部服务" -> { EventBus.getDefault().post(JumpTabEvent(1))  }
                                "城市地铁" -> this@HomeFragment.requireActivity().goto<MetroMainActivity>()
                                else -> {}
                            }



                        }
                    }
            }
        })

//        load hots

        Apis.get_press_press_list.getAsync(mapOf("hot" to "Y"),
            onSuc = {
                GContext.hotPressListModel = it.toModel()

                this.requireActivity().runOnUiThread{
                    bind.rvHots.adapter = BaseListAdapter<PressListModel.RowsDTO>(R.layout.item_v1line,GContext.hotPressListModel!!.rows,
                        imgName = "cover", titleName = "title",
                        imgWidth = d1 * 130,
                        imgHeight = d1 * 150,
                    ).apply {
                        itemClick={v,i->
                            this@HomeFragment.requireActivity().goto<PressDetailActivity>{
                                it.putExtra("pressId",datas[i].id)
                                it.putExtra("pressJsonData",datas[i].toJson())
                            }
                        }
                    }
                }
        })
//        load tab layout

        val activ = this.requireActivity()

        Apis.get_press_category_list.getAsync(onSuc = { it ->
            GContext.pressCatogoryModel = it.toModel()
            activ.runOnUiThread {
                GContext.pressCatogoryModel?.rows?.forEach {m->
                    bind.tabNews.addTab(bind.tabNews.newTab().setText(m.name).setTag(m.id))
                }
            }
        })




        bind.rvNews.isNestedScrollingEnabled  =false
        bind.tabNews.addOnTabSelectedListener(object:OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                //
                Apis.get_press_press_list.getAsync(mapOf("type" to tab?.tag.toString()), onSuc = {
                    localPress = it.toModel<PressListModel>()
//                    val model = press!!.rows!!.first().publishDate
                    bind.rvNews.adapter = null
                    Log.e("TAG", "onTabSelected: ${localPress!!.rows.size}", )

                    bind.rvNews.adapter = object:BaseListAdapter<PressListModel.RowsDTO>(R.layout.item_v3line,
                        localPress!!.rows,
                        oddLayoutId=R.layout.item_h3line,
                        imgWidth = d1*200,
                        imgHeight = d1*150,
                        imgName = "cover",
                        titleName = "title",
                        oddImgWidth = d1 * 100,
                        oddImgHeight = d1 * 170,
                        isCardView =  true

                    ){
                        override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                            super.onBindViewHolder(holder, position)
                            with(holder) {
                                line2?.text = Html.fromHtml(datas[position].content,Html.FROM_HTML_SEPARATOR_LINE_BREAK_PARAGRAPH)
                                line3?.text = "评论数:${datas[position].commentNum}        ${datas[position].publishDate}"
                            }
                        }
                    }.apply {
                        itemClick = {v,i->
                            this@HomeFragment.requireActivity().goto<PressDetailActivity>{
                                it.putExtra("pressId",datas[i].id)
                                it.putExtra("pressJsonData",datas[i].toJson())
                            }
                        }
                    }
                })
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })


//        load news
    }


    class HomeBannerAdapter(val context: Context, val datas:List<RotationListModel.RowsDTO>):BannerAdapter<RotationListModel.RowsDTO,HomeBannerAdapter.ViewHolder>(datas){
        inner class ViewHolder(img: ImageView):RecyclerView.ViewHolder(img){
            val imgView = img
            init {
                imgView.setOnClickListener {
                    itemClick.invoke(datas[adapterPosition])
                }
            }
        }

        var itemClick :(RowsDTO)->Unit = {}

        override fun onCreateHolder(p0: ViewGroup?, p1: Int): ViewHolder {
            val img = ImageView(context)
            return ViewHolder(img)

        }
        override fun onBindView(p0: ViewHolder?, p1: RotationListModel.RowsDTO?, p2: Int, p3: Int) {
            /*p0!!.imgView.apply {
                scaleType = ImageView.ScaleType.CENTER_CROP
                updateLayoutParams {
                    width = RecyclerView.LayoutParams.MATCH_PARENT
                    height = RecyclerView.LayoutParams.MATCH_PARENT
                }
            }*/
            Glide.with(p0!!.imgView.context).load(p1!!.advImg).into(p0.imgView)

        }
    }

}