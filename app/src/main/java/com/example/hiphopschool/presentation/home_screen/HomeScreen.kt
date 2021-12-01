package com.example.hiphopschool.presentation.home_screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.hiphopschool.MainActivity
import com.example.hiphopschool.presentation.home_screen.components.ContentListItem
import com.example.hiphopschool.core.CustomBackground
import com.example.hiphopschool.presentation.home_screen.components.QuoteCard

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
                QuoteCard(quote = quote, viewModel = viewModel)
            }
        }
    }
}