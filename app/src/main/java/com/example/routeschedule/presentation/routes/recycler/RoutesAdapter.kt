package com.example.routeschedule.presentation.routes.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.routeschedule.presentation.routes.clickListener.RoutesClickListener

class RoutesAdapter(val clickListener: RoutesClickListener) : RecyclerView.Adapter<RoutesViewHolder>() {

    private var stopList = listOf<String>()
    private var stopListReverse = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoutesViewHolder {
      return RoutesViewHolder.newInstance(parent,clickListener)
    }

    override fun onBindViewHolder(holder: RoutesViewHolder, position: Int) {
       holder.bindItem(stopList[position])
    }

    override fun getItemCount(): Int {
       return stopList.size
    }

    fun submitList(list: List<String>){
        stopList = list
        stopListReverse = list.reversed()
        notifyDataSetChanged()
    }

    fun changeList(){
        stopList = stopListReverse
        stopListReverse = stopList.reversed()
        notifyDataSetChanged()
    }
}