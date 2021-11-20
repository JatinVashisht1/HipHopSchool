package com.example.hiphopschool.presentation.goat_screen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GoatScreenViewModel @Inject constructor() : ViewModel() {
    private val _goatTextState = mutableStateOf<String>("")
    val goatTextState: State<String> = _goatTextState
}