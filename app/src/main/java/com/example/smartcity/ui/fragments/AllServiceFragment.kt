package com.example.smartcity.ui.fragments

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.adpater.BaseListAdapter
import com.example.smartcity.common.Apis
import com.example.smartcity.common.Network.getAsync
import com.example.smartcity.common.msg
import com.example.smartcity.common.toModel
import com.example.smartcity.databinding.FragmentAllServiceBinding
import com.example.smartcity.models.ServiceModel

class AllServiceFragment:BaseFragment<FragmentAllServiceBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _bind = FragmentAllServiceBinding.inflate(layoutInflater)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    var isReady = false
    override fun onResume() {
        super.onResume()
        if (isReady) return
        val d1 = resources.getDimension(R.dimen.d1).toInt()
        with(bind) {

            if (GContext.serviceModel == null){
                Apis.get_api_service_list.getAsync(onSuc = {
                    GContext.serviceModel = it.toModel()
                }, onFail = {
                    return@getAsync
                })

            }
            Log.e("TAG", "onViewCreated: allservice ${GContext.serviceModel == null}", )


            if (GContext.serviceModel == null) return


            val serviceTypes = GContext.serviceModel!!.rows.groupBy { x->x.serviceType }.map { x->x.key.toString() }

            Log.e("TAG", "onViewCreated: typeCount:${serviceTypes.size}", )
            rvServiceTypes.adapter = object:BaseListAdapter<String>(android.R.layout.simple_list_item_1,
                datas = serviceTypes,
                imgWidth = RecyclerView.LayoutParams.MATCH_PARENT,
                imgHeight = d1,
                onlyTitle = true
            ){

                override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {

                    return BaseViewHolder(LayoutInflater.from(parent.context).inflate(layoutId,parent,false))
                }

                override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
                    super.onBindViewHolder(holder, position)
                    Log.e("TAG", "onBindViewHolder: 123123$position", )

                    /*holder.title.updateLayoutParams {
                        width = RecyclerView.LayoutParams.MATCH_PARENT
                        height= d1 * 50
                    }*/
                    if (currentItemIndex == position){
                        holder.itemView.setBackgroundColor(Color.WHITE)
                    }else{
                        holder.itemView.setBackgroundColor(Color.TRANSPARENT)
                    }

                }
            }.apply {
                itemClick = {s,i->
                    currentItemIndex = i
                    notifyDataSetChanged()

                    //load services
                    rvSelectedServices.adapter = null
                    rvSelectedServices.adapter = BaseListAdapter<ServiceModel.RowsDTO>(
                        layoutId = R.layout.item_v1line,
                        datas=GContext.serviceModel!!.rows.filter { x->x.serviceType == this.datas[i] },
                        titleName = "serviceName",
                        imgName = "imgUrl",
                        imgWidth = d1 * 70,
                        imgHeight =  d1 * 70

                    ).apply {
                        itemClick = { sender,posi ->
                            GContext.context.msg("You clicked ${this@apply.datas[posi].serviceName}")
                        }
                    }
                }
            }

            rvSelectedServices.adapter = BaseListAdapter<ServiceModel.RowsDTO>(
                layoutId = R.layout.item_v1line,
                datas=GContext.serviceModel!!.rows.filter { x->x.serviceType == serviceTypes[0] },
                titleName = "serviceName",
                imgName = "imgUrl",
                imgWidth = d1 * 70,
                imgHeight =  d1 * 70

            ).apply {
                itemClick = { sender,posi ->
                    GContext.context.msg("You clicked ${this@apply.datas[posi].serviceName}")
                }
            }


        }
        isReady = true
    }
}