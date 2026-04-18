package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun FreeCodeCampScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "freeCodeCamp",
        description = "freeCodeCamp — dasturlashni bepul o‘rgatuvchi platforma bo‘lib, u orqali foydalanuvchilar web development, JavaScript, Python va boshqa yo‘nalishlarda bilim olishlari mumkin. Platforma amaliy mashg‘ulotlarga asoslangan bo‘lib, real loyihalar orqali o‘rgatadi. Afzalligi — to‘liq bepul va sertifikat mavjudligi, kamchiligi — dizayn oddiy va video kontent kamroq. Foydalanish uchun foydalanuvchi yo‘nalish tanlaydi va kod yozish orqali bilim oladi.",
        videoId = "3k9UD2Sk-zA",
        platformUrl = "https://www.freecodecamp.org",
        onBackClick = onBackClick
    )
}