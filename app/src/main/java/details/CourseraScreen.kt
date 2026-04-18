package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun CourseraScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "Coursera",
        description = "Coursera — dunyodagi eng mashhur onlayn ta’lim platformalardan biri bo‘lib, u yerda top universitetlar va kompaniyalar tomonidan yaratilgan kurslar mavjud. Platformada IT, biznes, tibbiyot va boshqa ko‘plab sohalar bo‘yicha kurslar mavjud. Coursera foydalanuvchilarga sertifikat olish imkonini ham beradi. Platformaning afzalligi — yuqori sifatli va akademik darajadagi kurslar mavjudligi. Kamchiligi esa ko‘plab kurslarning pullik ekanligi va ko‘pincha ingliz tilida bo‘lishidir. Foydalanish uchun ro‘yxatdan o‘tiladi, kurs tanlanadi va video darslar hamda testlar orqali bilim olinadi.",
        videoId = "ow1yxAo6A-8",
        platformUrl = "https://www.coursera.org",
        onBackClick = onBackClick
    )
}