package com.example.soulmate.model

data class Question(
    val id: String = "",
    val text: String = "",
    val type: String = "",
    val options: List<String> = emptyList()
)