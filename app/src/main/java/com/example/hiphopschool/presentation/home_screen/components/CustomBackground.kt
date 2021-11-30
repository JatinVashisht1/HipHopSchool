package com.example.hiphopschool.presentation.home_screen.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path

@Composable
fun CustomBackground() {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val path = Path().apply {
            this.moveTo((0.3f)*(size.width), 0f)
            lineTo(size.width-0f, 0f)
            lineTo(size.width, size.height)
            lineTo(0f, size.height)
            lineTo(0f, 0f)
            lineTo(0f, (0.19f)*size.height)
            close()
        }

        drawPath(
            path = path,
            color = Color(0xFF614185),
        )
    }
}