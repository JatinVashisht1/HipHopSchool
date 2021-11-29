package com.example.hiphopschool.presentation.goat_screen

import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hiphopschool.R
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class GoatScreenViewModel @Inject constructor(
    @ApplicationContext appContext: Context
) : ViewModel() {
    private val _goatTextState = mutableStateOf<String>("")
    val goatTextState: State<String> = _goatTextState

    private val _disclaimerState = mutableStateOf<String>(appContext.getString(R.string.disclaimer))
    val disclaimerState: State<String> = _disclaimerState

    private val _billboardState = mutableStateOf<String>(appContext.getString(R.string.billboard))
    val billboardState: State<String> = _billboardState

    private val _goliath = mutableStateOf<String>(appContext.getString(R.string.goliath))
    val goliath : State<String> = _goliath

    private val _soulInStereo = mutableStateOf<String>(appContext.getString(R.string.soulinstereo))
    val soulInStereo : State<String> = _soulInStereo


}