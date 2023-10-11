package com.example.travelapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_countries.view.item_country_rootView
import kotlinx.android.synthetic.main.item_contry.view.item_country_cityTv
import kotlinx.android.synthetic.main.item_contry.view.item_country_imageView
import kotlinx.android.synthetic.main.item_contry.view.item_country_nameTV
import kotlinx.android.synthetic.main.item_contry.view.item_country_numberOfDaysTV
import kotlinx.android.synthetic.main.item_contry.view.item_country_priceTV
import kotlinx.android.synthetic.main.item_contry.view.item_country_ratingBar

class CountryVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val rootView = itemView.item_country_rootView
        private val name = itemView.item_country_nameTV
        private val city = itemView.item_country_cityTv
        private val numberOfDays = itemView.item_country_numberOfDaysTV
        private val price = itemView.item_country_priceTV
        private val ratingBar = itemView.item_country_ratingBar
        private val imageView = itemView.item_country_imageView

        fun bind(country: Country){
                name.text = country.name
                city.text = country.city
                numberOfDays.text = country.numberOfDays
                price.text=country.price
                ratingBar.rating= country.rating.toFloat()

                Glide.with(itemView).load(country.image).into(imageView)
        }





}