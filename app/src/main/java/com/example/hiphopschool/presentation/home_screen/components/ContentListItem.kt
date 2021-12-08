package com.example.hiphopschool.presentation.home_screen.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.hiphopschool.MainActivity

@Composable
fun ContentListItem(
    hsRowPairItem: HSRowPairItem,
//    mainActivity: MainActivity,
    navController: NavHostController
) {
    ColumnItem(
        textFirst = hsRowPairItem.textFirst,
        textSecond = hsRowPairItem.textSecond,
//        mainActivity = mainActivity,
        navController = navController
    )
}