package com.example.hiphopschool.presentation.history_screen

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
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

@Composable
fun HistoryScreen(
    viewModel: HistoryScreenViewModel = hiltViewModel()
) {
    val historyTextState = rememberSaveable { mutableStateOf(false) }
    val historyText = viewModel.historyText.value
    val scrollState = rememberScrollState()
    Column() {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            LazyColumn() {
                item(1) {
                    Text(
                        text = "History of Hip-Hop",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(8.dp),
                        style = MaterialTheme.typography.h4,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.primaryVariant
                    )
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .animateContentSize(tween(300))
//                            .background(MaterialTheme.colors.secondary)
                            .clickable { historyTextState.value = !historyTextState.value }
                            .padding(8.dp),
                        backgroundColor = MaterialTheme.colors.secondary
                    ) {
                        Column {
                            Text(
                                text = "1979–1983: Old school hip hop",
                                modifier = Modifier
                                    .align(Alignment.Start)
                                    .padding(8.dp),
                                style = MaterialTheme.typography.h6,
                                fontWeight = FontWeight.SemiBold,
                                color = MaterialTheme.colors.primaryVariant
                            )

                            if (historyTextState.value) {
                                Text(
                                    text = historyText,
                                    modifier = Modifier
                                        .align(Alignment.Start)
                                        .padding(8.dp),
                                    style = MaterialTheme.typography.body1,
                                    fontWeight = FontWeight.Normal,
                                    color = MaterialTheme.colors.primaryVariant
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}