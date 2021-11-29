package com.example.hiphopschool.presentation.curent_scenario

import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hiphopschool.R
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class CurrentScenarioViewModel @Inject constructor(
    @ApplicationContext appContext : Context
) : ViewModel() {
    private val _mumbleRap = mutableStateOf<String>(appContext.getString(R.string.mumble_rap))
    val mumbleRap : State<String> = _mumbleRap

    private val _ageOfStreaming = mutableStateOf<String> (appContext.getString(R.string.age_of_streaming))
    val ageOfStreaming : State<String> = _ageOfStreaming
}