package com.example.chillingchatapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.chillingchatapp.Screens.ChatScreen
import com.example.chillingchatapp.Screens.ExtranceScreen
import com.example.chillingchatapp.Screens.LoginScreen
import com.example.chillingchatapp.Screens.RegisterScreen
import com.example.chillingchatapp.ui.theme.ChillingChatAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChillingChatAppTheme {
//                LoginScreen()
//                RegisterScreen()
//                ExtranceScreen("Connect friends easily & quickly")
                ChatScreen()
            }
        }
    }
}

