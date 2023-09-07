package com.abacha.azkarapp.navigation.navigationAdiya

sealed class AdiyaNavItem(var route:String) {
    object Home : AdiyaNavItem("home")
    object Sabah : AdiyaNavItem("sabah")
    object Masaa : AdiyaNavItem("masaa")
    object Nawm : AdiyaNavItem("nawm")
    object Salah : AdiyaNavItem("salah")
    object Monawaa : AdiyaNavItem("monawaa")
}

