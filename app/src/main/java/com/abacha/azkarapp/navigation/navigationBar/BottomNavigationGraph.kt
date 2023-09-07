package com.abacha.azkarapp.navigation.navigationBar

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.abacha.azkarapp.navigation.navigationAdiya.AdiyaNavItem
import com.abacha.azkarapp.screen.*
import com.abacha.azkarapp.screen.AdiyaScreens.Sabah

@Composable
fun BottomNavigationGraph (
    navController: NavHostController
){
    NavHost(navController = navController, startDestination = BottomNavItem.Home.route ){

        composable(BottomNavItem.Home.route){
            MainHomeScreen()
        }

        composable(BottomNavItem.Book.route){
            BookScreen()
        }

        composable(BottomNavItem.Tasbeeh.route){
            SabhahScreen()
        }




    }




}