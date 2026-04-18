package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun LeetCodeScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "LeetCode",
        description = "LeetCode — dasturchilar uchun mo‘ljallangan coding interview platformasi bo‘lib, u yerda murakkab algoritmik masalalar mavjud. Bu platforma orqali foydalanuvchilar top IT kompaniyalarga tayyorlanishlari mumkin. Afzalligi — kuchli mashqlar va real intervyu savollari, kamchiligi — juda qiyin bo‘lishi mumkin. Foydalanish uchun foydalanuvchi masalalarni yechadi va o‘z darajasini oshiradi.",
        videoId = "TQmTzy6dJ8c",
        platformUrl = "https://leetcode.com",
        onBackClick = onBackClick
    )
}