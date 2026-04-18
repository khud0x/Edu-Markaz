package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun UdacityScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "Udacity",
        description = "Udacity — IT va texnologiya yo‘nalishlarida professional kurslar beruvchi platforma bo‘lib, u Nanodegree dasturlari bilan mashhur. Bu kurslar amaliy loyihalar va mentorlik bilan birga keladi. Afzalligi — real loyihalar asosida o‘qitish, kamchiligi — narxi yuqori. Foydalanish uchun foydalanuvchi kurs tanlaydi va loyihalar orqali bilim oladi.",
        videoId = "-Jan9y9iLjM",
        platformUrl = "https://www.udacity.com",
        onBackClick = onBackClick
    )
}