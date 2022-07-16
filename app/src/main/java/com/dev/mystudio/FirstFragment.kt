package com.dev.mystudio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.dev.mystudio.databinding.FragmentFirstBinding
class FirstFragment : Fragment() {

   lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

       binding = FragmentFirstBinding.inflate(inflater,container,false)

        var manager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        binding.rvList.layoutManager = manager
        var list = createList()
        var adapter = MyAdapter(requireContext()!!,list)
        binding.rvList.adapter = adapter

        return binding.root

    }

    private fun createList() : List<MyData>{
        var list = ArrayList<MyData>()
        var data = MyData("Sanjeev","9781630062")
        list.add(data)

         data = MyData("john","1234555558")
        list.add(data)

         data = MyData("Andrew","97883766433")
         list.add(data)

         data = MyData("Max","959595958585")
        list.add(data)

         data = MyData("Raj","575757575775")
        list.add(data)

         data = MyData("Nasela","94848484884")

        list.add(data)


        return list
    }

}