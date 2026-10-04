package com.example.btvnui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.btvnui.ui.theme.BtvnuiTheme
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.layout.size
import androidx.compose.ui.layout.ContentScale




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BtvnuiTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background){
                    Greeting()
                }
            }
        }
    }
}
@Composable
fun Greeting(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        GreetingImage()
        GreetingText(
            name = "Nguyên",
            ms = "009"
        )
    }
}
@Composable
fun GreetingText(name: String, ms: String, modifier: Modifier = Modifier) {
    Column( horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "$name",
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp),
            fontWeight= FontWeight.Bold
        )
        Text(
            text = "$ms",
            fontSize = 24.sp
        )
    }
}
@Composable
fun GreetingImage()
{
    val image = painterResource(id = R.drawable.xe)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(250.dp)
            .clip(CircleShape)
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BtvnuiTheme{
        Greeting()
    }
}
