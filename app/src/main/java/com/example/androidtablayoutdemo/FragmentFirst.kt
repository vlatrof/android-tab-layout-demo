package com.example.androidtablayoutdemo

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.androidtablayoutdemo.databinding.FragmentFirstBinding

class FragmentFirst : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFirstBinding.bind(view)
    }

    companion object {

        @JvmStatic
        fun newInstance() = FragmentFirst()

    }

}
