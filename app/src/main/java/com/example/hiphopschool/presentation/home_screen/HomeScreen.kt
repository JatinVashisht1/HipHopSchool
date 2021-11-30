package com.example.hiphopschool.presentation.home_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.hiphopschool.MainActivity
import com.example.hiphopschool.presentation.home_screen.components.ContentListItem
import com.example.hiphopschool.presentation.home_screen.components.CustomBackground

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: HomeScreenViewModel = hiltViewModel(),
    mainActivity: MainActivity
) {
    val contentItems = viewModel.topicListState.value
    val quote = viewModel.quote.value
    Box(modifier = Modifier.fillMaxSize()) {
        CustomBackground()
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            items(contentItems) { item ->
                ContentListItem(
                    hsRowPairItem = item,
                    mainActivity = mainActivity,
                    navController = navController
                )
            }

            item(1) {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp)
                    ) {
                        Text(
                            text = quote.quote,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .align(Alignment.Start)
                                .padding(4.dp)
                        )
                        Text(
                            text = "-" + quote.author,
                            modifier = Modifier
                                .align(Alignment.End)
                                .padding(4.dp)
                        )
                        Button(
                            onClick = { viewModel.getRandomQuote() },
                            modifier = Modifier
                                .shadow(20.dp)
                                .align(Alignment.CenterHorizontally),
                        ) {
                            Text(
                                text = "Next",
                                color = MaterialTheme.colors.primaryVariant
                            )
                        }
                    }
                }
            }
        }
    }
}