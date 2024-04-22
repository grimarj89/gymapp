package com.grimgdl.gymapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.grimgdl.gymapp.model.Rutine
import com.grimgdl.gymapp.ui.component.Rutines
import com.grimgdl.gymapp.ui.component.ShortCuts


@Composable
fun MainScreen() {

    Column {

        val rutines = remember {
            mutableListOf(Rutine("leg", "https://www.health.com/thmb/401sp5zxB5xZg_7jjogaMhHCF9c=/750x0/filters:no_upscale():max_bytes(150000):strip_icc():format(webp)/Health-GettyImages-1320506574-ab7ee9d7aaa34134b346b564fc51fa26.jpg"),
                Rutine("High", "https://prod-ne-cdn-media.puregym.com/media/819394/gym-workout-plan-for-gaining-muscle_header.jpg?quality=80&mode=pad&width=992"),
                Rutine("Down", "https://assets.sweat.com/html_body_blocks/images/000/013/248/original/KaylaHISWorkoutWeek4_ena613314fb5852e1f236464d12a0a6f28.jpg?1626040230"))
        }

        ShortCuts()

        Spacer(modifier = Modifier.height(20.dp))

        Rutines(rutines)
    }


}

@Preview(showSystemUi = true)
@Composable
fun MainScreenPreview() {
    MainScreen()
}