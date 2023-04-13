package com.example.carsykotlin.ui.fragments.calculators

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.carsykotlin.R
import com.example.carsykotlin.databinding.FragmentCalculatorsBinding

class CalculatorsFragment : Fragment() {

    private lateinit var binding: FragmentCalculatorsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCalculatorsBinding.inflate(inflater)
        return binding.root
    }
}