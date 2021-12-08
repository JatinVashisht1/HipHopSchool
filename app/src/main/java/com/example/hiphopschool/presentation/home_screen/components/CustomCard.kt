package com.example.hiphopschool.presentation.home_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.hiphopschool.MainActivity
import com.example.hiphopschool.presentation.Screen
import java.io.File

@Composable
fun CustomCard(
    modifier: Modifier = Modifier,
    text: String,
//    application: MainActivity,
    navController: NavHostController,
) {

    Box(
        modifier = modifier
            .padding(4.dp)
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf<Color>(
                        Color(0xFF275A29), Color(0xFF4CAF50)
                    )
                )
            )
//            .shadow(elevation = 0.dp, shape = RectangleShape, clip = true)
            .clickable {
                when (text) {
                    "History" -> {
                        navController.navigate(Screen.HistoryScreen.route)
                    }
                    "Greatest of All Time" -> {
                        navController.navigate(Screen.GOATScreen.route)
                    }
                    "Greatest Hits" -> {
                        navController.navigate(Screen.GreatestHits.route)
                    }
                    "Beefs" -> {
                        navController.navigate(Screen.BeefsScreen.route)
                    }
                    "Current Scenario" -> {
                        navController.navigate(Screen.CurrentScenario.route)
                    }
                    "Major Years" -> {
                        navController.navigate(Screen.MajorYears.route)
                    }
                    "Best Albums" -> {
                        navController.navigate(Screen.BestAlbums.route)
                    }
                    "Random Facts" -> {
                        navController.navigate(Screen.RandomFacts.route)
                    }
                }
            },

        ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
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

