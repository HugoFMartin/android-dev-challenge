package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration.Companion.Underline
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun LoginScreen(
    navController: NavController
) {
    Image(
        painter = painterResource(if (isSystemInDarkTheme()) R.drawable.ic_dark_login else R.drawable.ic_light_login),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .background(colors.background),
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            modifier = Modifier
                .paddingFromBaseline(top = 200.dp)
                .padding(bottom = 32.dp),
            text = "LOG IN",
            style = typography.h1,
            color = colors.onBackground
        )
        TextField(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .height(56.dp)
                .fillMaxWidth(),
            value = "Email adress",
            onValueChange = {},
            textStyle = typography.body1,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = colors.surface,
                focusedIndicatorColor = colors.onSurface,
                unfocusedIndicatorColor = colors.onSurface,
                textColor = colors.onSurface
            )
        )
        TextField(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .height(56.dp)
                .fillMaxWidth(),
            value = "Password",
            onValueChange = {},
            textStyle = typography.body1,
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = colors.surface,
                focusedIndicatorColor = colors.onSurface,
                unfocusedIndicatorColor = colors.onSurface,
                textColor = colors.onSurface
            )
        )
        Button(
            modifier = Modifier
                .height(72.dp)
                .fillMaxWidth(),
            onClick = {
                navController.navigate("home")
            },
            shape = shapes.medium,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colors.primary,
                contentColor = colors.onPrimary
            )
        ) {
            Text(
                text = "log in",
                style = typography.button
            )
        }
        Row(
            modifier = Modifier
                .paddingFromBaseline(top = 32.dp)
        ) {
            Text(
                text = "Don't have an account? ",
                color = colors.onBackground,
                style = typography.body1
            )
            Text(
                text = "Sign up",
                color = colors.onBackground,
                style = typography.body1,
                textDecoration = Underline
            )
        }
    }
}