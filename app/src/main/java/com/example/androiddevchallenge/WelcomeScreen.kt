package com.example.androiddevchallenge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.ui.theme.shapes
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun WelcomeScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colors.background)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(bottom = 32.dp),
            text = "MY SOOTHE",
            style = typography.h1,
            color = colors.primary
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
                text = "Sign up",
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
                text = "Login",
                style = typography.button
            )
        }
    }

}