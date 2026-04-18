package com.example.edumarkaz.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val EduDarkColorScheme = darkColorScheme(
    primary = SoftPurple,
    background = DarkNavy,
    surface = DarkTeal,
    onPrimary = PurpleText,
    onBackground = WhiteText,
    onSurface = WhiteText
)

@Composable
fun EduMarkazTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = EduDarkColorScheme,
        typography = AppTypography,
        content = content
    )
}