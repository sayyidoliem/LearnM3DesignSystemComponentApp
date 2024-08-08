package com.olimhousestudio.learnm3designsystemcomponentapp.ui.component.textfield

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun TextFieldDemo(modifier: Modifier = Modifier) {
    TextField(value = TextFieldValue(), onValueChange = {})
}