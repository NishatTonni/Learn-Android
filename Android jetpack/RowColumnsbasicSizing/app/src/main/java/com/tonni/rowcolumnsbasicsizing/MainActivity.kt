package com.tonni.rowcolumnsbasicsizing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tonni.rowcolumnsbasicsizing.ui.theme.RowColumnsbasicSizingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

             Column(
                 horizontalAlignment = Alignment.CenterHorizontally,

                 modifier = Modifier
                     .background(Color.Magenta)
                     .fillMaxSize(),
                 verticalArrangement = Arrangement.SpaceEvenly

             )


             {
                 Text(text = "Nishat", fontSize = 20.sp)
                 Text(text = "Tonni", fontSize = 20.sp)
                 Text(text = "Tasnim", fontSize = 20.sp)

             }

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,

                modifier = Modifier
                    .background(Color.LightGray)
                    .width(200.dp)
                    .height(200.dp),
                verticalAlignment = Alignment.CenterVertically

            )


            {
                Text(text = "Nishat", fontSize = 20.sp)
                Text(text = "Tonni", fontSize = 20.sp)
                Text(text = "Tasnim", fontSize = 20.sp)

            }

        }
    }
}
