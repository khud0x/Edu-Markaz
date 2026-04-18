package com.example.edumarkaz.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.MenuBook
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.Language
import androidx.compose.material.icons.filled.Public
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Terminal
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

data class TopPlatformItem(
    val title: String,
    val subtitle: String,
    val icon: ImageVector,
    val rank: String
)

@Composable
fun TopPlatformScreen(
    onBackClick: () -> Unit
) {
    val topPlatforms = listOf(
        TopPlatformItem(
            title = "Coursera",
            subtitle = "Universitet va professional kurslar platformasi",
            icon = Icons.Default.School,
            rank = "TOP 1"
        ),
        TopPlatformItem(
            title = "Udemy",
            subtitle = "Turli yo‘nalishdagi amaliy video kurslar platformasi",
            icon = Icons.AutoMirrored.Filled.MenuBook,
            rank = "TOP 2"
        ),
        TopPlatformItem(
            title = "freeCodeCamp",
            subtitle = "Dasturlashni bepul o‘rganish uchun kuchli platforma",
            icon = Icons.Default.Code,
            rank = "TOP 3"
        ),
        TopPlatformItem(
            title = "edX",
            subtitle = "Xalqaro universitet kurslari va sertifikatlar",
            icon = Icons.Default.Public,
            rank = "TOP 4"
        ),
        TopPlatformItem(
            title = "Duolingo",
            subtitle = "Chet tillarini o‘rganish uchun mashhur platforma",
            icon = Icons.Default.Language,
            rank = "TOP 5"
        ),
        TopPlatformItem(
            title = "Udacity",
            subtitle = "Texnologiya va dasturlash kurslariga ixtisoslashgan platforma",
            icon = Icons.Default.Terminal,
            rank = "TOP 6"
        ),
        TopPlatformItem(
            title = "Khan Academy",
            subtitle = "Bepul ta’lim va mustaqil o‘rganish platformasi",
            icon = Icons.Default.Star,
            rank = "TOP 7"
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
                title = "Top platformalar",
                onBackClick = onBackClick
            )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "Eng yaxshi va ommabop ta’lim platformalari",
                color = Color(0xFFDCE7F1),
                fontSize = 15.sp,
                lineHeight = 22.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(22.dp))

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                contentPadding = PaddingValues(bottom = 16.dp)
            ) {
                items(topPlatforms) { item ->
                    TopPlatformCard(item = item)
                }
            }
        }
    }
}

@Composable
fun TopPlatformCard(item: TopPlatformItem) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color.White.copy(alpha = 0.12f),
                RoundedCornerShape(28.dp)
            )
            .padding(18.dp)
    ) {
        Row(
            verticalAlignment = Alignment.Top
        ) {
            Box(
                modifier = Modifier
                    .size(68.dp)
                    .background(
                        Color(0xFFB388FF),
                        RoundedCornerShape(20.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = item.icon,
                    contentDescription = item.title,
                    tint = Color.White,
                    modifier = Modifier.size(30.dp)
                )
            }

            Spacer(modifier = Modifier.padding(horizontal = 10.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = item.title,
                    color = Color.White,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(6.dp))

                Text(
                    text = item.subtitle,
                    color = Color(0xFFDCE7F1),
                    fontSize = 15.sp,
                    lineHeight = 22.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(14.dp))

        Box(
            modifier = Modifier
                .background(
                    Color(0xFFDCC9FF),
                    RoundedCornerShape(14.dp)
                )
                .padding(horizontal = 12.dp, vertical = 8.dp)
        ) {
            Text(
                text = item.rank,
                color = Color(0xFF20123A),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}