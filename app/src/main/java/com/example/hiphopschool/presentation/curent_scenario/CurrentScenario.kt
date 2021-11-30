package com.example.hiphopschool.presentation.curent_scenario

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hiphopschool.core.GenericScreen
import com.example.hiphopschool.core.GenericSubHeading

@Composable
fun CurrentScenario(
    viewModel: CurrentScenarioViewModel = hiltViewModel()
) {
    val listState = rememberLazyListState()
    val mumbleRapText = viewModel.mumbleRap.value
    val ageOfStreamingText = viewModel.ageOfStreaming.value
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            LazyColumn(state = listState) {
                item(1) {
                    Text(
                        text = "Current Scenario",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(8.dp),
                        style = MaterialTheme.typography.h4,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.primaryVariant
                    )
                    GenericSubHeading(text = "Trap and Mumble rap era")
                    GenericScreen(headLineText = "Mumble Rap and Trap", bodyText = mumbleRapText )
                    GenericScreen(headLineText = "Age of streaming", bodyText = ageOfStreamingText )
                }
            }
        }
    }
}