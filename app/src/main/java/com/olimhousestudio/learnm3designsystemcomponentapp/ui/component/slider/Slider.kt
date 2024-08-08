package com.olimhousestudio.learnm3designsystemcomponentapp.ui.component.slider

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SliderDemo(modifier: Modifier = Modifier) {
    Slider(state = SliderState())
}