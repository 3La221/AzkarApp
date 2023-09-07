package com.abacha.azkarapp.screen

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.abacha.azkarapp.R
import com.abacha.azkarapp.navigation.navigationAdiya.AdiyaNavItem
import com.abacha.azkarapp.navigation.navigationAdiya.AdiyaNavigationGraph
import com.abacha.azkarapp.navigation.navigationBar.BottomNavItem


@Composable
fun MainHomeScreen (){

    AdiyaNavigationGraph()

}
@Composable
fun HomeScreen(
    navController: NavController
)
{
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "الأذكار", fontFamily = FontFamily(Font(R.font.cairo_600)),
        fontSize = 24.sp,modifier = Modifier.padding(top = 32.dp, bottom = 16.dp)
            )
        DoaaCard(
            R.drawable.sabah
        ){
            navController.navigate(route =AdiyaNavItem.Sabah.route)
        }

        DoaaCard(
            R.drawable.masaaazkar
        ){
            navController.navigate(route = AdiyaNavItem.Masaa.route)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "أذكار متنوعة", fontFamily = FontFamily(Font(R.font.cairo_600)),
             textAlign = TextAlign.Right,modifier = Modifier.padding(start = 200.dp, end = 10.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))


        DoaaCard(
            R.drawable.salah
        ){
            navController.navigate(AdiyaNavItem.Salah.route)

        }

        DoaaCard(
            R.drawable.nawm
        ){
            navController.navigate(AdiyaNavItem.Nawm.route)

        }

        DoaaCard(
            R.drawable.motanawia
        ){
            navController.navigate(AdiyaNavItem.Monawaa.route)

        }


    }

}

@Composable
fun DoaaCard(
    image : Int,
    onClick : () -> Unit
){
    Card(
        modifier = Modifier
            .padding(vertical = 12.dp, horizontal = 22.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(CornerSize(10.dp)),
        elevation = 6.dp

    ) {
        Image(painter = painterResource(image), contentDescription = null )

    }


}