package com.example.smartcity.adpater

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.smartcity.common.Network
import com.example.smartcity.common.Util
import com.example.smartcity.databinding.ItemServiceListBinding
import com.example.smartcity.models.ServiceModel

class ServiceListAdapter(val datas:List<ServiceModel.RowsDTO>):RecyclerView.Adapter<ServiceListAdapter.ViewHolder>() {
    inner class ViewHolder(bind:ItemServiceListBinding):RecyclerView.ViewHolder(bind.root){
        val img = bind.imgService
        val txtName = bind.txtServiceName
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val holder = ViewHolder(ItemServiceListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(holder.img.context).load(Network.baseUrl+ datas[position].imgUrl).into(holder.img)
        holder.txtName.text = datas[position].serviceName
    }

    override fun getItemCount(): Int {
        return datas.size
    }
}