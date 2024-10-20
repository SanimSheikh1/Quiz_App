package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quizapp.databinding.FragmentQuiz1Binding

class Quiz_1_Fragment : Fragment() {

    lateinit var binding: FragmentQuiz1Binding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentQuiz1Binding.inflate(inflater, container, false)


        binding.playQuiz.setOnClickListener {

            findNavController().navigate(R.id.action_quiz_1_Fragment_to_quiz_2_Fragment)

        }

        return binding.root
    }


}