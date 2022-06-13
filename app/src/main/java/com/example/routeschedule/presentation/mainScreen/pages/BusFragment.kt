package com.example.routeschedule.presentation.mainScreen.pages

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.routeschedule.R
import com.example.routeschedule.presentation.SharedViewModel
import com.example.routeschedule.presentation.mainScreen.clickListener.TransportClickListener
import com.example.routeschedule.presentation.mainScreen.recycler.TransportAdapter
import com.example.routeschedule.presentation.openFragment
import com.example.routeschedule.presentation.routes.RouteFragment
import kotlinx.android.synthetic.main.fragment_bus.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class BusFragment : Fragment(R.layout.fragment_bus) {

    private val viewModel: SharedViewModel by sharedViewModel()

    private val list = (1..70).toList()
    private val clickListener = object : TransportClickListener {
        override fun clickListened(number: Int) {
            viewModel.putNumberOfBus(number)
            requireActivity().openFragment(
                R.id.container,
                RouteFragment.TAG,
                RouteFragment.newInstance()
            )
        }
    }

    private val transportAdapter by lazy { TransportAdapter(clickListener) }


    override fun onStart() {
        super.onStart()

        GridLayoutManager(requireContext(), 6, RecyclerView.VERTICAL, false).apply {
            recyclerBus.layoutManager = this
        }
        transportAdapter.submitItem(list, 1)


        recyclerBus.adapter = transportAdapter
    }
}