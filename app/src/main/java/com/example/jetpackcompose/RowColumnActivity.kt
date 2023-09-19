package com.example.jetpackcompose

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


class RowColumnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {


            Column(modifier = Modifier.padding(10.dp)) {
                Spacer(modifier = Modifier.padding(16.dp))
                Text(text = "Column :")
                Column(
                    modifier = Modifier
                        .border(width = 1.dp, color = androidx.compose.ui.graphics.Color.Blue)
                        .fillMaxWidth()
                        .height(200.dp),
                    //verticalArrangement = Arrangement.Center
                      horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Column 1")
                    Text(
                        text = "Column 2",
                       // modifier = Modifier.align(Alignment.CenterHorizontally)
                    )
                }

                Spacer(modifier = Modifier.padding(16.dp))

                Text(text = "Row :")
                Row(
                    modifier = Modifier
                        .border(width = 1.dp, color = androidx.compose.ui.graphics.Color.Red)
                        .fillMaxWidth()
                        .height(200.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Row 1",
                      //  modifier = Modifier.align(Alignment.CenterVertically)
                    )
                    Text(text = "Row 2")
                }

            }

        }
    }
}

