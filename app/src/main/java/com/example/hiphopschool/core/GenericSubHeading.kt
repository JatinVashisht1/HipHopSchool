package com.example.hiphopschool.core

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun GenericSubHeading(
    text: String
) {
    Text(
        text = text,
        style = MaterialTheme.typography.h6,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = 8.dp,
                top = 4.dp,
                end = 8.dp,
                bottom = 4.dp
            )
    )
}