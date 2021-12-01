package com.example.hiphopschool.presentation.home_screen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import com.example.hiphopschool.data.QuotesItem
import com.example.hiphopschool.presentation.home_screen.HomeScreenViewModel

@Composable
fun QuoteCard(quote: QuotesItem, viewModel: HomeScreenViewModel) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
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
                text = "- " + quote.author,
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