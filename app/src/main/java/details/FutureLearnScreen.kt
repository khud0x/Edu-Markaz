package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun FutureLearnScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "FutureLearn",
        description = "FutureLearn — Yevropa universitetlari tomonidan yaratilgan kurslarni taqdim etuvchi platforma. Bu yerda foydalanuvchilar turli sohalarda bilim olishlari mumkin. Platforma interaktiv darslari bilan ajralib turadi. Afzalligi — qiziqarli va tushunarli kurslar, kamchiligi — ayrim kontentlar pullik. Foydalanish uchun kurs tanlanadi va bosqichma-bosqich o‘rganiladi.",
        videoId = "yREyyaKPOcU",
        platformUrl = "https://www.futurelearn.com",
        onBackClick = onBackClick
    )
}