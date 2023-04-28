package com.zmei.a3composelessons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            listItem("Здесь может быть ваша рекалам", "Тут должно быть какое-то описание")
                }
           }

@Composable
private fun listItem(name: String, prof: String){
Card(modifier = Modifier
    .fillMaxWidth()
    .padding(10.dp),
    shape = RoundedCornerShape(15.dp),
    elevation = 5.dp
    ) {
Box() { 
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.primer),
            contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(5.dp)
                .size(65.dp)
                .clip(CircleShape)
            )
        Column {
            Text(text = name)
            Text(text = prof)

        }
        
    }
    
}
}
}
}

