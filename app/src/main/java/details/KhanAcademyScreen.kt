package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun KhanAcademyScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "Khan Academy",
        description = "Khan Academy — bepul ta’lim platformasi bo‘lib, matematika, fan va boshqa ko‘plab yo‘nalishlarda video darslar taqdim etadi. Platforma juda sodda va tushunarli tushuntirish uslubiga ega. Afzalligi — bepul va sifatli ta’lim, kamchiligi — IT yo‘nalishidagi kurslar kamroq. Foydalanish uchun foydalanuvchi fan tanlaydi va video orqali o‘rganadi.",
        videoId = "hNdmWxCjZeo",
        platformUrl = "https://www.khanacademy.org",
        onBackClick = onBackClick
    )
}