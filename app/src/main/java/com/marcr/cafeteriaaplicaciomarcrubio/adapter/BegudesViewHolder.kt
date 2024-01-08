package com.marcr.tutorial_recycler.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marcr.cafeteriaaplicaciomarcrubio.R
import com.marcr.tutorial_recycler.Begudes

class BegudesViewHolder (view: View):RecyclerView.ViewHolder(view){

    val nomBeguda = view.findViewById<TextView>(R.id.NomBeguda)
    val preuBeguda = view.findViewById<TextView>(R.id.PreuBeguda)
    val photo = view.findViewById<ImageView>(R.id.FotoBeguda)


    fun render(begudesModel: Begudes){
        nomBeguda.text = begudesModel.nomBegudes
        preuBeguda.text = begudesModel.preu.toString()+ " €"
        Glide.with(photo.context).load(begudesModel.photo).into(photo)

    }
}