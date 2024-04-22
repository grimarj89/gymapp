package com.grimgdl.gymapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ShortCuts() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Box(
            modifier = Modifier
                .size(64.dp)
                .background(color = Color(0xFFF8F8F8), shape = CircleShape)
                .border(width = 2.dp, color = Color(0xFFBDBDBD), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {

            Icon(imageVector = Icons.Default.DateRange, contentDescription = null, tint = Color(0xFFBDBDBD))

        }

        Box(
            modifier = Modifier
                .size(64.dp)
                .background(color = Color(0xFFF8F8F8), shape = CircleShape)
                .border(width = 2.dp, color = Color(0xFFBDBDBD), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {

            Icon(imageVector = Icons.Default.Face, contentDescription = null, tint = Color(0xFFBDBDBD))

        }

        Box(
            modifier = Modifier
                .size(64.dp)
                .background(color = Color(0xFFF8F8F8), shape = CircleShape)
                .border(width = 2.dp, color = Color(0xFFBDBDBD), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {

            Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = null, tint = Color(0xFFBDBDBD))

        }

        Box(
            modifier = Modifier
                .size(64.dp)
                .background(color = Color(0xFFF8F8F8), shape = CircleShape)
                .border(width = 2.dp, color = Color(0xFFBDBDBD), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {

            Icon(imageVector = Icons.Default.Build, contentDescription = null, tint = Color(0xFFBDBDBD))

        }

    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ShortCutsPreview() {
    ShortCuts()
}