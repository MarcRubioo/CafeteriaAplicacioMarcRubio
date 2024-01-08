package com.marcr.tutorial_recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marcr.cafeteriaaplicaciomarcrubio.R
import com.marcr.cafeteriaaplicaciomarcrubio.begudes.Begudes

class BegudesAdapter(private val begudesList:List<Begudes>) :RecyclerView.Adapter<BegudesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BegudesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BegudesViewHolder(layoutInflater.inflate(R.layout.item_beguda, parent, false))
    }

    override fun getItemCount(): Int = begudesList.size

    override fun onBindViewHolder(holder: BegudesViewHolder, position: Int) {
        val item = begudesList[position]
        holder.render(item)

    }

}