package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.ui.theme.shapes
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun WelcomeScreen(
    navController: NavController
) {
    Image(
        painter = painterResource(if (isSystemInDarkTheme()) R.drawable.ic_dark_welcome else R.drawable.ic_light_welcome),
        contentDescription = null,
        modifier = Modifier
            .fillMaxSize()
            .background(colors.background),
        contentScale = ContentScale.Crop
    )
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            modifier = Modifier.padding(bottom = 32.dp),
            painter = painterResource(if (isSystemInDarkTheme()) R.drawable.ic_dark_logo else R.drawable.ic_light_logo),
            contentDescription = "Welcome logo"
        )
        Button(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .height(72.dp)
                .fillMaxWidth()
                ,
            onClick = {},
            shape = shapes.medium,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colors.primary,
                contentColor = colors.onPrimary
            )
        ) {
            Text(
                text = "SIGN UP",
                style = typography.button
            )
        }
        Button(
            modifier = Modifier
                .height(72.dp)
                .fillMaxWidth(),
            onClick = {
                navController.navigate("login")
            },
            shape = shapes.medium,
            colors = ButtonDefaults.buttonColors(
                backgroundColor = colors.secondary,
                contentColor = colors.onSecondary
            )
        ) {
            Text(
                text = "LOGIN",
                style = typography.button
            )
        }
    }

}