package com.example.jetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Navigation()

            val mContext = LocalContext.current
            Column(Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.padding(70.dp))
                Button(modifier = Modifier.fillMaxWidth(), onClick = {
                    mContext.startActivity(Intent(mContext, RowColumnActivity::class.java))
                },
                    colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.LightGray),
                ) {
                    Text("Row and Column")
                }
            }
            

            
            val aContext = LocalContext.current
            Column(Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.padding(90.dp))
                Button(modifier = Modifier.fillMaxWidth(),
                    onClick = {
                    mContext.startActivity(Intent(aContext, ModifierActivity::class.java))
                },
                    colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.LightGray),
                ) {
                    Text("Modifier")
                }
            }


            val bContext = LocalContext.current
            Column(Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.padding(110.dp))
                Button(modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        mContext.startActivity(Intent(bContext, ComposableFunctionActivity::class.java))
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.LightGray),
                ) {
                    Text("Composable Function")
                }
            }

            val cContext = LocalContext.current
            Column(Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.padding(130.dp))
                Button(modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        mContext.startActivity(Intent(cContext, StateActivity::class.java))
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.LightGray),
                ) {
                    Text("State")
                }
            }

            val dContext = LocalContext.current
            Column(Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.padding(150.dp))
                Button(modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        mContext.startActivity(Intent(dContext, ScaffoldActivity::class.java))
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.LightGray),
                ) {
                    Text("Scaffold")
                }
            }


            val eContext = LocalContext.current
            Column(Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.padding(170.dp))
                Button(modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        mContext.startActivity(Intent(eContext, SimpleApplicationActivity::class.java))
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.LightGray),
                ) {
                    Text("Logic menghitung")
                }
            }


            val fContext = LocalContext.current
            Column(Modifier.fillMaxSize()) {
                Spacer(modifier = Modifier.padding(190.dp))
                Button(modifier = Modifier.fillMaxWidth(),
                    onClick = {
                        mContext.startActivity(Intent(fContext, RecyclerViewActivity::class.java))
                    },
                    colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.LightGray),
                ) {
                    Text("Recycler View")
                }
            }
        }
    }
}


