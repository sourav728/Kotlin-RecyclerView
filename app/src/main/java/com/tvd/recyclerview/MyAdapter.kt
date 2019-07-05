package com.tvd.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_row_item.view.*

class MyAdapter (private val cricketer_name_list: List<String>, private val context:Context): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun getItemCount(): Int {
        return cricketer_name_list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.list_row_item,parent,false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binditems(cricketer_name_list[position])
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun binditems(cricketer_name_list: String){
            itemView.android_name_text_view.text = cricketer_name_list
        }
    }

}