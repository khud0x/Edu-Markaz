package com.example.edumarkaz.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Apps
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.edumarkaz.ui.components.AppBackground
import com.example.edumarkaz.ui.components.AppTopBar
import com.example.edumarkaz.ui.components.MenuCard

data class MenuItem(
    val title: String,
    val subtitle: String,
    val icon: ImageVector,
    val onClick: () -> Unit
)

@Composable
fun bartaMenuScreen(
    onPlatformClick: () -> Unit,
    onTopPlatformClick: () -> Unit,
    onCompareClick: () -> Unit,
    onAboutClick: () -> Unit,
    onContactClick: () -> Unit,
    onBackClick: () -> Unit
) {
    val menuItems = listOf(
        MenuItem(
            title = "Platformalar",
            subtitle = "Barcha ta'lim platformalarini ko‘rish",
            icon = Icons.Default.Apps,
            onClick = onPlatformClick
        ),
        MenuItem(
            title = "Top platformalar",
            subtitle = "Eng yaxshi va tavsiya etilgan platformalar",
            icon = Icons.Default.Star,
            onClick = onTopPlatformClick
        ),
        MenuItem(
            title = "Taqqoslash",
            subtitle = "Tanlangan platformalarni o‘zaro solishtirish",
            icon = Icons.Default.Tune,
            onClick = onCompareClick
        ),
        MenuItem(
            title = "Biz haqimizda",
            subtitle = "Ilova va loyiha haqida ma'lumot",
            icon = Icons.Default.Info,
            onClick = onAboutClick
        ),
        MenuItem(
            title = "Bog‘lanish",
            subtitle = "Aloqa ma'lumotlari va murojaat yuborish",
            icon = Icons.Default.Call,
            onClick = onContactClick
        )
    )

    AppBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.safeDrawing)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            AppTopBar(
                title = "Asosiy menyu",
                onBackClick = onBackClick
            )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "Ta'lim platformalarini o‘rganish uchun qulay bo‘limlar",
                color = Color(0xFFDCE7F1),
                fontSize = 15.sp,
                lineHeight = 22.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(22.dp))

            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(bottom = 16.dp)
            ) {
                items(menuItems) { item ->
                    MenuCard(
                        title = item.title,
                        subtitle = item.subtitle,
                        icon = item.icon,
                        onClick = item.onClick
                    )
                }
            }
        }
    }
}