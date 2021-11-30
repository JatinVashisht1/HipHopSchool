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
import com.example.hiphopschool.presentation.beef.BeefScreen
import com.example.hiphopschool.presentation.best_albums.BestAlbum
import com.example.hiphopschool.presentation.curent_scenario.CurrentScenario
import com.example.hiphopschool.presentation.goat_screen.GoatScreen
import com.example.hiphopschool.presentation.greatest_hits.GreatestHitsScreen
import com.example.hiphopschool.presentation.history_screen.HistoryScreen
import com.example.hiphopschool.presentation.home_screen.HomeScreen
import com.example.hiphopschool.presentation.major_years.MajorYearScreen
import com.example.hiphopschool.presentation.ui.theme.HipHopSchoolTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HipHopSchoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.primary) {
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
                            GoatScreen()
                        }
                        composable(route = Screen.GreatestHits.route){
                            GreatestHitsScreen()
                        }
                        composable(route = Screen.BeefsScreen.route){
                            BeefScreen()
                        }
                        composable(route = Screen.CurrentScenario.route){
                            CurrentScenario()
                        }
                        composable(route = Screen.MajorYears.route){
                            MajorYearScreen()
                        }
                        composable(route = Screen.BestAlbums.route){
                            BestAlbum()
                        }
                        composable(route = Screen.RandomFacts.route){

                        }
                    }
                }
            }
        }
    }
}