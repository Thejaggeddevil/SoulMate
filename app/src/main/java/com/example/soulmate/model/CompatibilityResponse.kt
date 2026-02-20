package com.example.soulmate.model




data class CompatibilityResponse(
    val score: Int,
    val breakdown: Map<String, Int>
)