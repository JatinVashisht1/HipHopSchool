package com.example.hiphopschool.presentation.credits.components

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import dagger.hilt.android.qualifiers.ApplicationContext

@Composable
fun CreditItem(
    item: CreditLinks,
    context: Context
) {

   Card(
       modifier = Modifier.fillMaxSize()
   ) {
       Row(
           modifier = Modifier.fillMaxSize(),
           horizontalArrangement = Arrangement.SpaceBetween
       ) {


          Text(
              text = item.name + " ",
              fontWeight = if (item.link.isNullOrBlank()) FontWeight.Bold else FontWeight.Normal,
              style = if(item.link == null)MaterialTheme.typography.h6 else MaterialTheme.typography.body1
          )
           item.link?.let { Text(text = it + "\n", modifier = Modifier.clickable {
               val intent = Intent(Intent.ACTION_VIEW)
               intent.setData(Uri.parse(item.link))
               context.startActivity(intent)
           },
               color = Color.Yellow

           ) }
       }
   }
}