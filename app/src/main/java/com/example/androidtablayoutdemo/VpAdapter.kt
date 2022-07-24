package com.example.androidtablayoutdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class VpAdapter(

    fragmentActivity: FragmentActivity,
    private val fragmentsList: List<Fragment>

    ) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int = fragmentsList.size

    override fun createFragment(position: Int): Fragment = fragmentsList[position]

}