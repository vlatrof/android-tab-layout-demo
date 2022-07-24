package com.example.androidtablayoutdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.androidtablayoutdemo.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val fragmentsList: List<Fragment> = initFragments()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.vpFragmentContainer.adapter = VpAdapter(this, fragmentsList)
        initMediator()

        setContentView(binding.root)
    }

    private fun initMediator() {

        TabLayoutMediator(binding.tlTest, binding.vpFragmentContainer) { tab, position ->
            tab.text = resources.getStringArray(R.array.tabs_titles)[position]
        }.attach()

    }

    private fun initFragments(): List<Fragment> = listOf (
        FragmentFirst.newInstance(),
        FragmentSecond.newInstance(),
        FragmentThird.newInstance()
    )

}