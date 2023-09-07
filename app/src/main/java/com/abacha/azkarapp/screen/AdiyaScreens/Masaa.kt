package com.abacha.azkarapp.screen.AdiyaScreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abacha.azkarapp.Doaa
import com.abacha.azkarapp.R
import com.abacha.azkarapp.data.AdiyaData

@Composable
fun Masaa(){

    val adyialist = AdiyaData().getMasaaData()
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(bottom = 80.dp)
    ) {

        Text(text = "أذكار المساء", fontFamily = FontFamily(Font(R.font.cairo_600)),
            fontSize = 24.sp,modifier = Modifier.padding(top = 32.dp, bottom = 16.dp)
        )

        LazyColumn{
            items(adyialist){
                Doaa(it)
            }
        }


    }

}