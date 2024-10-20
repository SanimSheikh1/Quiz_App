package com.example.quizapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.semantics.text
import androidx.navigation.fragment.findNavController
import com.example.quizapp.databinding.FragmentQuiz1Binding
import com.example.quizapp.databinding.FragmentQuiz2Binding

class Quiz_2_Fragment : Fragment() {

    lateinit var binding: FragmentQuiz2Binding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentQuiz2Binding.inflate(inflater, container, false)

        binding.nextQuiz1.setOnClickListener {

            findNavController().navigate(R.id.action_quiz_2_Fragment_to_qus_3_Fragment)

        }
        return binding.root
    }




}