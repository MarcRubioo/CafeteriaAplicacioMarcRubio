package com.marcr.tutorial_recycler.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marcr.cafeteriaaplicaciomarcrubio.R
import com.marcr.cafeteriaaplicaciomarcrubio.menjar.Menjar

class MenjarsViewHolder (view: View):RecyclerView.ViewHolder(view){

    val nomMenjar = view.findViewById<TextView>(R.id.NomBeguda)
    val preuMenjar = view.findViewById<TextView>(R.id.PreuBeguda)
    val photo = view.findViewById<ImageView>(R.id.FotoBeguda)


    fun render(menjarModel: Menjar){
        nomMenjar.text = menjarModel.nomMenjar
        preuMenjar.text = menjarModel.preu.toString() + " €"
        Glide.with(photo.context).load(menjarModel.photo).into(photo)

    }
}