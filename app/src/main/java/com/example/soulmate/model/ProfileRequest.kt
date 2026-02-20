package com.example.soulmate.model

data class ProfileRequest(
    val uid: String,
    val name: String,
    val age: Int,
    val answers: Map<String, String>,
    val imageUrl: String
)