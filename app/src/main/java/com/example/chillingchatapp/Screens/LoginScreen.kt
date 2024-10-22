package com.example.chillingchatapp.Screens

import android.graphics.Paint.Align
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
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
import com.example.chillingchatapp.R
import com.example.chillingchatapp.ui.theme.ChillingChatAppTheme
import com.example.chillingchatapp.ui.theme.LocalAppColor

@Composable
fun LoginScreen() {
    val password = remember { mutableStateOf("") }
    val changePassword = fun(newValue:String){
        password.value = newValue
    }
    val userName = remember{ mutableStateOf("") }
    val changeUserName = fun(newValue:String){
        userName.value = newValue
    }
    Box(modifier = Modifier
        .fillMaxSize()) {
        Image(painterResource(R.drawable.background), modifier = Modifier.fillMaxSize(), contentDescription = "")
        Column(
            modifier = Modifier.padding(top = 62.dp, start = 24.dp, end = 24.dp, bottom = 24.dp).fillMaxSize(),

            verticalArrangement = Arrangement.SpaceAround
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,) {

                PreviousButtonElement()
                Spacer(modifier = Modifier.height(38.dp))
                BigBoldTitleComponent("Login")
                Spacer(modifier = Modifier.height(24.dp))
                ContentLoginRegisterComponent("Welcome back! Sign in using your social account or email to continue us")
                Spacer(modifier = Modifier.height(24.dp))

                SocialComponent(false)
                Spacer(modifier = Modifier.height(24.dp))

                SeparateComponent(false)
                Spacer(modifier = Modifier.height(24.dp))

                NormalTextField("User name", false, content = userName.value, changeContent = changeUserName)
                Spacer(modifier = Modifier.height(24.dp))

                NormalTextField("Password", false, content = password.value, changeContent = changePassword, type = "password")
            }
            Column(horizontalAlignment = Alignment.CenterHorizontally,) {

                CustomButton("Log in", true)
                Spacer(modifier = Modifier.height(24.dp))

                LinkingText("Forgot password?")
                Spacer(modifier = Modifier.height(18.dp))
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("Haven't had account? ", color = LocalAppColor.current.titleColorWhite)
                    LinkingText("Register")
                }
                Spacer(modifier = Modifier.height(38.dp))
            }
        }
    }
}

@Preview
@Composable
fun PreviewLoginScreen() {
    ChillingChatAppTheme {
        LoginScreen()
    }
}