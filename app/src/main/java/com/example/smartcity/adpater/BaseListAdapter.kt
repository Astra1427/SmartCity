package com.example.smartcity.adpater

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.setMargins
import androidx.core.view.setPadding
import androidx.core.view.updateLayoutParams
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.smartcity.GContext
import com.example.smartcity.R
import com.example.smartcity.common.getValue
import com.example.smartcity.common.isSame
import com.example.smartcity.common.loadImg
import com.google.android.material.card.MaterialCardView

open class BaseListAdapter<T:Any>(val layoutId:Int, val datas:MutableList<T>,
                                      val imgName:String? = null,
                                      val titleName:String = "this",
                                      val line2Name:String? = null,
                                      val line3Name:String? = null,
                                      val imgWidth:Int? = RecyclerView.LayoutParams.WRAP_CONTENT,
                                      val imgHeight:Int? = RecyclerView.LayoutParams.WRAP_CONTENT,
                                      val oddLayoutId:Int? = null,
                                      val oddImgWidth:Int? = 0,
                                      val oddImgHeight:Int? = 0,
                                      val isCardView:Boolean =false,
                                      val onlyTitle:Boolean = false,
                                  val isAutoLoadMore:Boolean = false
):
    RecyclerView.Adapter<BaseListAdapter<T>.BaseViewHolder>(){
    open inner class BaseViewHolder(view: View): RecyclerView.ViewHolder(view){
        var img: ImageView? = view.findViewById(R.id.icon)
        var title: TextView = if(onlyTitle)  view as TextView else (view.findViewById(R.id.text1) ?: view.findViewById(android.R.id.text1))
        var line2: TextView? = view.findViewById(R.id.text2) ?: view.findViewById(android.R.id.text2)
        var line3: TextView? = view.findViewById(R.id.text3)
        init {
            itemView.setOnClickListener {
                itemClick.invoke(it,adapterPosition)

            }
        }
    }

    var currentItemIndex:Int = 0

    var itemClick:(View,Int)->Unit = {s,i->}
    var loadMore:()->Unit = {}

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)

        if (!isAutoLoadMore) return

        recyclerView.addOnScrollListener(object:RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val lastIndex = when (recyclerView.layoutManager) {
                    is LinearLayoutManager -> {(recyclerView.layoutManager as LinearLayoutManager).findLastVisibleItemPosition()}
                    is GridLayoutManager -> {(recyclerView.layoutManager as GridLayoutManager).findLastVisibleItemPosition()}
                    is StaggeredGridLayoutManager -> {
                        val manager = (recyclerView.layoutManager as StaggeredGridLayoutManager)
                        manager.findLastVisibleItemPositions(IntArray(manager.spanCount)).max()
                    }
                    else -> -2
                }
                if (lastIndex+1 == datas.size){
                    loadMore.invoke()
                }
            }
        })
    }

    override fun getItemViewType(position: Int): Int {
        return if(position % 2 == 0) 0 else 1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {


        val isOddView = (oddLayoutId!= null && viewType == 1)
        val tempView = LayoutInflater.from(parent.context).inflate(
            if(isOddView)
                oddLayoutId!!
            else layoutId,parent,false)

        val itemView = if (onlyTitle){
            tempView as TextView
        }else{
            tempView
        }

        Log.e("TAG", "onCreateViewHolder itemView == null: ${itemView == null}", )

        val img = itemView.findViewById<ImageView>(R.id.icon)
        img?.let {
            it.updateLayoutParams {
                imgWidth?.let {
                    this.width = if(isOddView) oddImgWidth!! else imgWidth!!
                }
                imgHeight?.let {
                    this.height = if (isOddView) oddImgHeight!! else imgHeight!!
                }
            }
        }
        if (isCardView){
            val cardView = MaterialCardView(parent.context).apply {
                layoutDirection = View.LAYOUT_DIRECTION_LTR
                layoutParams = LinearLayout.LayoutParams(RecyclerView.LayoutParams.MATCH_PARENT,RecyclerView.LayoutParams.WRAP_CONTENT).apply {
//                    setMargins(0,20,0,30)
                    setMargins(GContext.d1 * 10)
                }
                radius = GContext.d1*20f
                elevation = 20f
            }
            cardView.addView(itemView)
            return BaseViewHolder(cardView)
        }
        return BaseViewHolder(itemView)

    }
    fun fillLine23(holder: BaseViewHolder){
        with(holder) {
            line2?.text = datas[adapterPosition].getValue(line2Name).toString()
            line3?.text = datas[adapterPosition].getValue(line3Name).toString()
        }
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {

        holder.img?.let {
            datas[position].getValue(imgName)?.let {
                url->it.loadImg(url.toString())
            }
        }


        holder.title.text = if(titleName == "this")
                                datas[position].toString()
                            else
                                datas[position].getValue(titleName)?.toString()


    }


    override fun getItemCount(): Int {
        return datas.size
    }
}


class BaseDiffCallback<T:Any>:DiffUtil.ItemCallback<T>(){
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return true
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {

        return oldItem.isSame(newItem)
    }

}


