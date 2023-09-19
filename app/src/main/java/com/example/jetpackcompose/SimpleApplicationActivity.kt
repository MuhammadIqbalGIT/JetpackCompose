package com.example.jetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import java.nio.file.WatchEvent.Modifier

class SimpleApplicationActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var panjangState by remember {
                mutableStateOf("")
            }
            var lebarState by remember {
                mutableStateOf("")
            }
            var hasilState by remember {
                mutableStateOf(0)
            }

            Scaffold(
                modifier = androidx.compose.ui.Modifier.fillMaxSize(),
                topBar = {
                    TopAppBar(title = {
                        Text(text = "Persegi panjang")
                    }
                    )
                }
            )


            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxSize()
                        .padding(15.dp)
                ) {
                    TextField(
                        value = panjangState,
                        label = {
                            Text(text = "Panjang")
                        },
                        onValueChange = {
                            panjangState = it.toString()
                        },
                        modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                    )

                    TextField(
                        value = lebarState,
                        label = {
                            Text(text = "Lebar")
                        },
                        onValueChange = {
                            lebarState = it.toString()
                        },
                        modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = androidx.compose.ui.Modifier.padding(10.dp))
                    Button(
                        onClick = { hasilState = panjangState.toInt() * lebarState.toInt() },
                        modifier = androidx.compose.ui.Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Hitung")
                    }

                    Spacer(modifier = androidx.compose.ui.Modifier.padding(15.dp))
                    Text(text = hasilState.toString())
                }
            }
        }
    }
}
