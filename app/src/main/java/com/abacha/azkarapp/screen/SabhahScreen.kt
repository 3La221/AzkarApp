package com.abacha.azkarapp.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abacha.azkarapp.Doaa
import com.abacha.azkarapp.R
import com.abacha.azkarapp.SabhahBtn

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SabhahScreen()
{
    val number = rememberSaveable{
        mutableStateOf(0)

    }
    Scaffold(
        topBar = {

                Text(text = "السبحة الالكترونية",
                    textAlign = TextAlign.Center,
                    fontFamily = FontFamily(Font(R.font.cairo_600)),
                fontSize = 24.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp, bottom = 16.dp)
                    )

           }
    ) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Card(
                modifier = Modifier
                    .clickable() { number.value++ }
                    .wrapContentSize(),
                shape = CircleShape

            ) {
                SabhahBtn(number = number.value)

            }
            Spacer(modifier = Modifier.height(60.dp))
            Box(
                modifier = Modifier.size(40.dp)
                    .clickable { number.value = 0 }
            ) {
                Image(painter = painterResource(id = R.drawable.reset), contentDescription = null)
            }


        }

    }



}


