package com.marcr.tutorial_recycler.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.marcr.cafeteriaaplicaciomarcrubio.R
import com.marcr.cafeteriaaplicaciomarcrubio.menjar.Menjar

class MenjarsAdapter(private val menjarList:List<Menjar>) :RecyclerView.Adapter<MenjarsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenjarsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MenjarsViewHolder(layoutInflater.inflate(R.layout.item_menjar, parent, false))
    }

    override fun getItemCount(): Int = menjarList.size

    override fun onBindViewHolder(holder: MenjarsViewHolder, position: Int) {
        val item = menjarList[position]
        holder.render(item)
    }

}