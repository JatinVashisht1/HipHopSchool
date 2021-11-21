package com.example.hiphopschool.presentation.history_screen.components

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter

@Composable
fun GenericScreen(
    headLineText: String,
    bodyText: String
) {
    val textState = rememberSaveable { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .animateContentSize(tween(300))
            .clickable { textState.value = !textState.value }
            .padding(8.dp),
        backgroundColor = MaterialTheme.colors.secondary
    ) {
        Column {
            Text(
                text = headLineText,
                modifier = Modifier
                    .align(Alignment.Start)
                    .padding(8.dp),
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colors.primaryVariant
            )

            if (textState.value) {
                Text(
                    text = bodyText,
                    modifier = Modifier
                        .align(Alignment.Start)
                        .padding(8.dp),
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.Normal,
                    color = MaterialTheme.colors.primaryVariant
                )
            }
        }
    }
}