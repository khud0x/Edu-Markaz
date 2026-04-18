package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun DuolingoScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "Duolingo",
        description = "Duolingo — til o‘rganish uchun mo‘ljallangan mashhur platforma bo‘lib, u gamifikatsiya (o‘yinlashgan) tizim orqali bilim beradi. Foydalanuvchilar turli tillarni qiziqarli mashqlar orqali o‘rganishadi. Platforma bepul va juda qulay interfeysga ega. Afzalligi — o‘rganish jarayoni qiziqarli va motivatsion bo‘lishi, kamchiligi esa chuqur grammatik bilimni yetarli darajada bermasligidir. Foydalanish uchun til tanlanadi va har kuni mashqlar bajarib boriladi.",
        videoId = "0jiyKYiQrdA",
        platformUrl = "https://www.duolingo.com",
        onBackClick = onBackClick
    )
}