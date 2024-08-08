package com.olimhousestudio.learnm3designsystemcomponentapp.ui.component.searchbar

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarDemo(modifier: Modifier = Modifier) {
    SearchBar(query = "", onQueryChange = {}, onSearch = {}, active = false, onActiveChange = {}) {

    }
}