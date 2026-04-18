package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun HackerRankScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "HackerRank",
        description = "HackerRank — dasturlash va algoritm bo‘yicha bilimlarni mustahkamlash uchun mo‘ljallangan platforma. Bu yerda foydalanuvchilar coding challenge va testlar orqali o‘z bilimlarini oshiradilar. Afzalligi — intervyularga tayyorlash imkoniyati, kamchiligi — boshlovchilar uchun murakkab bo‘lishi mumkin. Foydalanish uchun foydalanuvchi masalalarni yechadi va ball yig‘adi.",
        videoId = "rO-_w-Eacjs",
        platformUrl = "https://www.hackerrank.com",
        onBackClick = onBackClick
    )
}