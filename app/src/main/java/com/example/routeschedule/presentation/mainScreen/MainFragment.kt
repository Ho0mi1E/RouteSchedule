package com.example.routeschedule.presentation.mainScreen

import androidx.fragment.app.Fragment
import com.example.routeschedule.R
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {
    companion object{
        const val TAG ="MAIN"
        fun newInstance() = MainFragment()
    }

    override fun onStart() {
        super.onStart()
        viewPager.adapter = PageAdapter(requireActivity())
        tabLayout.tabIconTint = null
        TabLayoutMediator(tabLayout,viewPager){
                tab,pos ->
            when(pos){
                0 -> tab.text = getString(R.string.bus)
                1-> tab.text = getString(R.string.trolleybus)
                2 -> tab.text = getString(R.string.tram)
            }
        }.attach()
    }
}