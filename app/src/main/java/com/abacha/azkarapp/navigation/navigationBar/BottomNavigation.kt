package com.abacha.azkarapp.navigation.navigationBar


import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.abacha.azkarapp.ui.theme.bgColor
import com.abacha.azkarapp.ui.theme.selectedIcon
import com.abacha.azkarapp.ui.theme.unselectedIcon
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun BottomNavigationD(navController : NavController){
    val systemUiController = rememberSystemUiController()
    val items = listOf(
        BottomNavItem.Home,
        BottomNavItem.Book,
        BottomNavItem.Tasbeeh,
    )
    
   BottomNavigation(
       modifier = Modifier
           .height(75.dp)
           .width(428.dp),
       backgroundColor = bgColor,
       elevation = 6.dp
   ) {
       val navBackStackEntry by navController.currentBackStackEntryAsState()
       val currentRoute = navBackStackEntry?.destination?.route

       items.forEach { item ->
           BottomNavigationItem(
               icon = { Icon(
                   painter = painterResource(id = item.icon), contentDescription = null
               , modifier = Modifier.size(20.dp)
               )},
               unselectedContentColor = unselectedIcon,

               selected = currentRoute == item.route,
               selectedContentColor = selectedIcon,
               onClick = {
                   navController.navigate(item.route){
                       navController.graph.startDestinationRoute?.let { screen_route ->
                           popUpTo(screen_route) {
                               saveState = true
                           }
                       }
                       launchSingleTop = true
                       restoreState = true
                   }
               }
           )
       }

   }





   }


