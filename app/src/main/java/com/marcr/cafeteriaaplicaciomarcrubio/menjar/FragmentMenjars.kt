package com.marcr.cafeteriaaplicaciomarcrubio.menjar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.marcr.cafeteriaaplicaciomarcrubio.databinding.FragmentMenjarsBinding
import com.marcr.cafeteriaaplicaciomarcrubio.menjar.MenjarProvider
import com.marcr.cafeteriaaplicaciomarcrubio.menjar.MenjarProvider.Companion.menjarList
import com.marcr.tutorial_recycler.adapter.MenjarsAdapter

class FragmentMenjars : Fragment() {
    private lateinit var binding: FragmentMenjarsBinding
    private val viewModel: ViewModelMenjar by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenjarsBinding.inflate(inflater, container, false)
        initRecyclerView()
        return binding.root
    }
    private fun initRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        val decoration = DividerItemDecoration(requireContext(), manager.orientation)
        val recyclerView = binding.recyclerMenjar
        recyclerView.layoutManager = manager
        viewModel.cargarMenjar()
        viewModel.menjar.observe(viewLifecycleOwner){llistaMenjar->
            recyclerView.adapter = MenjarsAdapter(llistaMenjar)
        }
        binding.recyclerMenjar.addItemDecoration(decoration)
    }
}
