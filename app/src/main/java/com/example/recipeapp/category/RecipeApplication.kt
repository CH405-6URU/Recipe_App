package com.example.recipeapp.category

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
// generates the dagger hilt dependency graph
class RecipeApplication: Application() {
}