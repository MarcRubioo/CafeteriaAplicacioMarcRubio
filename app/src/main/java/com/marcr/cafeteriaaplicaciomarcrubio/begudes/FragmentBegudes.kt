package com.marcr.cafeteriaaplicaciomarcrubio.begudes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.marcr.cafeteriaaplicaciomarcrubio.databinding.FragmentBegudesBinding
import com.marcr.tutorial_recycler.adapter.BegudesAdapter

class FragmentBegudes : Fragment() {
    private lateinit var binding: FragmentBegudesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBegudesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        val decoration = DividerItemDecoration(requireContext(), manager.orientation)
        val recyclerView = binding.recyclerBegudes
        recyclerView.layoutManager = manager
        recyclerView.adapter = BegudesAdapter(BegudesProvider.begudesList)
        binding.recyclerBegudes.addItemDecoration(decoration)
    }
}