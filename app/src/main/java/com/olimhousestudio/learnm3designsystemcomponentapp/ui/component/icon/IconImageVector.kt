package com.olimhousestudio.learnm3designsystemcomponentapp.ui.component.icon

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun IconImageVectorDemo(modifier: Modifier = Modifier) {
    Icon(imageVector = Icons.Default.Add, contentDescription = "demo")
}