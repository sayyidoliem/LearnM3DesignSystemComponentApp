package com.olimhousestudio.learnm3designsystemcomponentapp.ui.component.textfield

import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue

@Composable
fun OutlinedTextField(modifier: Modifier = Modifier) {
    OutlinedTextField(value = TextFieldValue(), onValueChange = {})
}