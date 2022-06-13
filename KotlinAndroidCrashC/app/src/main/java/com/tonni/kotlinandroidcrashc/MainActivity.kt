package com.tonni.kotlinandroidcrashc

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.tonni.kotlinandroidcrashc.ui.theme.MyFontFamily
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           // Text(text ="Hello Kotlin jetpack", fontSize = 30.sp)
            //Display1()
            //Display2("Nishat")
            //Display3()
            //Display4()
            //SimpleText()
            //LongText()
            //SelectableText()
            //PartiallySelectableText()
            //RowExample()
            //ColumnExample()
            //LazyRowExample()
            //LazyColumnExample()
            //BoxExample()
            //MaterialUIApp()
            //ImageAssertExample()
            //ImageNetworkExample()
            //IconExample()
            //CardExample()
            //StatefulExample()
            //HelloScreen()
            //ButtonExample()
            //TextFieldExample()
            Registration()





        }
    }
}

class LazyColumnEx {

}

@Composable
fun Display1(){
    Text(text ="Hello Tonni", fontSize = 30.sp)
}

@Composable
fun Display2(name: String){
    Text(text ="Hello $name", fontSize = 30.sp)
}

@Composable
fun Display3(){
    Column {
        Text(text ="Hello Nishat", fontSize = 30.sp)
        Text(text ="Hello tasnim", fontSize = 30.sp)
        Text(text ="Hello Tonni", fontSize = 30.sp)
    }
}

@Composable
fun Display4(){
    val names = listOf<String>("Tonni","Keya","Monty","Sadia")
   Column {
       for (name in names){
           Text(text = "Hello $name", fontSize = 30.sp)
       }

   }
}

@Composable
fun SimpleText(){
    Text(text = "Hello Kotlin",
        fontSize = 30.sp,
        color = Color.Green,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = MyFontFamily,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color.Red)
            .width(410.dp)

    )
}

@Composable
fun LongText(){
    Text(text = "Tonni ".repeat(6), fontSize = 30.sp, maxLines = 2)
}

@Composable
fun SelectableText(){
    SelectionContainer {
        Text(text = "Hello this is Kotlin Jetpack Compose", fontSize = 30.sp)
    }
}
@Composable
fun PartiallySelectableText(){
    Column{
        SelectionContainer {
            Column{
                Text(text = "This is selectable text", fontSize = 30.sp)
                DisableSelection {
                    Text(text = "This is non selectable text", fontSize = 30.sp)
                }
            }
        }
    }

}

@Composable
fun RowExample(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Color.LightGray)
        .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically

    ){
        Text(text = "First ",fontSize = 30.sp)
        Text(text = "Jetpack ",fontSize = 30.sp)
        Text(text = "Kotlin ",fontSize = 30.sp)
        Text(text = "Hello ",fontSize = 30.sp)
        Text(text = "Jetpack ",fontSize = 30.sp)
        Text(text = "Kotlin ",fontSize = 30.sp)
        Text(text = "Hello ",fontSize = 30.sp)
        Text(text = "Jetpack ",fontSize = 30.sp)
        Text(text = "Kotlin ",fontSize = 30.sp)
        Text(text = "Hello ",fontSize = 30.sp)
        Text(text = "Jetpack ",fontSize = 30.sp)
        Text(text = "Last ",fontSize = 30.sp)

    }
}

@Composable
fun ColumnExample(){
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(color = Color.LightGray),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(text = "First ",fontSize = 30.sp)
        Text(text = "Jetpack ",fontSize = 30.sp)
        Text(text = "Kotlin ",fontSize = 30.sp)
    }
}

