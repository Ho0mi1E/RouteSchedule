package com.example.routeschedule.presentation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

fun FragmentActivity.openFragment(container: Int,tag:String,fragment: Fragment){
   supportFragmentManager.beginTransaction()
       .replace(container,fragment,tag)
       .addToBackStack(tag)
       .commit()
}