package com.example.chillingchatapp.Components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chillingchatapp.R
import com.example.chillingchatapp.ui.theme.ChillingChatAppTheme
import com.example.chillingchatapp.ui.theme.LocalAppColor
import com.example.chillingchatapp.ui.theme.LocalAppFont


@Composable
fun Slogan(slogan: String) {
    val slg1: String = slogan.substring(0, slogan.length / 2)
    val slg2: String = slogan.substring(slogan.length / 2, slogan.length)
    Column(
        modifier = Modifier
            .padding(top = 24.dp, bottom = 24.dp)
            .fillMaxWidth()
    ) {

        Text(
            slg1, style = TextStyle(
                color = LocalAppColor.current.titleColorWhite,
                fontSize = 68.sp,
                lineHeight = 90.sp,
                fontFamily = LocalAppFont.current.carosFont
            )
        )
        Spacer(Modifier.padding(10.dp))
        Text(
            slg2, style = TextStyle(
                fontWeight = FontWeight.Bold,
                color = LocalAppColor.current.titleColorWhite,
                fontSize = 68.sp,
                lineHeight = 90.sp,
                fontFamily = LocalAppFont.current.carosFont
            )
        )
    }
}

@Composable
fun SocialComponent(lightApple: Boolean) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.wrapContentSize()
    ) {
        CircleIcon(R.drawable.facebook_icon)
        CircleIcon(R.drawable.google_icon)
        if (lightApple) {
            CircleIcon(R.drawable.apple_icon_light)
        } else CircleIcon(R.drawable.apple_icon)
    }
}


@Composable
fun CircleIcon(icon: Int) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .clip(CircleShape)
            .border(BorderStroke(2.dp, Color.Black), CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painterResource(icon),
            contentDescription = "Facebook Icon",
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun SeparateComponent() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(LocalAppColor.current.titleColorWhite)
        )
        Text("OR", modifier = Modifier.padding(start = 12.dp, end = 12.dp), color = LocalAppColor.current.titleColorWhite)
        Box(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(LocalAppColor.current.titleColorWhite)
        )
    }
}

@Composable
fun CustomButton(content: String, isLight: Boolean) {
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .height(48.dp),
        colors = ButtonColors(
            LocalAppColor.current.primaryColor,
            LocalAppColor.current.titleColorWhite,
            Color.Red,
            Color.Blue
        ),
        shape = RoundedCornerShape(12.dp)
    ) {
        Text(content)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCustomButton() {
    ChillingChatAppTheme {

        CustomButton("Sign up withn mail", false)
    }
}
