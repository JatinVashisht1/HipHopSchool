package com.example.hiphopschool.presentation.home_screen.components

import androidx.compose.runtime.Composable
import com.example.hiphopschool.MainActivity

@Composable
fun ContentListItem(hsRowPairItem: HSRowPairItem, mainActivity: MainActivity) {
    ColumnItem(
        textFirst = hsRowPairItem.textFirst,
        textSecond = hsRowPairItem.textSecond,
        mainActivity = mainActivity
    )
}