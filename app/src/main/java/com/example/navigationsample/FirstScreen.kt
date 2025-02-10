package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.text.isDigitsOnly

@Composable
fun FirstScreen(
    // Unit function that executes the code you enter in !!!
    navigationToSecondScreen:(String, String)->Unit
) {
    val name: MutableState<String> = remember { mutableStateOf("") }
    val age = remember { mutableStateOf(0) }
    val ageStr: MutableState<String> = remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("1", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = name.value, onValueChange = {
            name.value = it  //!!!
        })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = ageStr.value,
            onValueChange = {
                ageStr.value = it
                age.value = ageStr.value.toIntOrNull() ?: -1
            }
        )

        Button(onClick = {
            navigationToSecondScreen(name.value, age.value.toString())
        }) { Text("Next") }
    }
}


@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    //FirstScreen({})
}