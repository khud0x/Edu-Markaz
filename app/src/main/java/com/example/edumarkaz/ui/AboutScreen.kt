package com.example.edumarkaz.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lightbulb
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.edumarkaz.ui.components.AppBackground
import com.example.edumarkaz.ui.components.AppTopBar

data class AboutCardItem(
    val title: String,
    val description: String,
    val icon: ImageVector
)

@Composable
fun AboutScreen(
    onBackClick: () -> Unit
) {
    val cardColor = Color.White.copy(alpha = 0.12f)
    val titleColor = Color.White
    val subColor = Color(0xFFDCE7F1)
    val accentColor = Color(0xFFDCC9FF)

    val aboutItems = listOf(
        AboutCardItem(
            title = "EduMarkaz",
            description = "Zamonaviy ta’lim platformalarini bir joyda jamlagan qulay va premium ilova.",
            icon = Icons.Default.School
        ),
        AboutCardItem(
            title = "EduMarkaz nima?",
            description = "EduMarkaz — zamonaviy ta’lim platformalarini bir joyda jamlagan ilova. Foydalanuvchi bu yerda platformalarni ko‘rishi, o‘rganishi va o‘ziga mos variantni tanlashi mumkin.",
            icon = Icons.Default.Info
        ),
        AboutCardItem(
            title = "Bizning maqsadimiz",
            description = "Foydalanuvchilarga eng yaxshi ta’lim yo‘nalishini topishda yordam berish, murakkab tanlovni soddalashtirish va platformalarni tushunarli tarzda taqdim etish.",
            icon = Icons.Default.Lightbulb
        ),
        AboutCardItem(
            title = "Afzalliklar",
            description = "• Platformalarni taqqoslash\n• Eng yaxshi platformalarni ko‘rish\n• Qulay va zamonaviy interfeys\n• Foydalanuvchi uchun sodda navigatsiya",
            icon = Icons.Default.Star
        ),
        AboutCardItem(
            title = "Kimlar uchun?",
            description = "Ushbu ilova talabalar, o‘qituvchilar, mustaqil o‘rganuvchilar va o‘ziga mos online ta’lim platformasini izlayotgan barcha foydalanuvchilar uchun mo‘ljallangan.",
            icon = Icons.Default.Info
        ),
        AboutCardItem(
            title = "Loyihaning ahamiyati",
            description = "Hozirgi kunda ta’lim platformalari soni juda ko‘p. EduMarkaz ularni bir joyga jamlab, foydalanuvchiga to‘g‘ri tanlov qilishda yordam beradi.",
            icon = Icons.Default.Lightbulb
        ),
        AboutCardItem(
            title = "Kelajakdagi rejalar",
            description = "Kelajakda ilovaga yangi platformalar qo‘shish, batafsil filterlar, reyting tizimi, foydalanuvchi sharhlari va yanada kuchli taqqoslash moduli qo‘shilishi rejalashtirilgan.",
            icon = Icons.Default.Star
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
                title = "Biz haqimizda",
                onBackClick = onBackClick
            )

            Spacer(modifier = Modifier.height(18.dp))

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(bottom = 20.dp)
            ) {
                items(aboutItems) { item ->
                    AboutGlassCard(
                        item = item,
                        cardColor = cardColor,
                        titleColor = titleColor,
                        subColor = subColor,
                        accentColor = accentColor
                    )
                }
            }
        }
    }
}

@Composable
fun AboutGlassCard(
    item: AboutCardItem,
    cardColor: Color,
    titleColor: Color,
    subColor: Color,
    accentColor: Color
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = cardColor,
                shape = RoundedCornerShape(26.dp)
            )
            .padding(18.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = item.icon,
                contentDescription = item.title,
                tint = accentColor
            )

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = item.title,
                color = titleColor,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = item.description,
            color = subColor,
            fontSize = 16.sp,
            lineHeight = 25.sp,
            fontWeight = FontWeight.Medium
        )
    }
}