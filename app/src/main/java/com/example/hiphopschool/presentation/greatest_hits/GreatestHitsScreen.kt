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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hiphopschool.core.CustomBackground
import com.example.hiphopschool.core.GenericScreen

@Composable
fun GreatestHitsScreen(
    viewModel: GreatestHitsViewModel = hiltViewModel()
) {

    val greatestSongsRollingStoneText = viewModel.greatestSongsRollingStone.value
    val greatesSongsWAM = viewModel.greatestSongsWAM.value
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .animateContentSize(tween(300))
                .padding(8.dp)
        ) {
            CustomBackground()
            LazyColumn() {
                item(1) {
                    Text(
                        text = "Greatest Hip Hop Songs",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(8.dp),
                        style = MaterialTheme.typography.h4,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.primaryVariant
                    )

                    GenericScreen(headLineText = "Rolling Stone", bodyText = greatestSongsRollingStoneText)

                    GenericScreen(headLineText = "Work and Money", bodyText = greatesSongsWAM)
                }
            }
        }
    }
}