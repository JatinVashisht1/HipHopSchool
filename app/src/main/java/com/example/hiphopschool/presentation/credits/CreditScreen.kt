package com.example.hiphopschool.presentation.credits

import android.content.Context
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.hiphopschool.presentation.credits.components.CreditItem
import dagger.hilt.android.qualifiers.ApplicationContext

@Composable
fun CreditScreen(
    viewModel: CreditScreenViewModel = hiltViewModel(),
    appContext: Context
) {
    val creditList = viewModel.credits.value
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ){
        items(creditList){item->
            CreditItem(item = item, appContext)
        }
    }
}