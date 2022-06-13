package com.example.routeschedule.presentation.mainScreen

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.routeschedule.presentation.mainScreen.pages.BusFragment
import com.example.routeschedule.presentation.mainScreen.pages.TramFragmnet
import com.example.routeschedule.presentation.mainScreen.pages.TrolleybusFragment

class PageAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
       return when(position){
            0 -> BusFragment()
            1 -> TrolleybusFragment()
            else -> TramFragmnet()
        }
    }
}