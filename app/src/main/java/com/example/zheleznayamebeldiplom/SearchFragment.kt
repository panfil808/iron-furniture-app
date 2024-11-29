package com.example.zheleznayamebeldiplom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView.OnQueryTextListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.zheleznayamebeldiplom.Adapters.PopularAdapter
import com.example.zheleznayamebeldiplom.Models.PopularModel
import com.example.zheleznayamebeldiplom.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding
    private lateinit var adapter: PopularAdapter
    private lateinit var list : ArrayList<PopularModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


     binding=  FragmentSearchBinding.inflate(inflater, container, false)
        list = ArrayList()
        list.add(PopularModel(R.drawable.safe1, "Сейф", "3900 p"))
        list.add(PopularModel(R.drawable.safe2, "Aiko T-140 KL", "2500 p"))
        list.add(PopularModel(R.drawable.safe3, "Aiko Чирок 1025", "4700 p"))
        list.add(PopularModel(R.drawable.safe1, "Сейф", "3900 p"))
        list.add(PopularModel(R.drawable.safe2, "Aiko T-140 KL", "2500 p"))
        list.add(PopularModel(R.drawable.safe3, "Aiko Чирок 1025", "4700 p"))
        list.add(PopularModel(R.drawable.safe1, "Сейф", "3900 p"))
        list.add(PopularModel(R.drawable.safe2, "Aiko T-140 KL", "2500 p"))
        list.add(PopularModel(R.drawable.safe3, "Aiko Чирок 1025", "4700 p"))
        list.add(PopularModel(R.drawable.safe1, "Сейф", "3900 p"))
        list.add(PopularModel(R.drawable.safe2, "Aiko T-140 KL", "2500 p"))
        list.add(PopularModel(R.drawable.safe3, "Aiko Чирок 1025", "4700 p"))


        adapter = PopularAdapter(requireContext(),list)

        binding.searchMenuRv.layoutManager = LinearLayoutManager(requireContext())
        binding.searchMenuRv.adapter = adapter


        return binding.root
    }


}




