package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun EdxScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "edX",
        description = "edX — Harvard va MIT kabi top universitetlar tomonidan yaratilgan kurslarni taqdim etuvchi platforma. Bu platforma orqali foydalanuvchilar akademik darajadagi bilim olishlari mumkin. Sertifikat olish imkoniyati mavjud. Afzalligi — yuqori sifatli kurslar, kamchiligi — ayrim kurslar qiyin va pullik. Foydalanish uchun foydalanuvchi ro‘yxatdan o‘tadi, kurs tanlaydi va darslarni bosqichma-bosqich o‘rganadi.",
        videoId = "usim3tYOd7o",
        platformUrl = "https://www.edx.org",
        onBackClick = onBackClick
    )
}