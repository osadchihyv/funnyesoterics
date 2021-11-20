package com.osady.funnyesoterics

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class InfoAdapter(private val infoList: List<String>): RecyclerView.Adapter<InfoViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InfoViewHolder {
val infoItemView=LayoutInflater.from(parent.context).inflate(R.layout.list_item_info, parent, true)
        return InfoViewHolder(infoItemView)
    }

    override fun onBindViewHolder(holder: InfoViewHolder, position: Int) {
val info=infoList[position]
        holder.bind(info)
    }

    override fun getItemCount(): Int {
return infoList.size
    }

}