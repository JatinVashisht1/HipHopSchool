package com.example.hiphopschool.presentation.greatest_hits

import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hiphopschool.R
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class GreatestHitsViewModel @Inject constructor(@ApplicationContext appContext: Context): ViewModel() {
    private val _greatestSongsRollingStoneState = mutableStateOf<String>(appContext.getString(R.string.greatest_songs_rolling_stone))
    val greatestSongsRollingStone : State<String> = _greatestSongsRollingStoneState

    private val _greatestSongsWAM = mutableStateOf<String>(appContext.getString(R.string.greatest_songs_wam))
    val greatestSongsWAM : State<String> = _greatestSongsWAM
}