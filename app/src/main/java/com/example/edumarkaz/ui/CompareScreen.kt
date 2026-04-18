package com.example.edumarkaz.ui

import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MenuAnchorType
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.edumarkaz.ui.components.AppBackground
import com.example.edumarkaz.ui.components.AppTopBar

data class ComparePlatformInfo(
    val name: String,
    val description: String,
    val price: String,
    val certificate: String,
    val category: String
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CompareScreen(
    onBackClick: () -> Unit
) {
    val platforms = listOf(
        ComparePlatformInfo(
            name = "Udemy",
            description = "Turli yo‘nalishdagi video kurslar platformasi",
            price = "Pullik",
            certificate = "Bor",
            category = "Kurslar"
        ),
        ComparePlatformInfo(
            name = "Coursera",
            description = "Universitet va professional kurslar platformasi",
            price = "Bepul / Pullik",
            certificate = "Bor",
            category = "Akademik"
        ),
        ComparePlatformInfo(
            name = "edX",
            description = "Xalqaro universitet kurslari va sertifikatlar",
            price = "Bepul / Pullik",
            certificate = "Bor",
            category = "Akademik"
        ),
        ComparePlatformInfo(
            name = "FutureLearn",
            description = "Online kurslar va akademik dasturlar",
            price = "Bepul / Pullik",
            certificate = "Bor",
            category = "Akademik"
        ),
        ComparePlatformInfo(
            name = "freeCodeCamp",
            description = "Dasturlashni bepul o‘rganish platformasi",
            price = "Bepul",
            certificate = "Bor",
            category = "Dasturlash"
        ),
        ComparePlatformInfo(
            name = "HackerRank",
            description = "Kod yozish va masala ishlash platformasi",
            price = "Bepul",
            certificate = "Yo‘q",
            category = "Dasturlash"
        ),
        ComparePlatformInfo(
            name = "LeetCode",
            description = "Algoritm va coding interview mashqlari",
            price = "Bepul / Premium",
            certificate = "Yo‘q",
            category = "Dasturlash"
        ),
        ComparePlatformInfo(
            name = "Khan Academy",
            description = "Bepul ta’lim va mustaqil o‘rganish platformasi",
            price = "Bepul",
            certificate = "Yo‘q",
            category = "Umumiy ta’lim"
        ),
        ComparePlatformInfo(
            name = "Udacity",
            description = "Texnologiya va dasturlash kurslari",
            price = "Pullik",
            certificate = "Bor",
            category = "Texnologiya"
        ),
        ComparePlatformInfo(
            name = "Canva",
            description = "Grafik dizayn va kontent yaratish platformasi",
            price = "Bepul / Premium",
            certificate = "Yo‘q",
            category = "Dizayn"
        ),
        ComparePlatformInfo(
            name = "DeepLearning.AI",
            description = "Sun’iy intellekt va deep learning kurslari",
            price = "Bepul / Pullik",
            certificate = "Bor",
            category = "AI"
        ),
        ComparePlatformInfo(
            name = "Duolingo",
            description = "Chet tillarini o‘rganish platformasi",
            price = "Bepul / Premium",
            certificate = "Yo‘q",
            category = "Til"
        )
    )

    var expandedFirst by remember { mutableStateOf(false) }
    var expandedSecond by remember { mutableStateOf(false) }

    var firstPlatform by remember { mutableStateOf<ComparePlatformInfo?>(null) }
    var secondPlatform by remember { mutableStateOf<ComparePlatformInfo?>(null) }

    val cardColor = Color.White.copy(alpha = 0.12f)
    val fieldColor = Color.White.copy(alpha = 0.10f)
    val accentColor = Color(0xFFDCC9FF)
    val titleColor = Color.White
    val subColor = Color(0xFFDCE7F1)

    AppBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.safeDrawing)
                .padding(horizontal = 20.dp)
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            AppTopBar(
                title = "Taqqoslash",
                onBackClick = onBackClick
            )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "2 ta platformani tanlang va taqqoslang",
                color = subColor,
                fontSize = 17.sp,
                lineHeight = 24.sp,
                fontWeight = FontWeight.Medium
            )

            Spacer(modifier = Modifier.height(18.dp))

            ExposedDropdownMenuBox(
                expanded = expandedFirst,
                onExpandedChange = { expandedFirst = !expandedFirst }
            ) {
                OutlinedTextField(
                    value = firstPlatform?.name ?: "",
                    onValueChange = {},
                    readOnly = true,
                    label = {
                        Text(
                            text = "1-platformani tanlang",
                            color = subColor,
                            fontSize = 16.sp
                        )
                    },
                    textStyle = TextStyle(
                        color = titleColor,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    ),
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedFirst)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .menuAnchor(MenuAnchorType.PrimaryNotEditable, true),
                    shape = RoundedCornerShape(20.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = titleColor,
                        unfocusedTextColor = titleColor,
                        focusedLabelColor = accentColor,
                        unfocusedLabelColor = subColor,
                        cursorColor = accentColor,
                        focusedBorderColor = accentColor,
                        unfocusedBorderColor = Color.White.copy(alpha = 0.35f),
                        focusedContainerColor = fieldColor,
                        unfocusedContainerColor = fieldColor
                    )
                )

                DropdownMenu(
                    expanded = expandedFirst,
                    onDismissRequest = { expandedFirst = false },
                    modifier = Modifier
                        .fillMaxWidth(0.90f)
                        .height(150.dp)
                ) {
                    platforms.forEach { platform ->
                        DropdownMenuItem(
                            text = {
                                Text(
                                    text = platform.name,
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            },
                            onClick = {
                                firstPlatform = platform
                                expandedFirst = false
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(14.dp))

            ExposedDropdownMenuBox(
                expanded = expandedSecond,
                onExpandedChange = { expandedSecond = !expandedSecond }
            ) {
                OutlinedTextField(
                    value = secondPlatform?.name ?: "",
                    onValueChange = {},
                    readOnly = true,
                    label = {
                        Text(
                            text = "2-platformani tanlang",
                            color = subColor,
                            fontSize = 16.sp
                        )
                    },
                    textStyle = TextStyle(
                        color = titleColor,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    ),
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedSecond)
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .menuAnchor(MenuAnchorType.PrimaryNotEditable, true),
                    shape = RoundedCornerShape(20.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = titleColor,
                        unfocusedTextColor = titleColor,
                        focusedLabelColor = accentColor,
                        unfocusedLabelColor = subColor,
                        cursorColor = accentColor,
                        focusedBorderColor = accentColor,
                        unfocusedBorderColor = Color.White.copy(alpha = 0.35f),
                        focusedContainerColor = fieldColor,
                        unfocusedContainerColor = fieldColor
                    )
                )

                DropdownMenu(
                    expanded = expandedSecond,
                    onDismissRequest = { expandedSecond = false },
                    modifier = Modifier
                        .fillMaxWidth(0.90f)
                        .height(150.dp)
                ) {
                    platforms.forEach { platform ->
                        DropdownMenuItem(
                            text = {
                                Text(
                                    text = platform.name,
                                    color = Color.White,
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            },
                            onClick = {
                                secondPlatform = platform
                                expandedSecond = false
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(22.dp))

            if (firstPlatform != null && secondPlatform != null) {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(bottom = 16.dp)
                ) {
                    item {
                        ComparePlatformCard(
                            title = "1-platforma",
                            platform = firstPlatform!!,
                            cardColor = cardColor,
                            titleColor = titleColor,
                            accentColor = accentColor
                        )
                    }

                    item {
                        ComparePlatformCard(
                            title = "2-platforma",
                            platform = secondPlatform!!,
                            cardColor = cardColor,
                            titleColor = titleColor,
                            accentColor = accentColor
                        )
                    }

                    item {
                        ComparisonTable(
                            first = firstPlatform!!,
                            second = secondPlatform!!,
                            cardColor = cardColor,
                            titleColor = titleColor,
                            accentColor = accentColor
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun ComparePlatformCard(
    title: String,
    platform: ComparePlatformInfo,
    cardColor: Color,
    titleColor: Color,
    accentColor: Color
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = cardColor,
                shape = RoundedCornerShape(24.dp)
            )
            .padding(18.dp)
    ) {
        Text(
            text = title,
            color = accentColor,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = platform.name,
            color = titleColor,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        CompareInfoRow("Tavsif", platform.description, accentColor, titleColor)
        CompareInfoRow("Narxi", platform.price, accentColor, titleColor)
        CompareInfoRow("Sertifikat", platform.certificate, accentColor, titleColor)
        CompareInfoRow("Yo‘nalish", platform.category, accentColor, titleColor)
    }
}

@Composable
fun ComparisonTable(
    first: ComparePlatformInfo,
    second: ComparePlatformInfo,
    cardColor: Color,
    titleColor: Color,
    accentColor: Color
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = cardColor,
                shape = RoundedCornerShape(24.dp)
            )
            .padding(18.dp)
    ) {
        Text(
            text = "Taqqoslash natijasi",
            color = titleColor,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(14.dp))

        CompareTableRow("Narxi", first.price, second.price, accentColor, titleColor)
        CompareTableRow("Sertifikat", first.certificate, second.certificate, accentColor, titleColor)
        CompareTableRow("Yo‘nalish", first.category, second.category, accentColor, titleColor)
        CompareTableRow("Tavsif", first.description, second.description, accentColor, titleColor)
    }
}

@Composable
fun CompareTableRow(
    label: String,
    firstValue: String,
    secondValue: String,
    accentColor: Color,
    titleColor: Color
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp)
    ) {
        Text(
            text = label,
            color = accentColor,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(6.dp))

        Row(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(
                        Color.White.copy(alpha = 0.08f),
                        RoundedCornerShape(14.dp)
                    )
                    .padding(12.dp)
            ) {
                Text(
                    text = firstValue,
                    color = titleColor,
                    fontSize = 15.sp
                )
            }

            Spacer(modifier = Modifier.padding(horizontal = 6.dp))

            Box(
                modifier = Modifier
                    .weight(1f)
                    .background(
                        Color.White.copy(alpha = 0.08f),
                        RoundedCornerShape(14.dp)
                    )
                    .padding(12.dp)
            ) {
                Text(
                    text = secondValue,
                    color = titleColor,
                    fontSize = 15.sp
                )
            }
        }
    }
}

@Composable
fun CompareInfoRow(
    label: String,
    value: String,
    accentColor: Color,
    titleColor: Color
) {
    Column {
        Text(
            text = label,
            color = accentColor,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = value,
            color = titleColor,
            fontSize = 16.sp,
            lineHeight = 23.sp
        )

        Spacer(modifier = Modifier.height(10.dp))
    }
}