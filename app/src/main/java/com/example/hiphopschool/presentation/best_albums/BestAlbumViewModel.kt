package com.example.hiphopschool.presentation.best_albums

import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hiphopschool.R
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class BestAlbumViewModel @Inject constructor(
    @ApplicationContext appContext: Context
) : ViewModel() {
    private val _bestAlbumsHHGA = mutableStateOf<String>(appContext.getString(R.string.best_albums_hhga))
    val bestAlbumsHHGA : State<String> = _bestAlbumsHHGA

    private val _bestAlbumOts = mutableStateOf<String>(appContext.getString(R.string.ots))
    val bestAlbumOts : State<String> = _bestAlbumOts
}