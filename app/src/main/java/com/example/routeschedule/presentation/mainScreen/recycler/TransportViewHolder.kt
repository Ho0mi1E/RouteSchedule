package com.example.routeschedule.presentation.mainScreen.recycler

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.routeschedule.R
import com.example.routeschedule.presentation.mainScreen.clickListener.TransportClickListener
import kotlinx.android.synthetic.main.item_transport.view.*

class TransportViewHolder(item: View, val clickListener: TransportClickListener) :
    RecyclerView.ViewHolder(item) {
    companion object {
        fun newInstance(parent: ViewGroup, clickListener: TransportClickListener) =
            TransportViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.item_transport, parent, false
                ), clickListener
            )
    }

    fun bindItem(number: Int, color: Int) {
        itemView.itemTransport.apply {
            when (color) {
                1 -> setBackgroundColor(Color.GREEN)
                2 -> setBackgroundColor(Color.CYAN)
                3 -> setBackgroundColor(Color.RED)
            }
            text = number.toString()
            setOnClickListener {
                clickListener.clickListened(text.toString().toInt())
            }
        }
    }
}