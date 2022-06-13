package com.example.routeschedule.presentation.schedule.recycler

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.routeschedule.R
import kotlinx.android.synthetic.main.item_route.view.*
import kotlinx.android.synthetic.main.item_schedule.view.*

class ScheduleViewHolder(item: View) : RecyclerView.ViewHolder(item) {
    companion object {
        fun newInstance(parent: ViewGroup) = ScheduleViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_schedule, parent, false
            )
        )
    }

    private var flag = true

    fun bindItem(schedule: String) {

        itemView.textSchedule.text = schedule
    }


}