@Composable
fun LazyRowExample() {
    LazyRow(
        modifier = Modifier
            .background(color = Color.Red) ,
        contentPadding = PaddingValues(horizontal = 50.dp ,vertical = 20.dp) ,
        horizontalArrangement = Arrangement.spacedBy(50.dp)

    ) {

        //add a single item
        item { Text(text = "First Item" ,fontSize = 30.sp) }

        //add a multiple items
        items(50) { i -> Text(text = " Item $i" ,fontSize = 30.sp) }

        //add a single item
        item { Text(text = "Last Item" ,fontSize = 30.sp) }
    }
}
    @Composable
    fun LazyColumnExample() {
        LazyColumn(
            modifier = Modifier
                .background(color = Color.Magenta)
                .fillMaxWidth() ,
            horizontalAlignment = Alignment.CenterHorizontally ,
            contentPadding = PaddingValues(horizontal = 50.dp ,vertical = 20.dp) ,
            verticalArrangement = Arrangement.spacedBy(50.dp)

        ) {
            //add a single item
            item { Text(text = "First Item" ,fontSize = 30.sp) }

            //add a multiple items
            items(50) { i -> Text(text = " Item $i" ,fontSize = 30.sp) }

            //add a single item
            item { Text(text = "Last Item" ,fontSize = 30.sp) }
        }
    }

@Composable
   fun BoxExample(){

        Box(modifier = Modifier
            .background(color = Color.Magenta)
            .fillMaxWidth(0.5f)
            .fillMaxHeight(0.5f)

        ){
             Text(text = "This is outer Box......")
            Box(modifier = Modifier
                .background(color = Color.Gray)
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)) {
                Text(text = "This is inner Box......")

            }
   }
}

@Composable
   fun MaterialUIApp(){
       Scaffold(
           topBar = {
               TopAppBar(
                   title = {
                       Text(text = "Material App")
                   },
                   actions = {
                       IconButton(onClick = { Log.d("ButtonClicked","Search Button Clicked")
                       }) {
                           Icon(Icons.Filled.Search, contentDescription = null)
                           
                       }
                   }
               )
           }
       ) {
           LazyColumnExample()
       }
}

@Composable
fun ImageAssertExample(){
    
    Image(painter = painterResource(id = R.drawable.ttt) ,
        contentScale = ContentScale.Crop,
        contentDescription = "Profile Image",
        modifier = Modifier
            .border(5.5.dp ,Color.Green ,CircleShape)
            .size(500.dp)
            .clip(shape = CircleShape)

    )

}

@Composable
fun ImageNetworkExample(){

    Image(
        painter = rememberImagePainter(
        data = "https://www.google.com/search?q=picture&tbm=isch&hl=en&sa=X&ved=2ahUKEwixj4KziZ_1AhVTyKACHS0MDoUQ3VZ6BAgBEBo&biw=990&bih=895#imgrc=Z3P5pHK_L9fCvM"
         ),
        contentScale = ContentScale.Crop,
        contentDescription = "Profile Image",
        modifier = Modifier
            .border(5.5.dp ,Color.Red ,CircleShape)
            .size(500.dp)
            .clip(shape = CircleShape)
    )
}

@Composable
fun IconExample(){
    Icon(
        Icons.Filled.Menu,
        contentDescription = "Menu",
        modifier = Modifier.size(50.dp),
        tint = Color.Blue
    )
}

@Composable
   fun CardExample(){
        Card(

            shape = RoundedCornerShape(10.dp),
            backgroundColor = Color.Magenta,
            border = BorderStroke(5.dp, Color.Black),
            contentColor = Color.White

        )
        {
            Column(modifier = Modifier.padding(40.dp)) {
                Text(text = "This is Card...",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,

                    )
                Spacer(modifier = Modifier.height(100.dp))
                
                Text(text = "Jetpack",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,

                    )
            }
   }
}

@Composable
fun StatefulExample(){
    var name:String by remember{ mutableStateOf("")}
    Column() {
        OutlinedTextField(value = name ,onValueChange = {name = it})
        Text(text = name, fontSize = 30.sp)
    }
}

//State Hoisting
@Composable
fun HelloScreen(){
    var name:String by remember{ mutableStateOf("")}
    HelloContent(name = name, OnNameChange = {name = it})
}

@Composable
fun HelloContent(name:String, OnNameChange:(String) -> Unit){
    Column() {
        OutlinedTextField(value = name ,onValueChange = OnNameChange)
        Text(text = name, fontSize = 30.sp)
    }
}

