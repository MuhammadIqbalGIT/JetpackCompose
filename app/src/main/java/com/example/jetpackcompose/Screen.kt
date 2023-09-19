package com.example.jetpackcompose

sealed class Screen(val route :String) {
    object MainScreen : Screen ("main_screen")
    object DetailScreen : Screen ("detail_screen")
    object DetailScreen1 : Screen ("row_column_screen")


    fun withArgs (vararg args:String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
            append("/$arg")}
        }
    }
 }
