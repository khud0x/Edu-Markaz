package com.example.edumarkaz.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.edumarkaz.data.PlatformData
import com.example.edumarkaz.model.Platform
import com.example.edumarkaz.ui.components.AppBackground
import com.example.edumarkaz.ui.components.AppTopBar

@Composable
fun PlatformCategoryScreen(
    onBackClick: () -> Unit,
    onPlatformClick: (Platform) -> Unit
) {
    val titleColor = Color.White

    AppBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.safeDrawing)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            AppTopBar(
                title = "Platformalar",
                onBackClick = onBackClick
            )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "Barcha ta’lim platformalari ro‘yxati",
                color = titleColor,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(18.dp))

            LazyColumn(
                contentPadding = PaddingValues(bottom = 20.dp),
                verticalArrangement = Arrangement.spacedBy(14.dp)
            ) {
                items(PlatformData.platforms) { platform ->
                    PlatformListCard(
                        platform = platform,
                        onClick = { onPlatformClick(platform) }
                    )
                }
            }
        }
    }
}

@Composable
fun PlatformListCard(
    platform: Platform,
    onClick: () -> Unit
) {
    val cardColor = Color.White.copy(alpha = 0.12f)
    val iconBoxColor = Color(0xFFB78CFF)
    val titleColor = Color.White
    val subColor = Color(0xFFE8EEF7)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(22.dp),
        colors = CardDefaults.cardColors(containerColor = cardColor),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Row(
            modifier = Modifier.padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(64.dp)
                    .background(iconBoxColor, RoundedCornerShape(20.dp)),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = platform.icon,
                    contentDescription = platform.name,
                    tint = Color.White,
                    modifier = Modifier.size(28.dp)
                )
            }

            Spacer(modifier = Modifier.width(14.dp))

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = platform.name,
                    color = titleColor,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = platform.description,
                    color = subColor,
                    fontSize = 14.sp,
                    lineHeight = 20.sp
                )
            }
        }
    }
}