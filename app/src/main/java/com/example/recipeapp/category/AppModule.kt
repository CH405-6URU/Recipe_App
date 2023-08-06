package com.example.recipeapp.category

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Module
    @InstallIn(SingletonComponent::class)
    interface AppModuleInterface{
        // returns category repository when asked for the interface from the category repository class
        @Binds
        @Singleton
        fun provideCategoryRepository(repository: CategoryRepository): ICategoryRepository

        @Binds
        @Singleton
        fun provideCategoryUseCase(useCase: GetCategoriesUseCase) : IGetCategoriesUseCase
    }
}