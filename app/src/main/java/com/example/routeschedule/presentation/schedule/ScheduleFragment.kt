package com.example.routeschedule.presentation.schedule

import androidx.fragment.app.Fragment
import com.example.routeschedule.R
import com.example.routeschedule.presentation.SharedViewModel
import com.example.routeschedule.presentation.schedule.recycler.ScheduleAdapter
import kotlinx.android.synthetic.main.fragment_schedule.*
import org.koin.androidx.viewmodel.ext.android.sharedStateViewModel

class ScheduleFragment : Fragment(R.layout.fragment_schedule) {
    companion object {
        const val TAG = "SCHEDULE"
        fun newInstance() = ScheduleFragment()
    }


    private val viewModel: SharedViewModel by sharedStateViewModel()
    private val adapter by lazy { ScheduleAdapter() }

    override fun onStart() {
        super.onStart()
        openRecycler()
    }

    private fun openRecycler() {
        viewModel.schedule.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }
        recyclerSchedule.adapter = adapter
    }
}