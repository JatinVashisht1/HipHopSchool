package com.example.hiphopschool.presentation.history_screen

import android.app.Application
import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hiphopschool.R
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import java.io.File

@HiltViewModel
class HistoryScreenViewModel @Inject constructor(
    @ApplicationContext appContext: Context
) : ViewModel() {
    private val _historyText = mutableStateOf<String>(appContext.getString(R.string.history_text))
    val historyText: State<String> = _historyText
}