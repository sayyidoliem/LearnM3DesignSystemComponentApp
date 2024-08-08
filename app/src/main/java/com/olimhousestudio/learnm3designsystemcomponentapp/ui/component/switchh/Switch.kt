package com.olimhousestudio.learnm3designsystemcomponentapp.ui.component.switchh

import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SwitchDemo(modifier: Modifier = Modifier) {
    Switch(checked = false, onCheckedChange = {})
}