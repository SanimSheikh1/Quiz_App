package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizapp.databinding.FragmentQus5Binding

class Qus_5_Fragment : Fragment() {

    lateinit var binding: FragmentQus5Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQus5Binding.inflate(inflater, container, false)

        binding.nextQuiz4.setOnClickListener {

            findNavController().navigate(R.id.action_qus_5_Fragment_to_qus_6_Fragment)


        }

        return binding.root
    }


}