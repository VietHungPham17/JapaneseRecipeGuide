package com.example.japaneserecipeguide.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.japaneserecipeguide.ui.screen.DetailScreen
import com.example.japaneserecipeguide.ui.screen.HomeScreen
import com.example.japaneserecipeguide.ui.viewmodel.RecipeViewModel

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val viewModel: RecipeViewModel = viewModel()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(
                viewModel = viewModel,
                onRecipeClick = { id -> navController.navigate("detail/$id") }
            )
        }
        composable(
            route = "detail/{recipeId}",
            arguments = listOf(navArgument("recipeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val id = backStackEntry.arguments?.getInt("recipeId") ?: return@composable
            DetailScreen(
                recipeId = id,
                onBack = { navController.popBackStack() }
            )
        }
    }
}