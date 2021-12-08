package com.example.hiphopschool.core

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path

@Composable
fun CustomBackground() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val path = Path().apply {
            this.moveTo(0f, 0f)
            lineTo(size.width - 0f, 0f)
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
            lineTo(0f, 0f)
            lineTo(0f, 0f)
            close()
        }

        drawPath(
            path = path,
            brush = Brush.linearGradient(colors = listOf(Color(0xFF2B6D79), Color(0xFFC41D74))),
        )
    }
}