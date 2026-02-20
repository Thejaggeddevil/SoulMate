package com.example.soulmate.repository



import com.example.soulmate.data.remote.RetrofitClient
import com.example.soulmate.model.*

class SoulMateRepository {

    private val api = RetrofitClient.api

    suspend fun fetchQuestions() =
        api.getQuestions()

    suspend fun createProfile(request: ProfileRequest) =
        api.createProfile(request)

    suspend fun fetchProfiles(uid: String) =
        api.getProfiles(uid)

    suspend fun getCompatibility(request: CompatibilityRequest) =
        api.getCompatibility(request)
}