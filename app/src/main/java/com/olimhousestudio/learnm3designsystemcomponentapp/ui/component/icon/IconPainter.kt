package com.olimhousestudio.learnm3designsystemcomponentapp.ui.component.icon

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.olimhousestudio.learnm3designsystemcomponentapp.R

@Composable
fun IconPainterDemo(modifier: Modifier = Modifier) {
    Icon(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "demo")
}