package com.example.androiddevchallenge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.typography

@Preview
@Composable
fun BottomBar() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        elevation = 45.dp
    ) {
        Row(
            modifier = Modifier
                .background(colors.background),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    modifier = Modifier
                        .size(18.dp),
                    imageVector = Icons.Filled.Spa,
                    contentDescription = "Home bottomBar icon",
                    tint = colors.onBackground
                )
                Text(
                    text = "Home",
                    style = typography.caption
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    modifier = Modifier
                        .size(18.dp),
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = "Profile bottomBar icon",
                    tint = colors.onBackground
                )
                Text(
                    text = "Profile",
                    style = typography.caption
                )
            }
        }
    }
}