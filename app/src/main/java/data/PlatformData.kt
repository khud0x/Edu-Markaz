package com.example.edumarkaz.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Book
import androidx.compose.material.icons.filled.Brush
import androidx.compose.material.icons.filled.CastForEducation
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Computer
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.PlayCircle
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Terminal
import com.example.edumarkaz.model.Platform

object PlatformData {
    val platforms = listOf(
        Platform(
            name = "Duolingo",
            description = "Til o‘rganish uchun interaktiv platforma.",
            icon = Icons.Default.Language
        ),
        Platform(
            name = "DeepLearning AI",
            description = "Sun’iy intellekt va machine learning kurslari.",
            icon = Icons.Default.Memory
        ),
        Platform(
            name = "Canva",
            description = "Grafik dizayn yaratish uchun platforma.",
            icon = Icons.Default.Brush
        ),
        Platform(
            name = "Udacity",
            description = "IT va texnologiya kurslari platformasi.",
            icon = Icons.Default.Computer
        ),
        Platform(
            name = "Khan Academy",
            description = "Bepul ta’lim platformasi.",
            icon = Icons.Default.School
        ),
        Platform(
            name = "LeetCode",
            description = "Dasturlash masalalari va coding practice.",
            icon = Icons.Default.Code
        ),
        Platform(
            name = "HackerRank",
            description = "Dasturlash va test platformasi.",
            icon = Icons.Default.Terminal
        ),
        Platform(
            name = "freeCodeCamp",
            description = "Bepul dasturlash kurslari platformasi.",
            icon = Icons.Default.Public
        ),
        Platform(
            name = "FutureLearn",
            description = "Universitet kurslari platformasi.",
            icon = Icons.Default.Book
        ),
        Platform(
            name = "edX",
            description = "Xalqaro universitet kurslari platformasi.",
            icon = Icons.Default.CastForEducation
        ),
        Platform(
            name = "Coursera",
            description = "Professional kurslar platformasi.",
            icon = Icons.Default.Book
        ),
        Platform(
            name = "Udemy",
            description = "Video kurslar platformasi.",
            icon = Icons.Default.PlayCircle
        )
    )
}