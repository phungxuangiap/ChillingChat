package com.example.chillingchatapp.Components

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W200
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.chillingchatapp.R
import com.example.chillingchatapp.ui.theme.LocalAppColor
import com.example.chillingchatapp.ui.theme.LocalAppFont
import com.example.chillingchatapp.ui.theme.LocalAppPadding
import com.example.chillingchatapp.ui.theme.LocalAppTypography


@Composable
fun Slogan(slogan: String) {
    val slg1: String = slogan.substring(0, slogan.length / 2)
    val slg2: String = slogan.substring(slogan.length / 2, slogan.length)
    Column(
        modifier = Modifier
            .padding(bottom = 24.dp)
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
fun IntroductionTitle() {
    Text(
        "Our chat app is the perfect way to stay connected with friends and family",
        style = LocalAppTypography.current.textInContent.copy(
            fontSize = 16.sp, lineHeight = 26.sp, fontWeight = FontWeight.ExtraLight
        ),
        color = LocalAppColor.current.titleColorWhite,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun LogoAndNameComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 0.dp, end = 0.dp, bottom = 24.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painterResource(R.drawable.icon_app),
            contentDescription = "IconApp",
            modifier = Modifier
                .size(36.dp)
                .padding(end = 6.dp)
        )
        Text(
            "Chilling Chat",
            style = LocalAppTypography.current.textInDescription,
            color = LocalAppColor.current.titleColorWhite
        )
    }
}

@Composable
fun SocialComponent(isDarkMode: Boolean) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.wrapContentSize()
    ) {
        CircleIcon(R.drawable.facebook_icon, isDarkMode)
        CircleIcon(R.drawable.google_icon, isDarkMode)
//        if (isDarkMode) {
//            CircleIcon(R.drawable.apple_icon_light, isDarkMode)
//        } else CircleIcon(R.drawable.apple_icon, isDarkMode)
    }
}

@Composable
fun CircleIcon(icon: Int, isDarkMode: Boolean) {
    Box(
        modifier = Modifier
            .size(48.dp)
            .clip(CircleShape)
            .border(
                BorderStroke(
                    1.dp,
                    if (isDarkMode) LocalAppColor.current.primaryColor else LocalAppColor.current.titleColorWhite
                ), CircleShape
            ), contentAlignment = Alignment.Center
    ) {
        Image(
            painterResource(icon), contentDescription = "Icon", modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun SeparateComponent(isDarkMode: Boolean) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(if (isDarkMode) LocalAppColor.current.titleColorWhite else LocalAppColor.current.contentColorGray)
        )
        Text(
            "OR",
            modifier = Modifier.padding(start = 12.dp, end = 12.dp),
            color = if (isDarkMode) LocalAppColor.current.titleColorWhite else LocalAppColor.current.contentColorGray
        )
        Box(
            modifier = Modifier
                .weight(1f)
                .height(1.dp)
                .background(if (isDarkMode) LocalAppColor.current.titleColorWhite else LocalAppColor.current.contentColorGray)
        )
    }
}

@Composable
fun CustomButton(content: String, isLightMode: Boolean, isDisable: Boolean = false) {
    Button(
        onClick = {}, modifier = Modifier
            .fillMaxWidth()
            .height(48.dp), colors = ButtonColors(
            if (isLightMode) LocalAppColor.current.primaryColor else LocalAppColor.current.backgroundColorLight,
            if (isLightMode) LocalAppColor.current.titleColorWhite else LocalAppColor.current.titleColorBlack,
            LocalAppColor.current.disableButtonColor,
            LocalAppColor.current.contentColorGray
        ), shape = RoundedCornerShape(12.dp), enabled = !isDisable
    ) {
        Text(content, color = LocalAppColor.current.titleColorBlack)
    }
}

@Composable
fun TitleAndLinkInlineComponent(title: String, linkContent: String, onLinkClick: () -> Unit = {}) {
    Row {
        Text(
            "$title ",
            style = LocalAppTypography.current.textInDescription.copy(fontWeight = FontWeight.Light),
            color = LocalAppColor.current.contentColorWhite
        )
        Text(linkContent,
            style = LocalAppTypography.current.textInDescription,
            color = LocalAppColor.current.contentColorWhite,
            modifier = Modifier.clickable { onLinkClick() })
    }
}

