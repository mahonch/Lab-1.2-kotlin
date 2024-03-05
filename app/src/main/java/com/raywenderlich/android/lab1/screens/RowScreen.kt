package com.raywenderlich.android.lab1.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import com.raywenderlich.android.lab1.router.Screen.Navigation
import com.raywenderlich.android.lab1.R
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter

val THREE_ELEMENT_LIST = listOf(R.string.first, R.string.second, R.string.third)

@Composable
fun RowScreen(){
    MyRow()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(com.raywenderlich.android.lab1.router.Screen.Navigation)
    }
}

@Composable
fun MyRow(){

}