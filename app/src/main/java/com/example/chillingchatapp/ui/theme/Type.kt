package com.example.chillingchatapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chillingchatapp.R

// Set of Material typography styles to start with
data class fontFamily(
    val carosFont:FontFamily,
    val alataFont:FontFamily,
    val abeezeeFont:FontFamily,
    val archivoFont:FontFamily,
    val tintFontRegular: FontFamily,
    val tintFontBold: FontFamily,
    val tintFontThin: FontFamily,
)
val CustomFont = fontFamily(
    carosFont = FontFamily(
        Font(R.font.aclonica)
    ),
    alataFont = FontFamily(
        Font(R.font.alata)
    ),
    abeezeeFont = FontFamily(
        Font(R.font.abeezee)
    ),
    archivoFont = FontFamily(
        Font(R.font.archivo)
    ),
    tintFontRegular = FontFamily(
        Font(R.font.inter_regular)
    ),
    tintFontBold = FontFamily(
        Font(R.font.inter_bold)
    ),
    tintFontThin = FontFamily(
        Font(R.font.inter_thin)
    )
)
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */

)

data class CustomTypo(
    val textInTitle: TextStyle = TextStyle(),
    val textInContent: TextStyle = TextStyle(),
    val textInTyping: TextStyle = TextStyle(),
    val textInName: TextStyle = TextStyle(),
    val textInMessage: TextStyle = TextStyle(),
    val textInDescription: TextStyle = TextStyle(),
    val textBold14:TextStyle = TextStyle()
)

val CustomTypography = CustomTypo(
    textInTitle = TextStyle(
        fontFamily = CustomFont.tintFontBold,
        fontWeight = FontWeight.W100,
        fontSize = 32.sp,
        lineHeight = 32.sp
    ),
    textInContent = TextStyle(
        fontFamily = CustomFont.tintFontRegular,
        fontWeight = FontWeight.Light,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),
    textInTyping = TextStyle(
        fontFamily = CustomFont.tintFontRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 16.sp,
    ),
    textInName = TextStyle(
        fontFamily = CustomFont.tintFontRegular,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 20.sp,
    ),
    textInMessage = TextStyle(
        fontFamily = CustomFont.tintFontRegular,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 12.sp,
        letterSpacing = 0.1.sp
    ),
    textInDescription = TextStyle(
        fontFamily = CustomFont.tintFontRegular,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        letterSpacing = 1.sp
    ),
    textBold14 = TextStyle(
        fontFamily = CustomFont.tintFontBold,
        fontWeight = FontWeight.Thin,
        fontSize = 14.sp,
        lineHeight = 14.sp,
        letterSpacing = 1.sp
    )
)

