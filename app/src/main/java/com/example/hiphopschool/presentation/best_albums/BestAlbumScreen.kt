package com.example.hiphopschool.presentation.best_albums

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
import com.example.hiphopschool.core.GenericScreen
import com.example.hiphopschool.core.GenericSubHeading

@Composable
fun BestAlbum(
    viewModel: BestAlbumViewModel = hiltViewModel()
) {
    val listState = rememberLazyListState()
    val bestAlbumsHHGAText = viewModel.bestAlbumsHHGA.value
    val bestAlbumOts = viewModel.bestAlbumOts.value
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
                        text = "Best Albums of Hip-Hop",
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(8.dp),
                        style = MaterialTheme.typography.h4,
                        fontWeight = FontWeight.Bold,
                        color = MaterialTheme.colors.primaryVariant
                    )
                    GenericScreen(headLineText = "Hip Hop Golden Age", bodyText = bestAlbumsHHGAText )
                    GenericScreen(headLineText = "ONE37pm", bodyText = bestAlbumOts )
                }
            }
        }
    }
}
