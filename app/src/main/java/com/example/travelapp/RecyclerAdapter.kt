package com.example.travelapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(private val  countriesList:ArrayList<Country>):
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return CountryVH(
            LayoutInflater.from(parent.context).inflate(R.layout.item_contry,parent,false)

        )
    }

    override fun getItemCount(): Int = countriesList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        (holder as CountryVH).bind(country = countriesList[position])
    }

}