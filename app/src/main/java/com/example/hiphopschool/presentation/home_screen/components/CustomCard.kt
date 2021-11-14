package com.example.hiphopschool.presentation.home_screen.components

import android.app.Application
import android.content.Context
import android.widget.Toast
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
import com.example.hiphopschool.MainActivity
import dagger.hilt.android.qualifiers.ApplicationContext

@Composable
fun CustomCard(
    modifier: Modifier = Modifier,
    text: String,
    application: MainActivity
) {
    Card(
        modifier = modifier
            .shadow(elevation = 4.dp, shape = RectangleShape, clip = true)
            .clickable {
                       Toast.makeText(application, text, Toast.LENGTH_SHORT).show()
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