package com.abacha.azkarapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.rememberNavController
import com.abacha.azkarapp.navigation.navGraph
import com.abacha.azkarapp.navigation.navigationBar.BottomNavigationD
import com.abacha.azkarapp.navigation.navigationBar.BottomNavigationGraph
import com.abacha.azkarapp.ui.theme.AzkarAppTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    @SuppressLint("CoroutineCreationDuringComposition", "UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AzkarAppTheme {
                // A surface container using the 'background' color from the theme
                val navController = rememberNavController()
                Scaffold(
                ) {

                    navGraph(navController = navController)
                }

            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreenView(){

    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationD(navController = navController)}
    ) {

        BottomNavigationGraph(navController = navController)
    }
}