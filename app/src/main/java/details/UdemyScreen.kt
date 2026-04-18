package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun UdemyScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "Udemy",
        description = "Udemy — turli sohalarda minglab kurslar mavjud bo‘lgan online ta’lim marketplace. Bu platformada IT, dizayn, biznes va boshqa yo‘nalishlarda kurslar mavjud. Afzalligi — kurslar soni juda ko‘p va arzon aksiyalar mavjud, kamchiligi — kurslar sifati har xil. Foydalanish uchun foydalanuvchi kurs sotib oladi va video darslar orqali o‘rganadi.",
        videoId = "HFKXfCSom4I",
        platformUrl = "https://www.udemy.com",
        onBackClick = onBackClick
    )
}