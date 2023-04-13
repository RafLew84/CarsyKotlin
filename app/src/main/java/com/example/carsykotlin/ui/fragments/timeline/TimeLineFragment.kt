package com.example.carsykotlin.ui.fragments.timeline

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.carsykotlin.R
import com.example.carsykotlin.databinding.FragmentTimeLineBinding
import com.example.carsykotlin.ui.fragments.timeline.adapter.TimeLineAdapter

class TimeLineFragment : Fragment() {

    private lateinit var binding: FragmentTimeLineBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTimeLineBinding.inflate(inflater)

        binding.timeLineRecyclerView.apply{
            adapter = TimeLineAdapter(requireContext())
            layoutManager = LinearLayoutManager(requireContext())
        }

        return binding.root
    }
}