package com.example.edumarkaz.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Code
import androidx.compose.material.icons.filled.DataObject
import androidx.compose.material.icons.filled.EmojiEvents
import androidx.compose.material.icons.filled.Memory
import androidx.compose.material.icons.filled.Terminal
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class ProgrammingPlatformItem(
    val name: String,
    val subtitle: String,
    val icon: ImageVector
)

@Composable
fun ProgrammingPlatformsScreen(
    onBackClick: () -> Unit,
    onPlatformClick: (String) -> Unit
) {
    val platforms = listOf(
        ProgrammingPlatformItem(
            name = "freeCodeCamp",
            subtitle = "Bepul dasturlash kurslari va sertifikatlar",
            icon = Icons.Default.Code
        ),
        ProgrammingPlatformItem(
            name = "Codecademy",
            subtitle = "Interaktiv kod yozish va o‘rganish",
            icon = Icons.Default.DataObject
        ),
        ProgrammingPlatformItem(
            name = "HackerRank",
            subtitle = "Amaliy mashqlar va coding challenge",
            icon = Icons.Default.Terminal
        ),
        ProgrammingPlatformItem(
            name = "LeetCode",
            subtitle = "Interview va algoritm masalalari",
            icon = Icons.Default.Memory
        ),
        ProgrammingPlatformItem(
            name = "Codeforces",
            subtitle = "Competitive programming musobaqalari",
            icon = Icons.Default.EmojiEvents
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF071B24),
                        Color(0xFF0A2A37),
                        Color(0xFF103C4B),
                        Color(0xFF174F61)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .navigationBarsPadding()
                .padding(horizontal = 18.dp, vertical = 14.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onBackClick,
                    modifier = Modifier
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.12f))
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBackIosNew,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                }

                Spacer(modifier = Modifier.size(12.dp))

                Column {
                    Text(
                        text = "Dasturlash",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Color.White
                    )
                    Text(
                        text = "(Programming)",
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFD9EAF2)
                    )
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                text = "Kod yozish va amaliy mashqlar uchun eng foydali platformalarni tanlang",
                fontSize = 16.sp,
                color = Color(0xFFD6E6EE)
            )

            Spacer(modifier = Modifier.height(24.dp))

            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                itemsIndexed(platforms) { index, item ->
                    ProgrammingPlatformCard(
                        index = index + 1,
                        item = item,
                        onClick = { onPlatformClick(item.name) }
                    )
                }
            }
        }
    }
}

@Composable
fun ProgrammingPlatformCard(
    index: Int,
    item: ProgrammingPlatformItem,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 16.dp,
                shape = RoundedCornerShape(30.dp),
                clip = false
            )
            .clickable { onClick() },
        shape = RoundedCornerShape(30.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFE9DBFF)
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp)
    ) {
        Box(
            modifier = Modifier
                .background(
                    Brush.horizontalGradient(
                        colors = listOf(
                            Color(0xFFE9DBFF),
                            Color(0xFFDCCEFF)
                        )
                    )
                )
                .padding(horizontal = 18.dp, vertical = 18.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .size(62.dp)
                        .clip(CircleShape)
                        .background(Color.White.copy(alpha = 0.72f)),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.name,
                        tint = Color(0xFF2A1E4D),
                        modifier = Modifier.size(30.dp)
                    )
                }

                Spacer(modifier = Modifier.size(14.dp))

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "$index. ${item.name}",
                        fontSize = 21.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF21163D)
                    )

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(
                        text = item.subtitle,
                        fontSize = 14.sp,
                        color = Color(0xFF5A4C79)
                    )
                }

                Icon(
                    imageVector = Icons.Default.ArrowForwardIos,
                    contentDescription = "Open",
                    tint = Color(0xFF2A1E4D),
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}