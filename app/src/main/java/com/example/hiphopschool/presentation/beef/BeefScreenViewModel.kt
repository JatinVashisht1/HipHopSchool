package com.example.hiphopschool.presentation.beef

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BeefScreenViewModel @Inject constructor(): ViewModel () {
    private val _beefText = mutableStateOf<String>("")
    val beefText : State<String> = _beefText
}