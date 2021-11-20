package com.example.hiphopschool.presentation.greatest_hits

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GreatestHitsViewModel @Inject constructor(): ViewModel() {
    private val _greatestHitsScreen = mutableStateOf<String>("")
    val greatestHits : State<String> = _greatestHitsScreen
}