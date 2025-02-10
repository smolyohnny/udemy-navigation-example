package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ThirdScreen(navigationToSecondScreen:()->Unit,
                navigationToFirstScreen:()->Unit
                )
{
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("3", fontSize = 24.sp)
        Spacer(Modifier.height(16.dp))

        Row {

            Button(onClick = {
                navigationToSecondScreen()
            }) {
                Text("Previous")
            }

            Button(onClick = {
                navigationToFirstScreen()
            }) {
                Text("Next")
            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun ThirdScreenComposable() {
    ThirdScreen({}, {})
}