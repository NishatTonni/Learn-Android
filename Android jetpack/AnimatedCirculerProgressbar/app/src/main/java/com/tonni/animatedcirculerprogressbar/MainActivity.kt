package com.tonni.animatedcirculerprogressbar

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                CircularProgressbar(percentage = 0.8f ,number = 100)
            }

        }
    }
}

@Composable
fun CircularProgressbar(
    percentage: Float ,
    number: Int ,
    fontSize: TextUnit = 28.sp ,
    radius: Dp = 50.dp ,
    color: androidx.compose.ui.graphics.Color = androidx.compose.ui.graphics.Color.Cyan,
    strokeWidth: Dp = 8.dp ,
    animationDuration: Int = 1000 ,
    animDelay: Int = 0
    ){

    var animationPlayed by remember{
        mutableStateOf(false)
    }
    val curPercentage = animateFloatAsState(
        targetValue = if (animationPlayed) percentage else 0f,
        animationSpec = tween(
            durationMillis = animationDuration,
            delayMillis = animDelay
        )
    )
    LaunchedEffect(key1 = true){
        animationPlayed = true
    }

    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier.size(radius * 2f)
            ){
        Canvas( modifier =  Modifier.size(radius * 2f)

        ){
            drawArc(
                color = color,
                -90f,
                360 * curPercentage.value,
                useCenter = false,
                style = Stroke(strokeWidth.toPx(), cap  = StrokeCap.Round)
            )
        }
        Text(text = (curPercentage.value * number).toInt().toString(),
            color = Black,
            fontSize = fontSize,
            fontWeight = FontWeight.Bold
        )

    }

}
