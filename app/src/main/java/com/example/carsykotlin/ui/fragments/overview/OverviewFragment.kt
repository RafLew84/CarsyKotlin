package com.example.carsykotlin.ui.fragments.overview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.carsykotlin.R
import com.example.carsykotlin.databinding.FragmentTimeLineBinding

class OverviewFragment : Fragment() {

    private lateinit var binding: FragmentTimeLineBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTimeLineBinding.inflate(inflater)
        return binding.root
    }
}