package com.example.hiphopschool.presentation.scaffold_components.top_app_bar

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MenuOpen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun CustomAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = Icons.Default.MenuOpen,
                contentDescription = "Menu",
                Modifier
                    .size(40.dp, 40.dp)
                    .clickable {
                        scope.launch(Dispatchers.IO) {
                            scaffoldState.drawerState.open()
                        }
                    }
                    .padding(start = 2.dp)
            )
            Text(
                "Hip Hop School",
                style = MaterialTheme.typography.h6,
                modifier = Modifier
                    .padding(8.dp)
            )
        }
    }
}