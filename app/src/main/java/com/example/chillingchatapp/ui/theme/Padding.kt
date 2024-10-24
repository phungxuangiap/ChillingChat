package com.example.chillingchatapp.ui.theme


val appPaddingAround = 24
val appPaddingTop = 76
val appPaddingBottom = 38

data class customPadding(
    val appPaddingAround: Int,
    val appPaddingTop: Int,
    val appPaddingBottom: Int
)

val CustomPadding =
    customPadding(appPaddingAround, appPaddingTop, appPaddingBottom)