package com.example.edumarkaz.ui.details

import androidx.compose.runtime.Composable

@Composable
fun CanvaScreen(
    onBackClick: () -> Unit
) {
    PlatformDetailTemplate(
        title = "Canva",
        description = "Canva — grafik dizayn yaratish uchun mo‘ljallangan onlayn platforma. Ushbu platforma orqali foydalanuvchilar posterlar, prezentatsiyalar, ijtimoiy tarmoq postlari va boshqa vizual kontentlarni oson va tez yaratishlari mumkin. Interfeysi juda sodda va tushunarli bo‘lib, drag-and-drop usulida ishlaydi. Canva’da minglab tayyor shablonlar mavjud bo‘lib, bu yangi boshlovchilar uchun juda qulay. Bepul versiyasi ham yetarlicha imkoniyatlarga ega, ammo ba’zi premium elementlar pullik hisoblanadi. Canva’dan foydalanish uchun foydalanuvchi ro‘yxatdan o‘tadi, kerakli dizayn turini tanlaydi va mavjud elementlardan foydalanib o‘z dizaynini yaratadi.",
        videoId = "AdWA6Ucm3R4",
        platformUrl = "https://www.canva.com",
        onBackClick = onBackClick
    )
}