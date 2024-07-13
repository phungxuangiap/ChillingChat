package com.example.chillingchatapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chillingchatapp.Components.BigBoldTitleComponent
import com.example.chillingchatapp.Components.ContentLoginRegisterComponent
import com.example.chillingchatapp.Components.CustomButton
import com.example.chillingchatapp.Components.LinkingText
import com.example.chillingchatapp.Components.NormalTextField
import com.example.chillingchatapp.Components.PreviousButtonElement
import com.example.chillingchatapp.Components.SeparateComponent
import com.example.chillingchatapp.Components.SocialComponent
import com.example.chillingchatapp.ui.theme.ChillingChatAppTheme
import com.example.chillingchatapp.ui.theme.LocalAppColor

@Composable
fun RegisterScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(LocalAppColor.current.backgroundColorLight)) {
        Column(
            modifier = Modifier.padding(top = 62.dp, start = 24.dp, end = 24.dp, bottom = 24.dp).fillMaxSize(),

            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,) {

                PreviousButtonElement()
                Spacer(modifier = Modifier.height(38.dp))
                BigBoldTitleComponent("Sign up with ", "Email", false)
                Spacer(modifier = Modifier.height(24.dp))
                ContentLoginRegisterComponent("Get chatting with friends and family today by signing up for out chat app!")
                Spacer(modifier = Modifier.height(56.dp))

                NormalTextField("Your name", false)
                Spacer(modifier = Modifier.height(24.dp))

                NormalTextField("Your email", false)
                Spacer(modifier = Modifier.height(24.dp))

                NormalTextField("Password", false)
                Spacer(modifier = Modifier.height(24.dp))

                NormalTextField("Confirm Password", false)
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally,) {

                CustomButton("Create an account", true)
                Spacer(modifier = Modifier.height(38.dp))

            }
        }
    }
}

@Preview
@Composable
fun PreviewRegisterScreen() {
    ChillingChatAppTheme {
        RegisterScreen()
    }
}