package com.example.hiphopschool.presentation.goat_screen

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hiphopschool.core.CustomBackground
import com.example.hiphopschool.core.GenericScreen
import com.example.hiphopschool.core.GenericSubHeading

@Composable
fun GoatScreen(
    viewModel: GoatScreenViewModel = hiltViewModel()
) {
    val billboardText = viewModel.billboardState.value
    val disclaimer = viewModel.disclaimerState.value
    val goliathText = viewModel.goliath.value
    val soulInStereo = viewModel.soulInStereo.value
    val listState = rememberLazyListState()
    Column(
        modifier = Modifier
            .fillMaxSize()
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
                        text = "GOATs of Hip-Hop",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(8.dp),
                        style = MaterialTheme.typography.h4,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.primaryVariant
                    )
                    GenericScreen(headLineText = "Disclaimer", bodyText = disclaimer)

                    GenericSubHeading(text = "Artists")

                    GenericScreen(headLineText = "BillBoard", bodyText = billboardText)

                    GenericScreen(headLineText = "Goliath", bodyText = goliathText)

                    GenericScreen(headLineText = "Soul in Stereo", bodyText = soulInStereo)
                }
            }
        }
    }
}