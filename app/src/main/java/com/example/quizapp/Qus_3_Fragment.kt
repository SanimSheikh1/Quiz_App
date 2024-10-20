package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizapp.databinding.FragmentQus3Binding

class Qus_3_Fragment : Fragment() {

    lateinit var binding: FragmentQus3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentQus3Binding.inflate(inflater,container,false)

        binding.nextQuiz2.setOnClickListener {

            findNavController().navigate(R.id.action_qus_3_Fragment_to_qus_4_Fragment)

        }

        return binding.root
    }


}