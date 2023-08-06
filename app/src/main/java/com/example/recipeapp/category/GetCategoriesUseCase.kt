package com.example.recipeapp.category

import javax.inject.Inject


interface IGetCategoriesUseCase {
    operator fun invoke(): String
}

class GetCategoriesUseCase @Inject constructor(val repository: ICategoryRepository): IGetCategoriesUseCase {
    override fun invoke(): String {
        return repository.getAllCategories()
    }
}