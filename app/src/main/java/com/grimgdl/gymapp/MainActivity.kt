package com.grimgdl.gymapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grimgdl.gymapp.presentation.MainScreen
import com.grimgdl.gymapp.ui.theme.GymappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GymappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Box(
                        modifier = Modifier
                            .padding(16.dp)
                            .background(color = MaterialTheme.colorScheme.background)
                    ) {
                        MainScreen()
                    }
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun MainPreview() {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        MainScreen()
    }
}
