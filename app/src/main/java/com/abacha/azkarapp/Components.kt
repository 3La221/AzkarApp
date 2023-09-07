package com.abacha.azkarapp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abacha.azkarapp.model.DoaaData
import com.abacha.azkarapp.ui.theme.selectedIcon


@Composable
fun Counter (
    Rep : Int = 1,
    Current : Int = 0
){
    Box(
        modifier = Modifier
            .padding(12.dp)
            .background(selectedIcon, shape = RoundedCornerShape(CornerSize(8.dp)))
           ,
        contentAlignment = Alignment.Center
    ) {

        Text(text = "$Current/${Rep}",
            color = Color.White,
            fontFamily = FontFamily(Font(R.font.cairo_600)),
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 2.dp)
            )

        
    }
}
@Composable
fun fawaed(
    faida : String,
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable { },
        shape = RoundedCornerShape(CornerSize(10.dp)),
        elevation = 6.dp
    ) {
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = faida,
                fontFamily = FontFamily(Font(R.font.cairo_600)),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(30.dp)
            )



        }




    }
}


@Composable
fun Doaa (
    ElDoaa : DoaaData,
){
    val current = rememberSaveable{
        mutableStateOf(0)
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .clickable { if (current.value < ElDoaa.rep) current.value++ },
        shape = RoundedCornerShape(CornerSize(10.dp)),
        elevation = 6.dp
    ) {
        Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text(
                text = stringResource(ElDoaa.doaa),
                fontFamily = FontFamily(Font(R.font.cairo_600)),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)
            )

                Counter(Rep = ElDoaa.rep, Current = current.value)




        }




    }


}

@Composable
fun SabhahBtn(
    number : Int = 0
){
    Box(contentAlignment = Alignment.Center,
    modifier = Modifier.clip(shape = CircleShape)
        ){

        SabhahCircle()
        Text(text = "$number", fontSize = 60.sp,
            fontFamily = FontFamily(Font(R.font.cairo_600)),
            color = Color.White
        )
        
    }
}

@Composable
fun SabhahCircle(){

    Box(
        contentAlignment = Alignment.Center
    ){
        Image(painter = painterResource(id = R.drawable.btn), contentDescription = null )
        Image(painter = painterResource(id = R.drawable.shadow2), contentDescription = null )
        Image(painter = painterResource(id = R.drawable.shadow1), contentDescription = null )

    }
    
    
}