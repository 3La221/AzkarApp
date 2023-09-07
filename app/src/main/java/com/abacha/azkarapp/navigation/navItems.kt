package com.abacha.azkarapp.navigation

import com.abacha.azkarapp.navigation.navigationBar.BottomNavItem

sealed class navItems(val route: String) {
    object Splash : navItems("splash")
    object Main : navItems("main")
}
