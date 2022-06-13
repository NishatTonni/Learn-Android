package com.tonni.toolbar

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tonni.toolbar.ui.theme.ToolbarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Text("Demo App")
                        } ,
                        navigationIcon = {
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.Menu ,contentDescription = "menu")
                            }
                        } ,
                        actions = {
                            IconButton(onClick = { }) {
                                Icon(
                                    Icons.Filled.Notifications ,
                                    contentDescription = "notification"
                                )
                            }
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.Settings ,contentDescription = "setting")
                            }
                            IconButton(onClick = { }) {
                                Icon(Icons.Filled.Search ,contentDescription = "search")
                            }
                        }
                    )
                } ,
                floatingActionButton = {
                    FloatingActionButton(onClick = { }) {
                        IconButton(onClick = { }) {
                            Icon(Icons.Filled.Add ,contentDescription = "add")
                        }
                    }
                } ,
                bottomBar = {
                    BottomAppBar(
                        backgroundColor = Color.DarkGray,
                        elevation = 10.dp

                    ) {

                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Phone ,contentDescription = "phone", modifier = Modifier.size(35.dp), Color.White)
                                }
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.Home ,contentDescription = "home", modifier = Modifier.size(35.dp), Color.White)
                                }
                                IconButton(onClick = { }) {
                                    Icon(Icons.Filled.LocationOn ,contentDescription = "location",
                                        modifier = Modifier
                                            .size(35.dp), Color.White,
                                    )
                            }
                        }

                }
            ) {
                ShowSwitch()
                Text(text = "Hello Tonni", fontSize = 20.sp, fontStyle = FontStyle.Italic)
            }
        }
    }
}

@Composable
fun ShowSwitch(){
    val isChecked = remember{
        mutableStateOf(true)
    }
    Switch(
        checked = isChecked.value ,
        onCheckedChange ={
            isChecked.value = it
        },
        modifier = Modifier.run {
            size(20.dp)
            padding(30.dp)
        }
    )
}


