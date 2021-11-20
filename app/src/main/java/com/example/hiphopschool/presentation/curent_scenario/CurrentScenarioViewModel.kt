package com.example.hiphopschool.presentation.curent_scenario

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CurrentScenarioViewModel @Inject constructor() : ViewModel() {
    private val _currentScenarioText = mutableStateOf<String>("")
    val currentScenario: State<String> = _currentScenarioText
}