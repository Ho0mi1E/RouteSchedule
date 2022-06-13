package com.example.routeschedule.presentation.routes.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.routeschedule.R
import com.example.routeschedule.presentation.routes.clickListener.RoutesClickListener
import kotlinx.android.synthetic.main.item_route.view.*

class RoutesViewHolder(item: View,val clickListener: RoutesClickListener) : RecyclerView.ViewHolder(item) {
    companion object{
        fun newInstance(parent: ViewGroup,clickListener: RoutesClickListener)= RoutesViewHolder(
            LayoutInflater.from(parent.context).inflate(
            R.layout.item_route,parent,false),clickListener)
    }


    fun bindItem(stop: String){
        itemView.stops.text = stop

        itemView.stops.setOnClickListener {
        clickListener.clickListened(stop)}
    }
}