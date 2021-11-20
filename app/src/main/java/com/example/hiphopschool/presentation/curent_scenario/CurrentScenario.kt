package com.example.hiphopschool.presentation.curent_scenario

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun CurrentScenario(
    viewModel: CurrentScenarioViewModel = hiltViewModel()
) {
    val currentScenario = viewModel.currentScenario.value
    val currentScenarioState = rememberSaveable { mutableStateOf(false) }
    Column(

    ) {
        Text(
            "Current Scenario",
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.Bold
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .animateContentSize(tween(300))
                .clickable { currentScenarioState.value = !currentScenarioState.value }
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                if (currentScenarioState.value) {
                    Text(
                        text = currentScenario,
                        style = MaterialTheme.typography.body1,
                        fontWeight = FontWeight.SemiBold
                    )
                }
            }
        }
    }
}