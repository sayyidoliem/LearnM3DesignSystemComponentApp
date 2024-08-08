package com.olimhousestudio.learnm3designsystemcomponentapp.ui.component.image

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.olimhousestudio.learnm3designsystemcomponentapp.R

@Composable
fun ImagePainterDemo(modifier: Modifier = Modifier) {
    Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "demo")
}