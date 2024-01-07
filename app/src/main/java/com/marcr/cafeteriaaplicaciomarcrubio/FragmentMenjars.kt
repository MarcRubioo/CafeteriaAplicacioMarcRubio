package com.marcr.cafeteriaaplicaciomarcrubio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.marcr.cafeteriaaplicaciomarcrubio.databinding.FragmentMenjarsBinding
import com.marcr.tutorial_recycler.MenjarProvider
import com.marcr.tutorial_recycler.adapter.MenjarsAdapter

class FragmentMenjars : Fragment() {
    private lateinit var binding: FragmentMenjarsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenjarsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(requireContext())
        val decoration = DividerItemDecoration(requireContext(), manager.orientation)
        val recyclerView = binding.recyclerMenjar
        recyclerView.layoutManager = manager
        recyclerView.adapter = MenjarsAdapter(MenjarProvider.menjarList)
        binding.recyclerMenjar.addItemDecoration(decoration)
    }
}
