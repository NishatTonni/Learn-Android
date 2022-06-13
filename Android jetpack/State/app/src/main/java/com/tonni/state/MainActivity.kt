package com.tonni.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import androidx.compose.ui.tooling.preview.Preview
import com.tonni.state.ui.theme.StateTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val color = remember{
                mutableStateOf(Color.Cyan)
            }

            Column(Modifier.fillMaxSize()) {
                ColorBox(
                    Modifier.weight(1f).fillMaxSize()
                ){
                    color.value = it
                }
                Box(modifier = Modifier
                    .background(color.value)
                    .weight(1f)
                    .fillMaxSize()
                )
            }

        }
    }
}

@Composable
fun ColorBox(modifier: Modifier = Modifier,
             updateColor: (Color) -> Unit
){


    Box(modifier = modifier
        .background(DarkGray)
        .clickable {
            updateColor(
                Color(
                    Random.nextFloat() ,
                    Random.nextFloat() ,
                    Random.nextFloat() ,
                    1f
                )
            )

        }

    )

}

