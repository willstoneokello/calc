package com.example.simplecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CalculatorScreen()
        }
    }
}

@Composable
fun CalculatorScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "0",
            fontSize = 40.sp,
            modifier = Modifier.padding(16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Button(onClick = {}) {
                Text("7")
            }

            Button(onClick = {}) {
                Text("8")
            }

            Button(onClick = {}) {
                Text("9")
            }

            Button(onClick = {}) {
                Text("/")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Button(onClick = {}) {
                Text("4")
            }

            Button(onClick = {}) {
                Text("5")
            }

            Button(onClick = {}) {
                Text("6")
            }

            Button(onClick = {}) {
                Text("*")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Button(onClick = {}) {
                Text("1")
            }

            Button(onClick = {}) {
                Text("2")
            }

            Button(onClick = {}) {
                Text("3")
            }

            Button(onClick = {}) {
                Text("-")
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            Button(onClick = {}) {
                Text("0")
            }

            Button(onClick = {}) {
                Text("C")
            }

            Button(onClick = {}) {
                Text("=")
            }

            Button(onClick = {}) {
                Text("+")
            }
        }
    }
}