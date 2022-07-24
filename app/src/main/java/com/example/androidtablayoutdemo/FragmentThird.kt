package com.example.androidtablayoutdemo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidtablayoutdemo.databinding.FragmentThirdBinding

class FragmentThird : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentThirdBinding.bind(view)
    }

    companion object {

        @JvmStatic
        fun newInstance() = FragmentThird()

    }

}