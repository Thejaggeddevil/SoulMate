package com.example.soulmate.data.remote

import com.example.soulmate.model.*
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    // 🔥 Fetch onboarding questions from backend
    @GET("questions")
    suspend fun getQuestions(): Response<List<QuestionResponse>>

    // 🔥 Send profile data after onboarding
    @POST("profile")
    suspend fun createProfile(
        @Body profileRequest: ProfileRequest
    ): Response<Unit>

    // 🔥 Fetch profiles for home screen
    @GET("profiles")
    suspend fun getProfiles(
        @Query("uid") uid: String
    ): Response<List<ProfileResponse>>

    // 🔥 Get compatibility score when swipe right
    @POST("compatibility")
    suspend fun getCompatibility(
        @Body request: CompatibilityRequest
    ): Response<CompatibilityResponse>
}