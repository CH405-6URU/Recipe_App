package com.example.recipeapp.category

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun CategoryScreen(viewModel: CategoryViewModel = hiltViewModel()){
    Column() {
        Text("Category")
        getFakeData().forEach(){
            Text(text = it)
        }
    }
}

fun getFakeData(): List<String>{
    val items = listOf(
        "Chicken",
        "lamb",
        "beef",
        "vegan"
    )
    return items
}