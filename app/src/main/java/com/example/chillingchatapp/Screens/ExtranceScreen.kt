package com.example.chillingchatapp.Screens

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
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
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chillingchatapp.Components.AnimationExtranceBackgroundComponent
import com.example.chillingchatapp.Components.CustomButton
import com.example.chillingchatapp.Components.IntroductionTitle
import com.example.chillingchatapp.Components.LogoAndNameComponent
import com.example.chillingchatapp.Components.SeparateComponent
import com.example.chillingchatapp.Components.Slogan
import com.example.chillingchatapp.Components.SocialComponent
import com.example.chillingchatapp.Components.TitleAndLinkInlineComponent
import com.example.chillingchatapp.R
import com.example.chillingchatapp.ui.theme.ChillingChatAppTheme
import com.example.chillingchatapp.ui.theme.LocalAppColor
import com.example.chillingchatapp.ui.theme.LocalAppTypography


@Composable
fun ExtranceScreen(slogan: String) {

    Box(
        modifier = Modifier
            .background(LocalAppColor.current.backgroundColorDark)
            .fillMaxSize()
    ) {
        AnimationExtranceBackgroundComponent()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 62.dp, start = 24.dp, end = 24.dp, bottom = 24.dp),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                LogoAndNameComponent()
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Slogan(slogan)
                IntroductionTitle()
                Spacer(modifier = Modifier.height(24.dp))
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally) {

                SocialComponent(true)
                Spacer(modifier = Modifier.height(24.dp))
                SeparateComponent(true)
                Spacer(modifier = Modifier.height(24.dp))
                CustomButton("Sign up withn mail", false)
                Spacer(modifier = Modifier.height(24.dp))
                TitleAndLinkInlineComponent("Existing account? ", "Log in")
            }
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