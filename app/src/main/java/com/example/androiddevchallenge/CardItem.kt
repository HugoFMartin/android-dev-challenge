package com.example.androiddevchallenge

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.ItemModel
import com.example.androiddevchallenge.ui.theme.shapes
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun CardItem(
    item: ItemModel
) {
    Card(
        modifier = Modifier
            .size(height = 56.dp, width = 192.dp),
        shape = shapes.small,
        backgroundColor = colors.surface
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(colors.surface),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(56.dp),
                painter = painterResource(id = item.image),
                contentDescription = "Collection image",
                contentScale = ContentScale.Crop,
            )
            Text(
                modifier = Modifier
                    .padding(start = 8.dp),
                text = item.title,
                style = typography.h3
            )
        }
    }
}