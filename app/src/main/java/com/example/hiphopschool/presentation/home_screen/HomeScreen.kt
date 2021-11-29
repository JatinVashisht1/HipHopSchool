package com.example.hiphopschool.presentation.home_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.hiphopschool.MainActivity
import com.example.hiphopschool.presentation.home_screen.components.ContentListItem

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: HomeScreenViewModel = hiltViewModel(),
    mainActivity: MainActivity
) {
    val contentItems = viewModel.topicListState.value
    val quote = viewModel.quote.value
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
//            Spacer(modifier = Modifier.padding(top = 0.dp))
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
//                    val quote = quotes.random()
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
                        onClick = { viewModel.getRandomQuote()},
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
//                            .background(MaterialTheme.colors.primaryVariant),
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
