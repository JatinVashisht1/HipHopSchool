package com.example.hiphopschool.presentation.history_screen

import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hiphopschool.R
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class HistoryScreenViewModel @Inject constructor(
    @ApplicationContext appContext: Context
) : ViewModel() {
    private val _historyText = mutableStateOf<String>(appContext.getString(R.string.history_text))
    val historyText: State<String> = _historyText

    private val _newSchoolHipHop = mutableStateOf<String>(appContext.getString(R.string.new_school_hip_hop))
    val newSchoolHipHop: State<String> = _newSchoolHipHop

    private val _goldenAgeOfHipHop = mutableStateOf<String>(appContext.getString(R.string.golden_age_of_hip_hop))
    val goldenAgeOfHipHop: State<String> = _goldenAgeOfHipHop

    private val _westCoastHipHop = mutableStateOf<String>(appContext.getString(R.string.west_coast_hip_hop))
    val westCoastHipHop : State<String> = _westCoastHipHop

    private val _mainStreamSuccess = mutableStateOf<String>(appContext.getString(R.string.main_stream_success))
    val mainStreamSuccess : State<String> = _mainStreamSuccess

    private val _eastVsWestCoast = mutableStateOf<String>(appContext.getString(R.string.east_vs_west_rivalry))
    val eastVsWestCoast : State<String> = _eastVsWestCoast

    private val _eastCoastHipHop = mutableStateOf<String>(appContext.getString(R.string.east_coast_hip_hop))
    val eastCoastHipHop : State<String> = _eastCoastHipHop

    private val _westCoastHipHopDetail = mutableStateOf<String>(appContext.getString(R.string.west_coast_hip_hop_detail))
    val westCoastHipHopDetail : State<String> = _westCoastHipHopDetail

    private val _commercialization = mutableStateOf<String>(appContext.getString(R.string.bling_era))
    val commercialization : State<String> = _commercialization

    private val _alternateHipHop = mutableStateOf<String>(appContext.getString(R.string.alternate_hip_hop))
    val alternateHipHop : State<String> = _alternateHipHop

    private val _wonkyMusic = mutableStateOf<String>(appContext.getString(R.string.glitch_hip_hop_and_wonky_music))
    val wonkyMusic : State<String> = _wonkyMusic

    private val _crunkMusic = mutableStateOf<String>(appContext.getString(R.string.crunk_music))
    val crunkMusic : State<String> = _crunkMusic

    private val _snapMusic = mutableStateOf<String>(appContext.getString(R.string.snap_music))
    val snapMusic : State<String> = _snapMusic

    private val _declineInSales = mutableStateOf<String>(appContext.getString(R.string.decline_in_sales))
    val declineInSales : State<String> = _declineInSales

    private val _innovation = mutableStateOf<String>(appContext.getString(R.string.innovation_and_revitalization))
    val innovation : State<String> = _innovation
}