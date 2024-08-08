package com.olimhousestudio.learnm3designsystemcomponentapp.ui.component.image

import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ImageImageVectorDemo(modifier: Modifier = Modifier) {
    Image(imageVector = Icons.Default.Add, contentDescription = "demo")
}