package com.abacha.azkarapp.navigation.navigationBar

import com.abacha.azkarapp.R

sealed class BottomNavItem (var title : String, var icon : Int, var route:String){

    object Home: BottomNavItem("رئيسية", R.drawable.home_unselected , "home")
    object Book: BottomNavItem("أدعية", R.drawable.book_unselected , "book")
    object Tasbeeh: BottomNavItem("تسبيح", R.drawable.sabhah_unselected , "sabhah")

}

