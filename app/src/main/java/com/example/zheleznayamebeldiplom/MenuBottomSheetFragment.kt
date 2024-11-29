package com.example.zheleznayamebeldiplom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.zheleznayamebeldiplom.Adapters.PopularAdapter
import com.example.zheleznayamebeldiplom.Models.PopularModel
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MenuBottomSheetFragment : BottomSheetDialogFragment() {

 private lateinit var adapter : PopularAdapter
 private lateinit var menuList : ArrayList<PopularModel>
 private lateinit var menuRV : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_menu_bottom_sheet, container, false)

        menuList = ArrayList()
        menuList.add(PopularModel(R.drawable.safe1, "Сейф", "3900 p"))
        menuList.add(PopularModel(R.drawable.safe2, "Aiko T-140 KL", "2500 p"))
        menuList.add(PopularModel(R.drawable.safe3, "Aiko Чирок 1025", "4700 p"))
        menuList.add(PopularModel(R.drawable.safe1, "Сейф", "3900 p"))
        menuList.add(PopularModel(R.drawable.safe2, "Aiko T-140 KL", "2500 p"))
        menuList.add(PopularModel(R.drawable.safe3, "Aiko Чирок 1025", "4700 p"))
        menuList.add(PopularModel(R.drawable.safe1, "Сейф", "3900 p"))
        menuList.add(PopularModel(R.drawable.safe2, "Aiko T-140 KL", "2500 p"))
        menuList.add(PopularModel(R.drawable.safe3, "Aiko Чирок 1025", "4700 p"))
        menuList.add(PopularModel(R.drawable.safe1, "Сейф", "3900 p"))
        menuList.add(PopularModel(R.drawable.safe2, "Aiko T-140 KL", "2500 p"))
        menuList.add(PopularModel(R.drawable.safe3, "Aiko Чирок 1025", "4700 p"))

        adapter = PopularAdapter(requireContext(),menuList)
        menuRV = view.findViewById(R.id.menu_RV)
        menuRV.layoutManager = LinearLayoutManager(requireContext())
        menuRV.adapter = adapter
        return view
    }


}