package com.example.hiphopschool.presentation.home_screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.hiphopschool.MainActivity

@Composable
fun ColumnItem(
    textFirst: String,
    textSecond: String,
    mainActivity: MainActivity,
    navController: NavHostController
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CustomCard(
            text = textFirst,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .height(200.dp)
                .padding(4.dp),
            application = mainActivity,
            navController = navController
        )
        CustomCard(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(4.dp),
            text = textSecond,
            application = mainActivity,
            navController = navController
        )
    }
}