package com.example.hiphopschool.presentation.home_screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.hiphopschool.MainActivity
import com.example.hiphopschool.presentation.home_screen.components.ColumnItem
import com.example.hiphopschool.presentation.home_screen.components.ContentListItem

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: HomeScreenViewModel = hiltViewModel(),
    mainActivity: MainActivity
) {
    val contentItems = viewModel.topicListState.value
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {
        items(contentItems) {item->
            ContentListItem(
                hsRowPairItem = item,
                mainActivity = mainActivity
            )

        }
    }
}