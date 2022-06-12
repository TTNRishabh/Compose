package com.learning.compose.layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.learning.composedemo.R

class ConstraintLayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(color = MaterialTheme.colors.background) {
                ConstraintLayoutExample()
            }
        }
    }
}


@Preview
@Composable
fun ConstraintLayoutExample() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        val (logo, topBar, companyName) = createRefs()

        // TopAppBar Composable
        TopAppBar(
            modifier = Modifier

                .constrainAs(topBar) {

                    top.linkTo(parent.top)

                    start.linkTo(parent.start)

                    end.linkTo(parent.end)
                },

            backgroundColor = Color.Green
        ) {

            Text(
                text = "Constraint Layout", color = Color.White
            )
        }


        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "company logo",
            modifier = Modifier
                .size(70.dp)

                // Pass the reference
                .constrainAs(logo) {

                    top.linkTo(topBar.bottom)

                    start.linkTo(parent.start)

                    end.linkTo(parent.end)

                    bottom.linkTo(companyName.top)
                })

        Text(
            text = "Rishabh from TTN",
            color = Color.Black,
            modifier = Modifier.
                // Passing the reference
            constrainAs(companyName) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })
    }
}