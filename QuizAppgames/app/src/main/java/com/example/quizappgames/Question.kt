package com.example.quizappgames

import java.util.function.IntConsumer

data class Question (
        val id: Int,
        val question: String,
        val image: Int,
        val optionOne: String,
        val optionTwo: String,
        val optionThree: String,
        val optionFour: String,
        val correctAnswer: Int,
)

