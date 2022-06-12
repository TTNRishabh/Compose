package com.learning.compose.layout

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.learning.composedemo.R

@Preview
@Composable
fun ImageResourceDemo() {
    val image: Painter = painterResource(id = R.drawable.ic_launcher_background)
    Image(painter = image,contentDescription = "")
}