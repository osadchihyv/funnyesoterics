package com.osady.funnyesoterics

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InfoViewHolder (itemView:View) : RecyclerView.ViewHolder(itemView) {
    fun bind(info:String){
        val infoTextView: TextView =itemView.findViewById(R.id.info_recycle_view)
        infoTextView.text=info
    }
}