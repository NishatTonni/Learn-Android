package com.tonni.modifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.TestModifierUpdaterLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tonni.modifiers.ui.theme.ModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
/*          Column(
              modifier = Modifier
                  .background(Color.Cyan)
                  .fillMaxHeight(0.5f)
                  .fillMaxWidth()
                  .border(10.dp, Color.Black)
                  .padding(5.dp)
                  .border(5.dp, Color.Red)
                  .padding(5.dp)
                  .border(10.dp, Color.DarkGray)
                  .padding(10.dp)
                  //.requiredWidth(600.dp)
          )

          {
              Text(text = "Hello", modifier = Modifier.clickable {

              })
              Spacer(modifier = Modifier.height(50.dp))
              Text(text = "Tonni", modifier = Modifier
                  .offset(50.dp, 20.dp))
          }*/

            var painter = painterResource(id = R.drawable.monkey)
            var description = "Monkey playing in the field"
            var title = "Monkey playing in the field"

            Box(modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(16.dp)

            ){
                ImageCard(painter = painter ,contentDescription = description ,title = title)

            }

        }
    }
}

//Image Card Composable.......
@Composable
fun ImageCard(painter: Painter ,
              contentDescription: String ,
              title: String ,
              modifier: Modifier = Modifier
) {
    Card(modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
        ) {
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = painter ,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            
            Box(modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black
                        ),
                        startY = 300f
                    )
                )

            )


            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart
            ){
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }
        }

    }

}

