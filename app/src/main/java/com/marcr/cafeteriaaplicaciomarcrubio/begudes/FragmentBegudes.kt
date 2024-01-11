package com.marcr.cafeteriaaplicaciomarcrubio.begudes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.marcr.cafeteriaaplicaciomarcrubio.databinding.FragmentBegudesBinding
import com.marcr.cafeteriaaplicaciomarcrubio.menjar.ViewModelMenjar
import com.marcr.tutorial_recycler.adapter.BegudesAdapter
import com.marcr.tutorial_recycler.adapter.MenjarsAdapter

class FragmentBegudes : Fragment() {
    private lateinit var binding: FragmentBegudesBinding
    private val viewModel: ViewModelBegudes by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBegudesBinding.inflate(inflater, container, false)
        initRecyclerView()
        return binding.root
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        val decoration = DividerItemDecoration(requireContext(), manager.orientation)
        val recyclerView = binding.recyclerBegudes
        recyclerView.layoutManager = manager

        viewModel.cargarBegudes()
        viewModel.begudes.observe(viewLifecycleOwner){llistaBegudes->
            recyclerView.adapter = BegudesAdapter(llistaBegudes)
        }

        binding.recyclerBegudes.addItemDecoration(decoration)
    }
}