@Composable
fun AnimationExtranceBackgroundComponent() {
    val primaryColor = LocalAppColor.current.primaryTextColor
    val infiniteTransition = rememberInfiniteTransition()
    val positionXTransitionE1 by infiniteTransition.animateFloat(
        initialValue = -500f, targetValue = 200f, animationSpec = infiniteRepeatable(
            animation = tween(8000), repeatMode = RepeatMode.Reverse
        ), label = ""
    )
    val positionYTransitionE1 by infiniteTransition.animateFloat(
        initialValue = -800f, targetValue = -600f, animationSpec = infiniteRepeatable(
            animation = tween(8000), repeatMode = RepeatMode.Reverse
        ), label = ""
    )
    val positionXTransitionE2 by infiniteTransition.animateFloat(
        initialValue = 100f, targetValue = -300f, animationSpec = infiniteRepeatable(
            animation = tween(8000), repeatMode = RepeatMode.Reverse
        ), label = ""
    )
    val positionYTransitionE2 by infiniteTransition.animateFloat(
        initialValue = -400f, targetValue = -200f, animationSpec = infiniteRepeatable(
            animation = tween(8000), repeatMode = RepeatMode.Reverse
        ), label = ""
    )
    val positionXTransitionE3 by infiniteTransition.animateFloat(
        initialValue = -300f, targetValue = -300f, animationSpec = infiniteRepeatable(
            animation = tween(8000), repeatMode = RepeatMode.Reverse
        ), label = ""
    )
    val positionYTransitionE3 by infiniteTransition.animateFloat(
        initialValue = -100f, targetValue = -700f, animationSpec = infiniteRepeatable(
            animation = tween(8000), repeatMode = RepeatMode.Reverse
        ), label = ""
    )
    val positionXTransitionE4 by infiniteTransition.animateFloat(
        initialValue = 300f, targetValue = 300f, animationSpec = infiniteRepeatable(
            animation = tween(8000), repeatMode = RepeatMode.Reverse
        ), label = ""
    )
    val positionYTransitionE4 by infiniteTransition.animateFloat(
        initialValue = 200f, targetValue = -200f, animationSpec = infiniteRepeatable(
            animation = tween(8000), repeatMode = RepeatMode.Reverse
        ), label = ""
    )
    androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
        translate(left = positionXTransitionE1, top = positionYTransitionE1) {
            scale(scaleX = 0.3f, scaleY = 0.3f) {
                drawCircle(primaryColor)
            }

        }
    }
    androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
        translate(left = positionXTransitionE2, top = positionYTransitionE2) {
            scale(scaleX = 0.6f, scaleY = 0.6f) {
                drawCircle(primaryColor)
            }

        }
    }
    androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
        translate(left = positionXTransitionE3, top = positionYTransitionE3) {
            scale(scaleX = 0.1f, scaleY = 0.1f) {
                drawCircle(primaryColor)
            }

        }
    }
    androidx.compose.foundation.Canvas(modifier = Modifier.fillMaxSize()) {
        translate(left = positionXTransitionE4, top = positionYTransitionE4) {
            scale(scaleX = 0.1f, scaleY = 0.1f) {
                drawCircle(primaryColor)
            }

        }
    }
}

@Composable
fun PreviousButtonElement(onClick: () -> Unit = {}) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Icon(
            Icons.Rounded.ArrowBack,
            contentDescription = "Back",
            modifier = Modifier.clickable { onClick() })
    }
}

@Composable
fun BigBoldTitleComponent(content: String) {
    val primaryColor = LocalAppColor.current.primaryColor
    Text(content, style = LocalAppTypography.current.textInTitle, color = primaryColor)
}

