package com.abacha.azkarapp.screen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.abacha.azkarapp.R
import com.abacha.azkarapp.navigation.navItems
import com.abacha.azkarapp.ui.theme.selectedIcon
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController){


    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if(startAnimation)1f else 0f,
        animationSpec = tween(
            durationMillis = 2000
        )
    )

    LaunchedEffect(key1 = true){
        startAnimation = true
        delay(2000)
        navController.navigate(route = navItems.Main.route )
    }


    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(
            text = "تسبيح",
            fontSize = 85.sp,
            fontFamily = FontFamily(Font(R.font.reemkufi)),
            color = selectedIcon
        )

    }

    
}