@Composable
fun ButtonExample(){
    
    Column() {
        Button(
            onClick = {Log.d("Button","Button Clicked")},
            modifier = Modifier.padding(20.dp),
            contentPadding = PaddingValues(start = 40.dp, top = 20.dp, end = 40.dp, bottom = 20.dp),
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta),
            shape = CircleShape,
            border = BorderStroke(2.dp, Color.DarkGray)
        ) {
            Text(text = "Login", fontSize = 30.sp)
        }

        TextButton(
            onClick = {Log.d("TextButton","Text Button Clicked")},
            modifier = Modifier.padding(20.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Green),

        ) {
            Text(text = "TextButton", fontSize = 24.sp)
        }

        OutlinedButton(
            onClick = {Log.d("OutLineButton","OutLine Button Clicked")},
            modifier = Modifier.padding(20.dp),
            contentPadding = PaddingValues(start = 40.dp, top = 20.dp, end = 40.dp, bottom = 20.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Blue),
            shape = CircleShape,
            border = BorderStroke(2.dp, Color.DarkGray)
        ) {
            Text(text = "OutlinedButton", fontSize = 24.sp)
        }

        IconButton(
            onClick = {Log.d("IconButton","Icon Button Clicked")},
            modifier = Modifier
                .padding(20.dp)
                .then(Modifier.size(50.dp))
                .border(2.dp ,Color.Blue ,shape = CircleShape)
        ) {
            Icon(Icons.Default.Add, contentDescription = "Icon Button", tint = Color.Blue)
        }

        FloatingActionButton(
            onClick = {Log.d("FloatingActionButton","FloatingAction Button Clicked")},
            modifier = Modifier.padding(20.dp),
            backgroundColor = Color.DarkGray

        ) {
            Icon(Icons.Default.Settings, contentDescription = "FloatingAction Button")
        }
    }
}

@Composable
fun TextFieldExample(){
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ){
        item {
            TextField(
                value = "",
                onValueChange = {},
                label = {Text(text = "Name")},
                placeholder = { Text(text = "Write your name")},
                textStyle = TextStyle(color = Color.Blue),
                shape = RoundedCornerShape(10.dp),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = ""
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Green,
                    unfocusedIndicatorColor = Color.Transparent
                ),
               // readOnly = true,
               // singleLine = true,
            )
        }

        item {
            OutlinedTextField(
                value = "" ,
                onValueChange = {},
                label = { Text(text = "Email")},
                placeholder = { Text(text = "Write your email")},
                textStyle = TextStyle(color = Color.Blue),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = ""

                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Blue,
                    unfocusedIndicatorColor = Color.DarkGray
                ),
               // readOnly = true,
               // singleLine = true,
            )
        }

        item {
            OutlinedTextField(
                value = "password" ,
                onValueChange = {},
                label = { Text(text = "Password")},
                placeholder = { Text(text = "Write your password")},
                textStyle = TextStyle(color = Color.Blue),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = ""

                    )
                },
                shape = RoundedCornerShape(10.dp),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color.Blue,
                    unfocusedIndicatorColor = Color.DarkGray
                ),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
        }
    }
}

@Composable
fun Registration(){
    var name:String by remember { mutableStateOf("")}
    var email:String by remember { mutableStateOf("")}
    var password:String by remember { mutableStateOf("")}

    LazyColumn(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),

        ){

        item {
            OutlinedTextField(
                value = name ,
                onValueChange = {name = it},
                label = { Text(text = "Name")},
            )
        }

        item {
            OutlinedTextField(
                value = email ,
                onValueChange = {email = it},
                label = { Text(text = "Email")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
        }

        item {
            OutlinedTextField(
                value = password ,
                onValueChange = {password = it},
                label = { Text(text = "Password")},
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation(),
            )
        }

        item {
            Button(
                onClick = {Log.d("SubmitButton","Name: $name Email: $email Password: $password")},
                contentPadding = PaddingValues(start = 20.dp, top = 10.dp, end = 20.dp, bottom = 10.dp),
                colors = ButtonDefaults.buttonColors(contentColor = Color.White, backgroundColor = Color.DarkGray),
                shape = CircleShape

                  )
            {
                Text(text = "Submit")

            }
        }

    }
}

