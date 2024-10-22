package com.example.chillingchatapp.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val PrimaryColor = Color(0xFFF5F87B)
val PrimaryTextColor = Color(0xFFFFCB45)
val BackgroundColorDark = Color(0xFF1E1E1E)
val TertiaryColor = Color(0xFFF04A4C)
val BackgroundColorLight = Color(0xFFFFFFFF)
val TitleColorBlack = Color(0xFF000E08)
val TitleColorWhite = Color.White
val ContentColorWhite = Color(0xFFDBE8E6)
val ContentColorGray = Color(0xFF797C7B)
val DisableButtonColor = Color(0xFFF3F6F6)

data class customColor(
    val primaryColor: Color,
    val primaryTextColor: Color,
    val backgroundColorLight: Color,
    val backgroundColorDark: Color,
    val titleColorBlack: Color,
    val titleColorWhite: Color,
    val contentColorWhite: Color,
    val contentColorGray: Color,
    val tertiaryColor: Color,
    val disableButtonColor: Color
)

val CustomColor = customColor(
    primaryColor = PrimaryColor,
    primaryTextColor = PrimaryTextColor,
    backgroundColorLight = BackgroundColorLight,
    backgroundColorDark = BackgroundColorDark,
    titleColorBlack = TitleColorBlack,
    titleColorWhite = TitleColorWhite,
    contentColorWhite = ContentColorWhite,
    contentColorGray = ContentColorGray,
    tertiaryColor = TertiaryColor,
    disableButtonColor = DisableButtonColor
)

