package com.example.edumarkaz.ui

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.AlternateEmail
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.edumarkaz.ui.components.AppBackground
import com.example.edumarkaz.ui.components.AppTopBar
import kotlinx.coroutines.launch

@Composable
fun ContactScreen(
    onBackClick: () -> Unit
) {
    val context = LocalContext.current
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var message by remember { mutableStateOf("") }

    val telegramUsername = ".............."
    val contactEmail = "admin@edumarkaz.uz"

    val cardColor = Color.White.copy(alpha = 0.12f)
    val fieldColor = Color.White.copy(alpha = 0.08f)
    val accentColor = Color(0xFFDCC9FF)
    val titleColor = Color.White
    val subColor = Color(0xFFDCE7F1)
    val darkText = Color(0xFF20123A)

    AppBackground {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .windowInsetsPadding(WindowInsets.safeDrawing)
        ) {
            SnackbarHost(
                hostState = snackbarHostState,
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(16.dp)
            )

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp)
            ) {
                Spacer(modifier = Modifier.height(8.dp))

                AppTopBar(
                    title = "Bog‘lanish",
                    onBackClick = onBackClick
                )

                Spacer(modifier = Modifier.height(18.dp))

                Text(
                    text = "Biz bilan bog‘laning yoki savollaringizni yuboring",
                    color = subColor,
                    fontSize = 17.sp,
                    lineHeight = 24.sp,
                    fontWeight = FontWeight.Medium
                )

                Spacer(modifier = Modifier.height(18.dp))

                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(bottom = 20.dp)
                ) {
                    item {
                        GlassContactCard(cardColor = cardColor) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                IconCircle(
                                    icon = Icons.AutoMirrored.Filled.Send,
                                    tint = Color(0xFF5B3FD0)
                                )

                                Spacer(modifier = Modifier.width(12.dp))

                                Text(
                                    text = "EduMarkaz bilan bog‘laning",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.ExtraBold,
                                    color = titleColor
                                )
                            }

                            Spacer(modifier = Modifier.height(12.dp))

                            Text(
                                text = "Savollar, takliflar yoki hamkorlik bo‘yicha bizga yozishingiz mumkin.",
                                fontSize = 16.sp,
                                color = subColor,
                                lineHeight = 24.sp
                            )
                        }
                    }

                    item {
                        ContactInfoGlassCard(
                            icon = Icons.Default.AlternateEmail,
                            title = "Telegram",
                            value = "@$telegramUsername",
                            buttonText = "Ochish",
                            cardColor = cardColor,
                            titleColor = titleColor,
                            subColor = subColor,
                            accentColor = accentColor,
                            onClick = {
                                val intent = Intent(
                                    Intent.ACTION_VIEW,
                                    "https://t.me/$telegramUsername".toUri()
                                )
                                try {
                                    context.startActivity(intent)
                                } catch (_: Exception) {
                                    scope.launch {
                                        snackbarHostState.showSnackbar("Telegram ochilmadi")
                                    }
                                }
                            }
                        )
                    }

                    item {
                        ContactInfoGlassCard(
                            icon = Icons.Default.Email,
                            title = "Email",
                            value = contactEmail,
                            buttonText = "Yozish",
                            cardColor = cardColor,
                            titleColor = titleColor,
                            subColor = subColor,
                            accentColor = accentColor,
                            onClick = {
                                val intent = Intent(
                                    Intent.ACTION_SENDTO,
                                    "mailto:$contactEmail".toUri()
                                )
                                try {
                                    context.startActivity(intent)
                                } catch (_: Exception) {
                                    scope.launch {
                                        snackbarHostState.showSnackbar("Email ilovasi topilmadi")
                                    }
                                }
                            }
                        )
                    }

                    item {
                        GlassContactCard(cardColor = cardColor) {
                            Text(
                                text = "Xabar yuborish",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = titleColor
                            )

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Savol, taklif yoki fikringizni yuborishingiz mumkin",
                                fontSize = 16.sp,
                                color = subColor,
                                lineHeight = 24.sp
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            GlassInputField(
                                value = name,
                                onValueChange = { name = it },
                                label = "Ismingiz",
                                fieldColor = fieldColor,
                                accentColor = accentColor,
                                textColor = titleColor,
                                labelColor = subColor
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            GlassInputField(
                                value = email,
                                onValueChange = { email = it },
                                label = "Email manzilingiz",
                                fieldColor = fieldColor,
                                accentColor = accentColor,
                                textColor = titleColor,
                                labelColor = subColor
                            )

                            Spacer(modifier = Modifier.height(12.dp))

                            GlassInputField(
                                value = message,
                                onValueChange = { message = it },
                                label = "Xabaringiz",
                                minLines = 5,
                                fieldColor = fieldColor,
                                accentColor = accentColor,
                                textColor = titleColor,
                                labelColor = subColor
                            )

                            Spacer(modifier = Modifier.height(16.dp))

                            Button(
                                onClick = {
                                    if (name.isBlank() || email.isBlank() || message.isBlank()) {
                                        scope.launch {
                                            snackbarHostState.showSnackbar("Iltimos, barcha maydonlarni to‘ldiring")
                                        }
                                    } else {
                                        val subject = "EduMarkaz orqali xabar"
                                        val body = """
                                            Ism: $name
                                            Email: $email

                                            Xabar:
                                            $message
                                        """.trimIndent()

                                        val intent = Intent(
                                            Intent.ACTION_SENDTO,
                                            "mailto:$contactEmail?subject=$subject&body=$body".toUri()
                                        )

                                        try {
                                            context.startActivity(intent)
                                        } catch (_: Exception) {
                                            scope.launch {
                                                snackbarHostState.showSnackbar("Email ilovasi topilmadi")
                                            }
                                        }
                                    }
                                },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(56.dp),
                                shape = RoundedCornerShape(18.dp),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = accentColor,
                                    contentColor = darkText
                                )
                            ) {
                                Icon(
                                    imageVector = Icons.AutoMirrored.Filled.Send,
                                    contentDescription = "Send",
                                    tint = darkText
                                )

                                Spacer(modifier = Modifier.width(8.dp))

                                Text(
                                    text = "Yuborish",
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = darkText
                                )
                            }

                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "Biz sizning fikrlaringizni qadrlaymiz va imkon qadar tez javob berishga harakat qilamiz.",
                                color = subColor,
                                fontSize = 13.sp,
                                lineHeight = 19.sp
                            )
                        }
                    }

                    item {
                        Text(
                            text = "© EduMarkaz 2026",
                            color = Color(0xFFB9CBD3),
                            fontSize = 12.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun GlassContactCard(
    cardColor: Color,
    content: @Composable ColumnScope.() -> Unit
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
        content()
    }
}

@Composable
fun ContactInfoGlassCard(
    icon: ImageVector,
    title: String,
    value: String,
    buttonText: String,
    cardColor: Color,
    titleColor: Color,
    subColor: Color,
    accentColor: Color,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = cardColor,
                shape = RoundedCornerShape(24.dp)
            )
            .clickable { onClick() }
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconCircle(
            icon = icon,
            tint = Color(0xFF5B3FD0)
        )

        Spacer(modifier = Modifier.width(12.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = titleColor
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = value,
                fontSize = 16.sp,
                color = subColor
            )
        }

        TextButton(onClick = onClick) {
            Text(
                text = buttonText,
                color = accentColor,
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp
            )
        }
    }
}

@Composable
fun IconCircle(
    icon: ImageVector,
    tint: Color
) {
    Box(
        modifier = Modifier
            .size(56.dp)
            .background(
                color = Color.White.copy(alpha = 0.92f),
                shape = CircleShape
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = tint
        )
    }
}

@Composable
fun GlassInputField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    fieldColor: Color,
    accentColor: Color,
    textColor: Color,
    labelColor: Color,
    minLines: Int = 1
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = {
            Text(
                text = label,
                color = labelColor
            )
        },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(18.dp),
        minLines = minLines,
        colors = OutlinedTextFieldDefaults.colors(
            focusedContainerColor = fieldColor,
            unfocusedContainerColor = fieldColor,
            focusedBorderColor = accentColor,
            unfocusedBorderColor = Color.White.copy(alpha = 0.30f),
            focusedTextColor = textColor,
            unfocusedTextColor = textColor,
            cursorColor = accentColor,
            focusedLabelColor = accentColor,
            unfocusedLabelColor = labelColor
        )
    )
}