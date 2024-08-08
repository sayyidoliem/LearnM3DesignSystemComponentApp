package com.olimhousestudio.learnm3designsystemcomponentapp.ui.component.checkbox

import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CheckBoxDemo(modifier: Modifier = Modifier) {
    Checkbox(checked = false, onCheckedChange = {})
}