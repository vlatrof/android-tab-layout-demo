package com.example.androidtablayoutdemo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidtablayoutdemo.databinding.FragmentSecondBinding

class FragmentSecond : Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentSecondBinding.bind(view)
    }

    companion object {

        @JvmStatic
        fun newInstance() = FragmentSecond()

    }

}