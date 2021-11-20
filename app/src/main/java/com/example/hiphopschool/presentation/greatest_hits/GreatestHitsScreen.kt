package com.example.hiphopschool.presentation.greatest_hits

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
fun GreatestHitsScreen(
    viewModel: GreatestHitsViewModel = hiltViewModel()
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        val greatestHitsText = viewModel.greatestHits.value
        val greatestHitsState = rememberSaveable { mutableStateOf(false) }
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .animateContentSize(tween(300))
                .padding(8.dp)
        ) {
            LazyColumn() {
                item(1) {
                    Text(
                        text = "Greatest Hits",
                        style = MaterialTheme.typography.h6,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(8.dp)
                    )

                    if (greatestHitsState.value) {
                        Text(
                            text = greatestHitsText,
                            style = MaterialTheme.typography.body1,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }
            }
        }
    }
}