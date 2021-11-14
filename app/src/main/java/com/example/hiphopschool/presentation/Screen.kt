package com.example.hiphopschool.presentation

sealed class Screen(val route: String){
    object HomeScreen : Screen("Home Screen")
    object HistoryScreen : Screen("History Screen")
    object GOATScreen : Screen("GOATScreen")
    object BeefsScreen : Screen("BeefsScreen")
    object CurrentScenario : Screen("CurrentScenario")
    object BestAlbums : Screen("BestAlbums")
    object MajorYears : Screen("MajorYears")
    object RandomFacts : Screen("RandomFacts")
    object GreatestHits : Screen("GreatestHits")
}
