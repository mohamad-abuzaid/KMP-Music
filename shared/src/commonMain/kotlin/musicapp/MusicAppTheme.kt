package musicapp

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * Created by "Mohamad Abuzaid" on 23/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
@Composable
internal fun MusicAppTheme(
    content: @Composable () -> Unit
) {
    val colors = darkColors(
        primary = Color(0xFF1D2123),
        primaryVariant = Color(0xFF3700B3),
        secondary = Color(0xFFFACD66),
        surface = Color(0xFF1E1E1E),
        background = Color(0xFF1E1E1E),
        onSurface = Color(0xFF1E1E1E),
    )

    val typography = Typography(
        body1 = TextStyle(
            fontFamily = FontFamily.Default, fontWeight = FontWeight.Normal, fontSize = 16.sp
        )
    )
    val shapes = Shapes(
        small = RoundedCornerShape(4.dp),
        medium = RoundedCornerShape(4.dp),
        large = RoundedCornerShape(0.dp)
    )

    MaterialTheme(
        colors = colors, typography = typography, shapes = shapes, content = content
    )
}
