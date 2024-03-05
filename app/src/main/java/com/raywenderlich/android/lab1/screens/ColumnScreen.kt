package com.raywenderlich.android.lab1.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import com.raywenderlich.android.lab1.app.FundamentalsApp
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter

@Composable
fun ColumnScreen (){
    MyColumn()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(com.raywenderlich.android.lab1.router.Screen.Navigation)
    }
}

@Composable
fun MyColumn() {
    TODO("Not yet implemented")
}
