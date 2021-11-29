package com.example.hiphopschool.presentation.beef

import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hiphopschool.R
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class BeefScreenViewModel @Inject constructor(
    @ApplicationContext appContext: Context,
): ViewModel () {
    private val _daquan = mutableStateOf<String>(appContext.getString(R.string.beef_daquan))
    val daquan : State<String> = _daquan

    private val _complex = mutableStateOf<String>(appContext.getString(R.string.beef_complex))
    val complex : State<String> = _complex
}