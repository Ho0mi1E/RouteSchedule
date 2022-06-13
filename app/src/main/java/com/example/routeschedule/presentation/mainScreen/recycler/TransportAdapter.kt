package com.example.routeschedule.presentation.mainScreen.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.routeschedule.presentation.mainScreen.clickListener.TransportClickListener

class TransportAdapter(private val clickListener: TransportClickListener) :
    RecyclerView.Adapter<TransportViewHolder>() {


    private var listof = (1..100).toList()
    private var color = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransportViewHolder {
        return TransportViewHolder.newInstance(parent, clickListener)
    }

    override fun onBindViewHolder(holder: TransportViewHolder, position: Int) {
        holder.bindItem(listof[position], color)
    }

    override fun getItemCount(): Int {
        return listof.size
    }

    fun submitItem(list: List<Int>, colorOf: Int) {
        color = colorOf
        listof = list
    }
}