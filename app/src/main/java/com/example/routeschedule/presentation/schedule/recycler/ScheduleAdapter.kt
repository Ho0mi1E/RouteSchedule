package com.example.routeschedule.presentation.schedule.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ScheduleAdapter : RecyclerView.Adapter<ScheduleViewHolder>() {

    private var schedules = listOf<String>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        return ScheduleViewHolder.newInstance(parent)
    }

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        holder.bindItem(schedules[position])
    }

    override fun getItemCount(): Int {
        return schedules.size
    }

    fun submitList(list: List<String>){
        schedules = list
        notifyDataSetChanged()
    }
}