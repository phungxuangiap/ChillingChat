package com.example.chillingchatapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chillingchatapp.Components.SeparateComponent
import com.example.chillingchatapp.Components.Slogan
import com.example.chillingchatapp.Components.SocialComponent
import com.example.chillingchatapp.R
import com.example.chillingchatapp.ui.theme.ChillingChatAppTheme
import com.example.chillingchatapp.ui.theme.LocalAppColor
import com.example.chillingchatapp.ui.theme.LocalAppTypography


@Composable
fun ExtranceScreen(slogan: String) {
    Box(modifier = Modifier
        .background(LocalAppColor.current.backgroundColorDark)
        .fillMaxSize()) {
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 0.dp, end = 0.dp, top = 38.dp, bottom = 38.dp),
                horizontalArrangement = Arrangement.Center,
            ) {
                Image(
                    painterResource(R.drawable.icon_app),
                    contentDescription = "IconApp",
                    modifier = Modifier.size(36.dp).padding(end = 6.dp)
                )
                Text(
                    "Chilling Chat",
                    style = LocalAppTypography.current.textInDescription,
                    color = LocalAppColor.current.titleColorWhite
                )
            }
            Slogan(slogan)
            Text(
                "Our chat app is the perfect way to stay connected with friends and family",
                style = LocalAppTypography.current.textInContent.copy(
                    fontSize = 16.sp,
                    lineHeight = 26.sp
                ),
                color = LocalAppColor.current.titleColorWhite,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(38.dp))
            SocialComponent(true)
            Spacer(modifier = Modifier.height(24.dp))
            SeparateComponent()
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewExtranceScreen() {
    ChillingChatAppTheme {
        ExtranceScreen("Connect friends easily & quickly")
    }
}