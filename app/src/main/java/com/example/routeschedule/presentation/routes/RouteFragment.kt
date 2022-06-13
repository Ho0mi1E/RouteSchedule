package com.example.routeschedule.presentation.routes

import android.annotation.SuppressLint
import android.view.Menu
import android.view.MenuInflater
import androidx.fragment.app.Fragment
import com.example.routeschedule.R
import com.example.routeschedule.presentation.SharedViewModel
import com.example.routeschedule.presentation.openFragment
import com.example.routeschedule.presentation.routes.clickListener.RoutesClickListener
import com.example.routeschedule.presentation.routes.recycler.RoutesAdapter
import com.example.routeschedule.presentation.schedule.ScheduleFragment
import kotlinx.android.synthetic.main.fragment_route.*
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

class RouteFragment : Fragment(R.layout.fragment_route) {

    companion object{
        const val TAG ="ROUTES"
        fun newInstance() = RouteFragment()
    }

    private var listStop = listOf<String>()

    private val sharedViewModel : SharedViewModel by sharedViewModel()
    private val adapter by lazy { RoutesAdapter(clickListener) }

    private val clickListener = object : RoutesClickListener {
        override fun clickListened(stop: String) {
            sharedViewModel.putSchedule()
            requireActivity().openFragment(R.id.container,ScheduleFragment.TAG,ScheduleFragment.newInstance())
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_routes,menu)
        super.onCreateOptionsMenu(menu,inflater)
    }

    override fun onStart() {
        super.onStart()
        openRecycler()
        clickListener()
    }


    @SuppressLint("SetTextI18n")
    private fun openRecycler(){
        sharedViewModel.stops.observe(viewLifecycleOwner){list ->
            listStop = list
          adapter.submitList(list)
            infoRoute.text = list.first() + "-" + list.last()
        }
        requireActivity().recyclerRoutes.adapter = adapter
    }

    @SuppressLint("SetTextI18n")
    private fun clickListener(){
        changeButton.setOnClickListener {
            listStop =listStop.reversed()
            adapter.changeList()
            infoRoute.text = listStop.first() + "-" + listStop.last()
        }
    }
}