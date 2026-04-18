package com.example.edumarkaz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.edumarkaz.ui.AboutScreen
import com.example.edumarkaz.ui.CompareScreen
import com.example.edumarkaz.ui.ContactScreen
import com.example.edumarkaz.ui.HomeScreen
import com.example.edumarkaz.ui.PlatformCategoryScreen
import com.example.edumarkaz.ui.TopPlatformScreen
import com.example.edumarkaz.ui.bartaMenuScreen
import com.example.edumarkaz.ui.details.CanvaScreen
import com.example.edumarkaz.ui.details.CourseraScreen
import com.example.edumarkaz.ui.details.DeepLearningAiScreen
import com.example.edumarkaz.ui.details.DuolingoScreen
import com.example.edumarkaz.ui.details.EdxScreen
import com.example.edumarkaz.ui.details.FreeCodeCampScreen
import com.example.edumarkaz.ui.details.FutureLearnScreen
import com.example.edumarkaz.ui.details.HackerRankScreen
import com.example.edumarkaz.ui.details.KhanAcademyScreen
import com.example.edumarkaz.ui.details.LeetCodeScreen
import com.example.edumarkaz.ui.details.UdacityScreen
import com.example.edumarkaz.ui.details.UdemyScreen
import com.example.edumarkaz.ui.theme.EduMarkazTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EduMarkazTheme {
                var currentScreen by remember { mutableStateOf(Screen.HOME) }

                when (currentScreen) {
                    Screen.HOME -> {
                        HomeScreen(
                            onStartClick = {
                                currentScreen = Screen.MENU
                            }
                        )
                    }

                    Screen.MENU -> {
                        bartaMenuScreen(
                            onPlatformClick = {
                                currentScreen = Screen.PLATFORMS
                            },
                            onTopPlatformClick = {
                                currentScreen = Screen.TOP
                            },
                            onCompareClick = {
                                currentScreen = Screen.COMPARE
                            },
                            onAboutClick = {
                                currentScreen = Screen.ABOUT
                            },
                            onContactClick = {
                                currentScreen = Screen.CONTACT
                            },
                            onBackClick = {
                                currentScreen = Screen.HOME
                            }
                        )
                    }

                    Screen.PLATFORMS -> {
                        PlatformCategoryScreen(
                            onBackClick = {
                                currentScreen = Screen.MENU
                            },
                            onPlatformClick = { platform ->
                                currentScreen = when (platform.name) {
                                    "Duolingo" -> Screen.DUOLINGO
                                    "DeepLearning AI" -> Screen.DEEPLEARNING_AI
                                    "Canva" -> Screen.CANVA
                                    "Udacity" -> Screen.UDACITY
                                    "Khan Academy" -> Screen.KHAN_ACADEMY
                                    "LeetCode" -> Screen.LEETCODE
                                    "HackerRank" -> Screen.HACKERRANK
                                    "freeCodeCamp" -> Screen.FREECODECAMP
                                    "FutureLearn" -> Screen.FUTURELEARN
                                    "edX" -> Screen.EDX
                                    "Coursera" -> Screen.COURSERA
                                    "Udemy" -> Screen.UDEMY
                                    else -> Screen.PLATFORMS
                                }
                            }
                        )
                    }

                    Screen.DUOLINGO -> {
                        DuolingoScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.DEEPLEARNING_AI -> {
                        DeepLearningAiScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.CANVA -> {
                        CanvaScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.UDACITY -> {
                        UdacityScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.KHAN_ACADEMY -> {
                        KhanAcademyScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.LEETCODE -> {
                        LeetCodeScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.HACKERRANK -> {
                        HackerRankScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.FREECODECAMP -> {
                        FreeCodeCampScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.FUTURELEARN -> {
                        FutureLearnScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.EDX -> {
                        EdxScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.COURSERA -> {
                        CourseraScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.UDEMY -> {
                        UdemyScreen(
                            onBackClick = {
                                currentScreen = Screen.PLATFORMS
                            }
                        )
                    }

                    Screen.TOP -> {
                        TopPlatformScreen(
                            onBackClick = {
                                currentScreen = Screen.MENU
                            }
                        )
                    }

                    Screen.COMPARE -> {
                        CompareScreen(
                            onBackClick = {
                                currentScreen = Screen.MENU
                            }
                        )
                    }

                    Screen.ABOUT -> {
                        AboutScreen(
                            onBackClick = {
                                currentScreen = Screen.MENU
                            }
                        )
                    }

                    Screen.CONTACT -> {
                        ContactScreen(
                            onBackClick = {
                                currentScreen = Screen.MENU
                            }
                        )
                    }
                }
            }
        }
    }
}