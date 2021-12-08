package com.example.hiphopschool.presentation.history_screen

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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hiphopschool.core.CustomBackground
import com.example.hiphopschool.core.GenericScreen
import com.example.hiphopschool.core.GenericSubHeading

@Composable
fun HistoryScreen(
    viewModel: HistoryScreenViewModel = hiltViewModel()
) {
    val historyText = viewModel.historyText.value
    val newSchoolHipHopText = viewModel.newSchoolHipHop.value
    val goldenAgeOfHipHopText = viewModel.goldenAgeOfHipHop.value
    val westCoastHipHopText = viewModel.westCoastHipHop.value
    val mainStreamSuccessText = viewModel.mainStreamSuccess.value
    val eastVsMainCoastText = viewModel.eastVsWestCoast.value
    val eastCoastHipHopText = viewModel.eastCoastHipHop.value
    val weatCoastHipHopDetail = viewModel.westCoastHipHopDetail.value
    val commercializationText = viewModel.commercialization.value
    val alternateHipHopText = viewModel.alternateHipHop.value
    val wonkyMusicText = viewModel.wonkyMusic.value
    val crunkMusicText = viewModel.crunkMusic.value
    val snapMusicText = viewModel.snapMusic.value
    val declineInSalesText = viewModel.declineInSales.value
    val innovationText = viewModel.innovation.value

    val listState = rememberLazyListState()
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            CustomBackground()
            LazyColumn(state = listState) {
                item(1) {
                    Text(
                        text = "History of Hip-Hop",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(8.dp),
                        style = MaterialTheme.typography.h4,
                        fontWeight = FontWeight.Bold,
                        color = Color.Yellow
                    )

                    GenericScreen(
                        headLineText = "1979–1983: Old school hip hop",
                        bodyText = historyText
                    )

                    GenericScreen(
                        headLineText = "1983–1986: New school hip hop",
                        bodyText = newSchoolHipHopText
                    )

                    GenericSubHeading(text = "1986–1997")

                    GenericScreen(
                        headLineText = "1986–1997: Golden age hip hop",
                        bodyText = goldenAgeOfHipHopText
                    )

                    GenericScreen(
                        headLineText = "Gangsta rap and West Coast hip hop",
                        bodyText = westCoastHipHopText
                    )

                    GenericScreen(
                        headLineText = "Mainstream Breakthrough",
                        bodyText = mainStreamSuccessText
                    )

                    GenericScreen(
                        headLineText = "East Coast V/S West Coast",
                        bodyText = eastVsMainCoastText
                    )

                    GenericScreen(
                        headLineText = "East Coast Hip Hop",
                        bodyText = eastCoastHipHopText
                    )

                    GenericScreen(
                        headLineText = "West Coast Hip Hop",
                        bodyText = weatCoastHipHopDetail
                    )

                    GenericSubHeading(text = "1997-2000: Bling Era")

                    GenericScreen(
                        headLineText = "Commercialization and new directions",
                        bodyText = commercializationText
                    )

                    GenericScreen(
                        headLineText = "Rise of alternate Hip Hop",
                        bodyText = alternateHipHopText
                    )

                    GenericScreen(
                        headLineText = "Glitch hop and wonky music",
                        bodyText = wonkyMusicText
                    )

                    GenericScreen(
                        headLineText = "Crunk Music",
                        bodyText = crunkMusicText
                    )
                    
                    GenericSubHeading(text = "2006–2014: Blog era")

                    GenericScreen(
                        headLineText = "Snap music and influence of the Internet",
                        bodyText = snapMusicText
                    )

                    GenericScreen(
                        headLineText = "Decline in sales",
                        bodyText = declineInSalesText
                    )

                    GenericScreen(
                        headLineText = "Innovation and revitalization",
                        bodyText = innovationText
                    )
                }
            }
        }
    }
}