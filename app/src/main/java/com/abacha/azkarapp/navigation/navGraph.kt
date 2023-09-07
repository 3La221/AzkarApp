package com.abacha.azkarapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.abacha.azkarapp.MainScreenView
import com.abacha.azkarapp.screen.SplashScreen

@Composable
fun navGraph(
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = navItems.Splash.route ){

        composable(route = navItems.Splash.route){
            SplashScreen(navController)

        }

        composable(route = navItems.Main.route){
            MainScreenView()

        }



    }



}