package com.grimgdl.gymapp.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.grimgdl.gymapp.model.Rutine

@Composable
fun CardRutine(rutine: Rutine) {

    Card{

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)

        ) {

            AsyncImage(
                model = rutine.image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Box(
                modifier = Modifier.padding(8.dp)
            ){
                Text(
                    text = rutine.name,
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset.Zero,
                            blurRadius = 4f
                        )
                    )
                )
            }

        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun CardPreview() {
    CardRutine(rutine = Rutine("Leg", "http://"))
}
