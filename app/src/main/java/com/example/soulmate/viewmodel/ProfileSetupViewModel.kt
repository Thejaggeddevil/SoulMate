package com.example.soulmate.viewmodel


import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.soulmate.model.ProfileRequest
import com.example.soulmate.model.QuestionResponse
import com.example.soulmate.repository.SoulMateRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ProfileSetupViewModel : ViewModel() {

    private val repository = SoulMateRepository()

    private val _questions = MutableStateFlow<List<com.example.soulmate.model.QuestionResponse>>(emptyList())
    val questions: StateFlow<List<com.example.soulmate.model.QuestionResponse>> = _questions

    val answers = mutableMapOf<String, String>()

    init {
        loadQuestions()
    }

    private fun loadQuestions() {
        viewModelScope.launch {
            val response = repository.fetchQuestions()
            if (response.isSuccessful) {
                _questions.value = (response.body() ?: emptyList()) as List<QuestionResponse>
            }
        }
    }

    fun submitProfile(
        uid: String,
        name: String,
        age: Int,
        imageUrl: String,
        onSuccess: () -> Unit
    ) {
        viewModelScope.launch {
            val request = ProfileRequest(
                uid = uid,
                name = name,
                age = age,
                answers = answers,
                imageUrl = imageUrl
            )

            val response = repository.createProfile(request)
            if (response.isSuccessful) {
                onSuccess()
            }
        }
    }
}