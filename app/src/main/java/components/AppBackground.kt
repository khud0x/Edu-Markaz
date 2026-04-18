package com.example.edumarkaz.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppBackground(
    content: @Composable () -> Unit
) {
    val bgGradient = Brush.verticalGradient(
        colors = listOf(
            Color(0xFF06141F),
            Color(0xFF0B2233),
            Color(0xFF123B52)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(bgGradient)
    ) {
        Box(
            modifier = Modifier
                .size(220.dp)
                .offset(x = (-40).dp, y = (-30).dp)
                .blur(80.dp)
                .clip(CircleShape)
                .background(Color(0xFF9B7BFF).copy(alpha = 0.35f))
        )

        Box(
            modifier = Modifier
                .size(180.dp)
                .offset(x = 260.dp, y = 110.dp)
                .blur(70.dp)
                .clip(CircleShape)
                .background(Color(0xFF38BDF8).copy(alpha = 0.25f))
        )

        Box(
            modifier = Modifier
                .size(200.dp)
                .offset(x = 180.dp, y = 620.dp)
                .blur(90.dp)
                .clip(CircleShape)
                .background(Color(0xFF22D3EE).copy(alpha = 0.18f))
        )

        content()
    }
}