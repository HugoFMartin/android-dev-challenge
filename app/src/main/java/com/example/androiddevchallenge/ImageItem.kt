package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.ItemModel
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun ImageItem(
    item : ItemModel
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape),
            painter = painterResource(id = item.image),
            contentDescription = "Align your body image",
            contentScale = ContentScale.Crop
        )
        Text(
            modifier = Modifier
                .paddingFromBaseline(top = 24.dp),
            text = item.title,
            style = typography.h3,
            color = colors.onSurface
        )
    }
}