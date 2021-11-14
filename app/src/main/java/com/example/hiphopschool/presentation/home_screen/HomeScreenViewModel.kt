package com.example.hiphopschool.presentation.home_screen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.hiphopschool.presentation.home_screen.components.HSRowPairItem
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * viewModel for HomeScreen
 * */
@HiltViewModel
class HomeScreenViewModel @Inject constructor() : ViewModel() {
    private val _topicListState = mutableStateOf<List<HSRowPairItem>>(
        listOf(
            HSRowPairItem(
                textFirst = "History",
                textSecond = "Greatest of All Time"
            ),
            HSRowPairItem(
                textFirst = "Greatest Hits",
                textSecond = "Beefs"
            ),
            HSRowPairItem(
                textFirst = "Current Scenario",
                textSecond = "Major Years"
            ),
            HSRowPairItem(
                textFirst = "Best Albums",
                textSecond = "Random Facts"
            )
        )
    )
    val topicListState : State<List<HSRowPairItem>> = _topicListState

}