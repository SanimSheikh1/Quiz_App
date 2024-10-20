package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizapp.databinding.FragmentQus4Binding


class Qus_4_Fragment : Fragment() {

    lateinit var binding: FragmentQus4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQus4Binding.inflate(inflater,container,false)

        binding.nextQuiz3.setOnClickListener {

            findNavController().navigate(R.id.action_qus_4_Fragment_to_qus_5_Fragment)

        }
        return binding.root
    }


}