package com.example.hiphopschool

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.hiphopschool.presentation.Screen
import com.example.hiphopschool.presentation.history_screen.HistoryScreen
import com.example.hiphopschool.presentation.home_screen.HomeScreen
import com.example.hiphopschool.presentation.ui.theme.HipHopSchoolTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HipHopSchoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.secondary) {
                    val navController: NavHostController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.HomeScreen.route
                    ){
                        composable(route = Screen.HomeScreen.route){
                            HomeScreen(
                                navController = navController,
                                mainActivity = this@MainActivity
                            )
                        }
                        composable(route = Screen.HistoryScreen.route){
                            HistoryScreen()
                        }
                        composable(route = Screen.GOATScreen.route){

                        }
                        composable(route = Screen.GreatestHits.route){

                        }
                        composable(route = Screen.BeefsScreen.route){

                        }
                        composable(route = Screen.CurrentScenario.route){

                        }
                        composable(route = Screen.MajorYears.route){

                        }
                        composable(route = Screen.BestAlbums.route){

                        }
                        composable(route = Screen.RandomFacts.route){

                        }
                    }
                }
            }
        }
    }
}