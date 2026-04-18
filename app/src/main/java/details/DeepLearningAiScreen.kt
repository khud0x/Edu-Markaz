package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun DeepLearningAiScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "DeepLearning AI",
        description = "DeepLearning.AI — sun’iy intellekt va machine learning yo‘nalishiga ixtisoslashgan platforma. Bu yerda foydalanuvchilar AI, neural network va data science bo‘yicha chuqur bilim olishlari mumkin. Platforma ayniqsa Andrew Ng tomonidan yaratilgan kurslari bilan mashhur. Afzalligi — juda sifatli va amaliy bilim berilishi, kamchiligi esa boshlovchilar uchun murakkab bo‘lishi va ko‘plab kurslarning pullik ekanligi. Foydalanish uchun foydalanuvchi kurs tanlaydi va Python hamda AI texnologiyalar asosida amaliy mashg‘ulotlar bajaradi.",
        videoId = "YVyjIaM7eX8",
        platformUrl = "https://www.deeplearning.ai",
        onBackClick = onBackClick
    )
}