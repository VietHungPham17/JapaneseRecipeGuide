package com.example.japaneserecipeguide.data.repository

import com.example.japaneserecipeguide.data.model.Category
import com.example.japaneserecipeguide.data.model.Recipe
import com.example.japaneserecipeguide.data.source.RecipeDataSource

class RecipeRepository {
    fun getAllRecipes(): List<Recipe> = RecipeDataSource.recipes

    fun getRecipeById(id: Int): Recipe? =
        RecipeDataSource.recipes.find { it.id == id }

    fun searchRecipes(query: String, category: Category): List<Recipe> {
        return RecipeDataSource.recipes.filter { recipe ->
            val matchesQuery = query.isBlank() ||
                    recipe.name.contains(query, ignoreCase = true) ||
                    recipe.nameJp.contains(query)
            val matchesCategory = category == Category.ALL ||
                    recipe.category == category
            matchesQuery && matchesCategory
        }
    }
}