package com.example.androidtablayoutdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androidtablayoutdemo.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fragmentsList: List<Fragment> = initFragments()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setTabLayoutItemsSelectListener()
        selectDefaultTab()

    }

    private fun initFragments(): List<Fragment> = listOf (
        FragmentFirst.newInstance(),
        FragmentSecond.newInstance(),
        FragmentThird.newInstance()
    )

    private fun setTabLayoutItemsSelectListener() {

        binding.testTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {

            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab ?: throw IllegalStateException("Tab is null")
                setFragment(tab.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })
    }

    private fun setFragment(position: Int) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragmentsList[position])
            .commit()
    }

    private fun selectDefaultTab() {
        val tab = binding.testTabLayout.getTabAt(0)
        tab ?: throw IllegalStateException("Tab is null")
        setFragment(tab.position)
    }

}