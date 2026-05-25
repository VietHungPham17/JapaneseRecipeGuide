package com.example.japaneserecipeguide.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.japaneserecipeguide.data.model.Category
import com.example.japaneserecipeguide.data.model.Recipe
import com.example.japaneserecipeguide.data.repository.RecipeRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class RecipeUiState(
    val recipes: List<Recipe> = emptyList(),
    val searchQuery: String = "",
    val selectedCategory: Category = Category.ALL,
    val isLoading: Boolean = false
)

class RecipeViewModel(
    private val repository: RecipeRepository = RecipeRepository()
) : ViewModel() {

    private val _uiState = MutableStateFlow(RecipeUiState())
    val uiState: StateFlow<RecipeUiState> = _uiState.asStateFlow()

    init { loadRecipes() }

    private fun loadRecipes() {
        _uiState.update { state ->
            state.copy(
                recipes = repository.searchRecipes(
                    state.searchQuery, state.selectedCategory
                )
            )
        }
    }

    fun onSearchQueryChange(query: String) {
        _uiState.update { it.copy(searchQuery = query) }
        loadRecipes()
    }

    fun onCategorySelected(category: Category) {
        _uiState.update { it.copy(selectedCategory = category) }
        loadRecipes()
    }
}