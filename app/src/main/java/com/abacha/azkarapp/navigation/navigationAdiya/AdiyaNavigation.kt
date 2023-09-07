package com.abacha.azkarapp.navigation.navigationAdiya

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.abacha.azkarapp.screen.AdiyaScreens.*
import com.abacha.azkarapp.screen.HomeScreen

@Composable
fun AdiyaNavigationGraph(){
    val navController = rememberNavController()
    NavHost(navController = navController , startDestination = AdiyaNavItem.Home.route){
        composable(AdiyaNavItem.Home.route){
            HomeScreen(navController)
        }
        composable(AdiyaNavItem.Sabah.route){
            Sabah()
        }
        composable(AdiyaNavItem.Masaa.route){
            Masaa()
        }
        composable(AdiyaNavItem.Salah.route){
            Salah()
        }
        composable(AdiyaNavItem.Monawaa.route){
            Monawaa()
        }

        composable(AdiyaNavItem.Nawm.route){
            Sleep()
        }


    }

}