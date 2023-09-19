package com.example.jetpackcompose

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class ScaffoldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScaffoldExample()

        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ScaffoldExample() {
    val materialBlue700 = Color(0xFF1976D2)
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = "Belajar Scaffold")
            },
                backgroundColor = materialBlue700
            )
        },
        bottomBar = {
            BottomAppBar(backgroundColor = materialBlue700
            ) {
                Text(text = "Bottom Bar")
            }
        } ,
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Text(text = "+")
                
            }
        },
        floatingActionButtonPosition = FabPosition.End,
        drawerContent = {
            Text(text = "Ini Drawer")
        },
        content = {
            Text(text = "ini content")
        }
    )
}