@Composable
fun ContentLoginRegisterComponent(content: String) {
    Text(
        content,
        style = LocalAppTypography.current.textInContent.copy(textAlign = TextAlign.Center),
        color = LocalAppColor.current.contentColorGray,
        modifier = Modifier.padding(start = 24.dp, end = 24.dp)
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NormalTextField(
    description: String,
    isInvalid: Boolean,
    content: String = "",
    changeContent: (String) -> Unit = {},
    type: String = ""
) {
    val password = remember { mutableStateOf("") }
    val changePassword = fun(newValue: String) {
        password.value = ("*").repeat(newValue.length)
    }

    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            description,
            style = LocalAppTypography.current.textInDescription,
            color = if (isInvalid) LocalAppColor.current.tertiaryColor else LocalAppColor.current.contentColorGray,
            modifier = Modifier.padding(bottom = 24.dp)
        )
        BasicTextField(
            if (type == "password") password.value else content,
            onValueChange = { it ->
                changeContent(it)
                changePassword(it)
            },
            textStyle = LocalAppTypography.current.textInTyping.copy(color = LocalAppColor.current.primaryTextColor),
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),

            )
        Box(
            modifier = Modifier
                .height(2.dp)
                .background(LocalAppColor.current.contentColorWhite)
                .fillMaxWidth()
        )
        if (isInvalid) {
            Text(
                "Invalid email address",
                style = LocalAppTypography.current.textInMessage,
                color = LocalAppColor.current.tertiaryColor,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 6.dp),
                textAlign = TextAlign.End
            )
        }
    }

}

@Composable
fun LinkingText(content: String, onClick: () -> Unit = {}) {

    Text(
        content,
        style = LocalAppTypography.current.textInDescription,
        color = LocalAppColor.current.primaryColor,
        modifier = Modifier.clickable { onClick() }
    )
}

@Composable
fun ListNotification(modifier: Modifier = Modifier) {
    val notification = remember { mutableStateOf("You have 3 unseen messages") }
    Text(
        notification.value,
        style = LocalAppTypography.current.textInContent.copy(
            color = LocalAppColor.current.contentColorWhite,
            fontSize = 16.sp,
            fontWeight = W200
        ),
        modifier = modifier.padding(
            start = LocalAppPadding.current.appPaddingAround.dp,
            end = LocalAppPadding.current.appPaddingAround.dp
        )
    )
}

@Composable
fun ListActiveAccount() {
    val listActiveAccount = listOf(1, 2, 3, 4, 5, 6, 7, 8)
    val avata = "https://i.pinimg.com/736x/a6/61/f4/a661f414ac9a447b953338b2c953bb38.jpg"
    val name = "Alex Gi"
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
            .padding(top = LocalAppPadding.current.appPaddingAround.dp)
    ) {
        listActiveAccount.forEach { e ->
            AccountComponent(avata, name)

        }
    }
}

@Composable
fun AccountComponent(avata: String, name: String) {
    Column(
        modifier = Modifier.padding(
            start = LocalAppPadding.current.appPaddingAround.dp,
            end = (LocalAppPadding.current.appPaddingAround - 12).dp
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(74.dp)
                .clip(RoundedCornerShape(50))
                .border(2.dp, LocalAppColor.current.primaryColor, CircleShape),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = avata, contentDescription = "", modifier = Modifier
                    .size(60.dp)
                    .clip(
                        RoundedCornerShape(50)
                    )
            )

        }
        Text(
            name,
            color = LocalAppColor.current.titleColorWhite,
            style = LocalAppTypography.current.textBold14
        )
    }
}

@Composable
fun ListChat() {
    val listChat = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)
    Box(
        modifier = Modifier
            .padding(top = LocalAppPadding.current.appPaddingAround.dp)
            .clip(RoundedCornerShape(50.dp))
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp)
                .background(LocalAppColor.current.contentColorWhite)
                .heightIn(0.dp, 1200.dp)
        ) {
            itemsIndexed(listChat) { key, item ->
                ChatComponent()
            }
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(LocalAppColor.current.contentColorWhite)

                .padding(top = 24.dp, bottom = 24.dp)
        ) {
            Box(
                modifier = Modifier
                    .width(120.dp)
                    .height(4.dp)
                    .background(LocalAppColor.current.contentColorGray)
            )
        }
    }

}

@Composable
fun ChatComponent() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                start = LocalAppPadding.current.appPaddingAround.dp,
                end = LocalAppPadding.current.appPaddingAround.dp,
                bottom = LocalAppPadding.current.appPaddingAround.dp
            )
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            AsyncImage(
                model = "https://i.pinimg.com/736x/a6/61/f4/a661f414ac9a447b953338b2c953bb38.jpg",
                contentDescription = "",
                modifier = Modifier
                    .width(64.dp)
                    .height(64.dp)
                    .clip(
                        RoundedCornerShape(50)
                    )
            )
            Column {
                Text("Alex Gi")
                Text("Your cum's so big")
            }
        }

        Column {
            Text("22:33 PM")
            Text("seen")
        }
    }
}


