package com.example.hiphopschool.presentation.home_screen.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.hiphopschool.MainActivity
import com.example.hiphopschool.presentation.Screen

@Composable
fun CustomCard(
    modifier: Modifier = Modifier,
    text: String,
    application: MainActivity,
    navController: NavHostController,

    ) {
    Card(
        modifier = modifier
            .shadow(elevation = 4.dp, shape = RectangleShape, clip = true)
            .clickable {
                if(text == "History")
                       navController.navigate(Screen.HistoryScreen.route)
            }
        ,
        backgroundColor = MaterialTheme.colors.primaryVariant
    ) {
        Column (verticalArrangement = Arrangement.Center){
            Text(
                text = text,
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp)
            )
        }
    }
}