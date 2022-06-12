package com.learning.compose.layout

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid as LazyVerticalGrid1

@Preview
@Composable
fun LazyVerticalGridDemo(){
    val list = (1..10).map { it.toString() }

    LazyVerticalGrid1(
        columns = GridCells.Adaptive(128.dp),

        // content padding
        modifier = error("placeholder"),
        state = error("placeholder"),
        contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        ),
        reverseLayout = error("placeholder"),
        verticalArrangement = error("placeholder"),
        horizontalArrangement = error("placeholder"),
        flingBehavior = error("placeholder"),
        userScrollEnabled = error("placeholder")
    ) {
        items(list.size) { index ->
            Card(
                backgroundColor = Color.Red,
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                elevation = 8.dp,
            ) {
                Text(
                    text = list[index],
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = Color(0xFFFFFFFF),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}