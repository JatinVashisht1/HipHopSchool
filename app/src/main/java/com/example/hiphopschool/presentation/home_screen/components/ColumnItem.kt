package com.example.hiphopschool.presentation.home_screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.hiphopschool.MainActivity

@Composable
fun ColumnItem(
    textFirst: String,
    textSecond: String,
    mainActivity: MainActivity
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
            application = mainActivity
        )
        CustomCard(
            text = textSecond,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .padding(4.dp),
            application = mainActivity
        )
    }
}