package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                    LemonadeApp()
            }
        }
    }
}


@Composable
fun Header(appName: String ,modifier: Modifier = Modifier){
   Column(
       verticalArrangement = Arrangement.Top,
       horizontalAlignment = Alignment.CenterHorizontally,
       modifier = modifier
           .height(60.dp)
           .fillMaxWidth()
           .background(Color.Yellow)
   ) {
       Text(
        text = appName,
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = modifier
            .padding(16.dp)
       )
   }
}

@Composable
fun BodyMessage(modifier: Modifier= Modifier){
    var result by remember { mutableStateOf(1) }

    when (result){
        1 -> {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter =  painterResource(R.drawable.lemon_tree),
                    contentDescription = null,
                    modifier = modifier
                        .padding(18.dp)
                        .size(width = 300.dp, height = 300.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0xFF03DAC5))
                        .clickable {
                            result = 2
                        }

                )
                Text(
                    text = stringResource(R.string.lemon_tree),
                    fontSize = 18.sp,
                    modifier = modifier
                        .padding(16.dp)
                )
            }
        }
        2 -> {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter =  painterResource(R.drawable.lemon_squeeze),
                    contentDescription = null,
                    modifier = modifier
                        .padding(18.dp)
                        .size(width = 300.dp, height = 300.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0xFF03DAC5))
                        .clickable {
                           result++
                        }

                )
                Text(
                    text = stringResource(R.string.lemon),
                    fontSize = 18.sp,
                    modifier = modifier
                        .padding(16.dp)
                )
            }
        }
        6 -> {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter =  painterResource(R.drawable.lemon_drink),
                    contentDescription = null,
                    modifier = modifier
                        .padding(18.dp)
                        .size(width = 300.dp, height = 300.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0xFF03DAC5))
                        .clickable {
                            result = 7
                        }

                )
                Text(
                    text = stringResource(R.string.lemonade_glass),
                    fontSize = 18.sp,
                    modifier = modifier
                        .padding(16.dp)
                )
            }
        }
        7 -> {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter =  painterResource(R.drawable.lemon_restart),
                    contentDescription = null,
                    modifier = modifier
                        .padding(18.dp)
                        .size(width = 300.dp, height = 300.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0xFF03DAC5))
                        .clickable {
                            result = 1
                        }

                )
                Text(
                    text = stringResource(R.string.empty_lemonade_glass),
                    fontSize = 18.sp,
                    modifier = modifier
                        .padding(16.dp)
                )
            }
        }
        else ->{
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter =  painterResource(R.drawable.lemon_squeeze),
                    contentDescription = null,
                    modifier = modifier
                        .padding(18.dp)
                        .size(width = 300.dp, height = 300.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0xFF03DAC5))
                        .clickable {
                            result++
                        }

                )
                Text(
                    text = stringResource(R.string.lemon),
                    fontSize = 18.sp,
                    modifier = modifier
                        .padding(16.dp)
                )
            }
        }

    }


}


@Preview(showBackground = true)
@Composable
fun LemonadeApp() {
    Header("Lemonade")
    BodyMessage()
}