package com.example.smartcity.adpater

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.updateLayoutParams
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.smartcity.R
import com.example.smartcity.common.getValue
import com.example.smartcity.common.loadImg
import com.example.smartcity.databinding.ItemV1lineBinding
import com.example.smartcity.models.ServiceModel


class V1Adapter<T:Any>(val datas:List<T>,var imgName:String,var titleName:String): RecyclerView.Adapter<V1Adapter<T>.V1ViewHolder>() {

    inner class V1ViewHolder(bind: ItemV1lineBinding): RecyclerView.ViewHolder(bind.root){
        val img = bind.icon
        val title = bind.text1
    }


    var imgWidth:Int? = null
    var imgHeight:Int? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): V1ViewHolder {
        val bind = ItemV1lineBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        with(bind) {
            icon.updateLayoutParams {
                imgWidth?.let {
                    width = it
                }
                height?.let {
                    height = it
                }
            }
        }
        return V1ViewHolder(bind)
    }

    override fun onBindViewHolder(holder: V1ViewHolder, position: Int) {
        datas[position].getValue(imgName)?.let {
            holder.img.loadImg(it.toString())
        }
        holder.title.text = datas[position].getValue(titleName).toString()
    }

    override fun getItemCount(): Int {
        return datas.size
    }
}



