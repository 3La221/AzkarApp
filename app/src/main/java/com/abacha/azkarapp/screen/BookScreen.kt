package com.abacha.azkarapp.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.abacha.azkarapp.Doaa
import com.abacha.azkarapp.R
import com.abacha.azkarapp.data.AdiyaData
import com.abacha.azkarapp.fawaed
import com.abacha.azkarapp.model.DoaaData
import kotlin.random.Random


@Composable
fun BookScreen()
{
    val tmp1 = stringResource(id = R.string.faeda1)
    val tmp2 = stringResource(id = R.string.faeda2)
    val tmp3 = stringResource(id = R.string.faeda3)
    val tmp4 = stringResource(id = R.string.faeda4)


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "أية و فائدة",
            fontFamily = FontFamily(Font(R.font.cairo_600)),
            fontSize = 30.sp

        )

        val x = getRandomNumberInRange(1,4)

        when(x){
            1->fawaed(faida = tmp1.split("XX").random())
            2->fawaed(faida = tmp2.split("XX").random())
            3->fawaed(faida = tmp3.split("XX").random())
            4->fawaed(faida = tmp4.split("XX").random())
        }

    }
}

fun getRandomNumberInRange(start: Int, end: Int): Int {
    return Random.nextInt(start, end + 1)
}