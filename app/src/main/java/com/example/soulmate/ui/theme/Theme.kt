package com.example.soulmate.ui.theme



import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = PureBlack,
    onPrimary = WhiteBackground,
    background = WhiteBackground,
    onBackground = DarkText,
    surface = WhiteBackground,
    onSurface = DarkText
)

@Composable
fun SoulMateTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = Typography(),
        content = content
    )
}