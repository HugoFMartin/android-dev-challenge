package com.example.androiddevchallenge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.model.ItemModel
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun HomeScreen() {

    val favoriteCollectionList = arrayOf(
        ItemModel(image = R.drawable.pexels_josh_sorenson_1054391, title = "Short mantras"),
        ItemModel(image = R.drawable.pexels_jim_1557238, title = "Stress and anxiety"),
        ItemModel(image = R.drawable.pexels_ruvim_3560044, title = "Overwhelmed"),
    )

    val favoriteCollectionListSecond = arrayOf(
        ItemModel(image = R.drawable.pexels_nothing_ahead_3571551, title = "Nature meditations"),
        ItemModel(image = R.drawable.pexels_scott_webb_1029604, title = "self-massage"),
        ItemModel(image = R.drawable.pexels_jakub_novacek_924824, title = "Nightly wind down")
    )


    val bodyCollectionList = arrayOf(
        ItemModel(image = R.drawable.pexels_chevanon_photography_317157, title = "Inversions"),
        ItemModel(image = R.drawable.pexels_agung_pandit_wiguna_1812964, title = "Quick yoga"),
        ItemModel(image = R.drawable.pexels_cliff_booth_4056723, title = "Stretching"),
        ItemModel(image = R.drawable.pexels_the_lazy_artist_gallery_999309, title = "Tabata"),
        ItemModel(image = R.drawable.pexels_scott_webb_1029604, title = "HIIT"),
        ItemModel(image = R.drawable.pexels_freestocksorg_396133, title = "Pre-natal yoga")
    )

    val mindCollectionList = arrayOf(
        ItemModel(image = R.drawable.pexels_elina_fairytale_3822622, title = "Meditate"),
        ItemModel(image = R.drawable.pexels_valeria_ushakova_3094230, title = "With kids"),
        ItemModel(image = R.drawable.pexels_karolina_grabowska_4498318, title = "Aromatherapy"),
        ItemModel(image = R.drawable.pexels_suraphat_nueaon_1241348, title = "On the go"),
        ItemModel(image = R.drawable.pexels_cottonbro_4056535, title = "With pets"),
        ItemModel(image = R.drawable.pexels_nathan_cowley_897817, title = "High stress")
    )

    MyTheme() {
        Scaffold(
            bottomBar = {
                BottomBar()
            },
            floatingActionButtonPosition = FabPosition.Center,
            isFloatingActionButtonDocked = true,
            floatingActionButton = {
                FloatingActionButton(
                    shape = CircleShape,
                    onClick = { /*TODO*/ },
                    backgroundColor = colors.primary
                ) {
                    Icon(
                        imageVector = Icons.Filled.PlayArrow,
                        contentDescription = "Play floating button",
                        tint = colors.onPrimary
                    )
                }
            }
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colors.background)
                    .padding(16.dp),
            ) {
                TextField(
                    modifier = Modifier
                        .padding(top = 56.dp)
                        .fillMaxWidth()
                        .height(48.dp),
                    value = "Search",
                    onValueChange = {},
                    textStyle = typography.body1,
                    maxLines = 1,
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = colors.surface,
                        focusedIndicatorColor = colors.onSurface,
                        unfocusedIndicatorColor = colors.onSurface,
                        textColor = colors.onSurface
                    ),
                    leadingIcon = {
                        Icon(
                            modifier = Modifier
                                .size(18.dp),
                            imageVector = Icons.Rounded.Search,
                            contentDescription = "Search icon",
                            tint = colors.onSurface
                        )
                    }
                )
                Text(
                    modifier = Modifier
                        .paddingFromBaseline(top = 40.dp),
                    text = "favorite collections",
                    style = typography.h2,
                    color = colors.onBackground
                )
                LazyRow(
                    modifier = Modifier
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(favoriteCollectionList.size) { index ->
                        CardItem(item = favoriteCollectionList[index])
                    }
                }

                LazyRow(
                    modifier = Modifier
                        .padding(top = 8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(favoriteCollectionListSecond.size) { index ->
                        CardItem(item = favoriteCollectionListSecond[index])
                    }
                }

                Text(
                    modifier = Modifier
                        .paddingFromBaseline(top = 48.dp, bottom = 8.dp),
                    text = "align your body",
                    style = typography.h2,
                    color = colors.onBackground
                )

                LazyRow(
                    content = {
                        items(bodyCollectionList.size) { index ->
                            ImageItem(item = bodyCollectionList[index])
                        }
                    },
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                )

                Text(
                    modifier = Modifier
                        .paddingFromBaseline(top = 48.dp, bottom = 8.dp),
                    text = "align your mind",
                    style = typography.h2,
                    color = colors.onBackground
                )

                LazyRow(
                    content = {
                        items(mindCollectionList.size) { index ->
                            ImageItem(item = mindCollectionList[index])
                        }
                    },
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                )
            }
        }
    }

}