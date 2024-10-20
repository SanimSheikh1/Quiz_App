package com.example.quizapp

data class Quiz(
    val question: String,
    val options: List<String>,
    val correctAnswer: String
)
