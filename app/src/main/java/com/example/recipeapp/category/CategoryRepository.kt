package com.example.recipeapp.category

import javax.inject.Inject

// interface not necessary but is useful for testing and extension
interface ICategoryRepository {
    fun getAllCategories(): String
}

class CategoryRepository @Inject constructor() : ICategoryRepository {
    override fun getAllCategories(): String {
        return "Repository return"
    }
}