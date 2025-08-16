package com.example.sg360.ui.theme

import androidx.compose.ui.graphics.Color

// Core brand colors
val PrimaryLight = Color(0xFF6650a4)
val PrimaryDark = Color(0xFFD0BCFF)
val SecondaryLight = Color(0xFF625b71)
val SecondaryDark = Color(0xFFCCC2DC)
val TertiaryLight = Color(0xFF7D5260)
val TertiaryDark = Color(0xFFEFB8C8)

// Surface and background colors
val SurfaceLight = Color(0xFFFFFBFE)
val SurfaceDark = Color(0xFF1C1B1F)
val BackgroundLight = Color(0xFFF8F5FA)
val BackgroundDark = Color(0xFF141218)

// Error colors
val ErrorLight = Color(0xFFB3261E)
val ErrorDark = Color(0xFFF2B8B5)

// Additional semantic colors
val SuccessLight = Color(0xFF1E8B3B)
val SuccessDark = Color(0xFF8FD9A4)
val WarningLight = Color(0xFFE89E1C)
val WarningDark = Color(0xFFF7DCA7)
val InfoLight = Color(0xFF2089DC)
val InfoDark = Color(0xFFA6D4FA)

// Deprecated color naming (maintained for backward compatibility)
@Deprecated("Use PrimaryDark instead", replaceWith = ReplaceWith("PrimaryDark"))
val Purple80 = PrimaryDark
@Deprecated("Use SecondaryDark instead", replaceWith = ReplaceWith("SecondaryDark"))
val PurpleGrey80 = SecondaryDark
@Deprecated("Use TertiaryDark instead", replaceWith = ReplaceWith("TertiaryDark"))
val Pink80 = TertiaryDark

@Deprecated("Use PrimaryLight instead", replaceWith = ReplaceWith("PrimaryLight"))
val Purple40 = PrimaryLight
@Deprecated("Use SecondaryLight instead", replaceWith = ReplaceWith("SecondaryLight"))
val PurpleGrey40 = SecondaryLight
@Deprecated("Use TertiaryLight instead", replaceWith = ReplaceWith("TertiaryLight"))
val Pink40 = TertiaryLight