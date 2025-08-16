package com.example.sg360.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat

/**
 * Defines custom theme dimensions for the application.
 * This allows accessing custom spacing values consistently throughout the app.
 */
data class SG360Dimensions(
    val contentPaddingSmall: androidx.compose.ui.unit.Dp = 8.dp,
    val contentPaddingMedium: androidx.compose.ui.unit.Dp = 16.dp,
    val contentPaddingLarge: androidx.compose.ui.unit.Dp = 24.dp,
    val elementSpacingSmall: androidx.compose.ui.unit.Dp = 4.dp,
    val elementSpacingMedium: androidx.compose.ui.unit.Dp = 8.dp,
    val elementSpacingLarge: androidx.compose.ui.unit.Dp = 16.dp,
    val roundedCornerSmall: androidx.compose.ui.unit.Dp = 4.dp,
    val roundedCornerMedium: androidx.compose.ui.unit.Dp = 8.dp,
    val roundedCornerLarge: androidx.compose.ui.unit.Dp = 16.dp
)

// Provide a default instance of SG360Dimensions
val LocalSG360Dimensions = staticCompositionLocalOf { SG360Dimensions() }

/**
 * Defines the dark color scheme for the SG360 app.
 */
private val DarkColorScheme = darkColorScheme(
    primary = PrimaryDark,
    onPrimary = Color(0xFF381E72),
    primaryContainer = Color(0xFF4F378B),
    onPrimaryContainer = Color(0xFFEADDFF),
    secondary = SecondaryDark,
    onSecondary = Color(0xFF332D41),
    secondaryContainer = Color(0xFF4A4458),
    onSecondaryContainer = Color(0xFFE8DEF8),
    tertiary = TertiaryDark,
    onTertiary = Color(0xFF492532),
    tertiaryContainer = Color(0xFF633B48),
    onTertiaryContainer = Color(0xFFFFD8E4),
    error = ErrorDark,
    onError = Color(0xFF601410),
    errorContainer = Color(0xFF8C1D18),
    onErrorContainer = Color(0xFFF9DEDC),
    background = BackgroundDark,
    onBackground = Color(0xFFE6E1E5),
    surface = SurfaceDark,
    onSurface = Color(0xFFE6E1E5),
    surfaceVariant = Color(0xFF49454F),
    onSurfaceVariant = Color(0xFFCAC4D0),
    outline = Color(0xFF938F99)
)

/**
 * Defines the light color scheme for the SG360 app.
 */
private val LightColorScheme = lightColorScheme(
    primary = PrimaryLight,
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFFEADDFF),
    onPrimaryContainer = Color(0xFF21005D),
    secondary = SecondaryLight,
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFE8DEF8),
    onSecondaryContainer = Color(0xFF1D192B),
    tertiary = TertiaryLight,
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFFFD8E4),
    onTertiaryContainer = Color(0xFF31111D),
    error = ErrorLight,
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFF9DEDC),
    onErrorContainer = Color(0xFF410E0B),
    background = BackgroundLight,
    onBackground = Color(0xFF1C1B1F),
    surface = SurfaceLight,
    onSurface = Color(0xFF1C1B1F),
    surfaceVariant = Color(0xFFE7E0EC),
    onSurfaceVariant = Color(0xFF49454F),
    outline = Color(0xFF79747E)
)

/**
 * Composable function to apply the SG360 app's theme.
 *
 * This function sets up the app's theme with enhanced functionality including:
 * - Standard or dynamic color scheme selection
 * - Status bar color customization
 * - Custom dimension system
 *
 * @param darkTheme Boolean indicating whether to use the dark theme. Defaults to the system setting.
 * @param dynamicColor Boolean indicating whether to use dynamic colors (Android 12+). Defaults to true.
 * @param content The content of the app to be displayed within the theme.
 */
@Composable
fun SG360Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    // Determine the appropriate color scheme
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    // Status bar and system UI adjustments
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = !darkTheme
        }
    }

    // Provide custom dimensions
    CompositionLocalProvider(
        LocalSG360Dimensions provides SG360Dimensions(),
    ) {
        // Apply the MaterialTheme with the selected color scheme and typography
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}

/**
 * Extension property to easily access custom dimensions from composables
 */
val MaterialTheme.dimensions: SG360Dimensions
    @Composable
    get() = LocalSG360Dimensions.current