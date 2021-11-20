package com.osady.funnyesoterics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InfoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val infoList: List<String> =listOf("Скачивайте приложения OSADY", "Веселый гороскоп", "Занимательные гадания", "Забавные предсказания")
        val view = inflater.inflate(R.layout.fragment_info, container, true)
        val infoRecycleView: RecyclerView = view.findViewById(R.id.info_recycle_view)
        infoRecycleView.layoutManager =
            LinearLayoutManager(view.context, LinearLayoutManager.VERTICAL, false)
        infoRecycleView.adapter = InfoAdapter(infoList)
        return view
    }
}
