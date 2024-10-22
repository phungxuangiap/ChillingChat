package com.example.chillingchatapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chillingchatapp.Components.ListActiveAccount
import com.example.chillingchatapp.Components.ListNotification
import com.example.chillingchatapp.R
import com.example.chillingchatapp.ui.theme.LocalAppPadding

@Composable
fun ChatScreen() {
    Box() {
        Image(
            painterResource(R.drawable.background),
            modifier = Modifier.fillMaxSize(),
            contentDescription = ""
        )
        Column(
            modifier = Modifier.padding(
                top = LocalAppPadding.current.appPaddingTop.dp,
                start = LocalAppPadding.current.appPaddingAround.dp,
                end = LocalAppPadding.current.appPaddingAround.dp,
                bottom = LocalAppPadding.current.appPaddingBottom.dp
            )
        ) {
            ListNotification()
            ListActiveAccount()
        }
    }
}

@Preview
@Composable
fun PreviewChatScreen() {
    ChatScreen()
}