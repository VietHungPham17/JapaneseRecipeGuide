package com.example.japaneserecipeguide.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.japaneserecipeguide.data.repository.RecipeRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(recipeId: Int, onBack: () -> Unit) {
    val recipe = RecipeRepository().getRecipeById(recipeId) ?: return

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(recipe.name) },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Quay lại")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier.padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                AsyncImage(
                    model = recipe.imageUrl,
                    contentDescription = recipe.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }
            item {
                Text(recipe.nameJp, fontSize = 22.sp, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    "${recipe.category.displayName}  •  ${recipe.difficulty.displayName}  •  ${recipe.prepTimeMinutes + recipe.cookTimeMinutes} phút  •  ${recipe.servings} người",
                    fontSize = 13.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(recipe.description, fontSize = 14.sp)
            }
            item {
                Text("Nguyên liệu", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            }
            itemsIndexed(recipe.ingredients) { _, ingredient ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(ingredient.name, fontSize = 14.sp)
                    Text(
                        ingredient.amount,
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Medium
                    )
                }
                HorizontalDivider(modifier = Modifier.padding(top = 6.dp))
            }
            item {
                Text("Các bước thực hiện", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            }
            itemsIndexed(recipe.steps) { index, step ->
                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.Top
                ) {
                    Surface(
                        color = MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(50)
                    ) {
                        Text(
                            text = "${index + 1}",
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontWeight = FontWeight.Bold,
                            fontSize = 13.sp,
                            modifier = Modifier.padding(horizontal = 10.dp, vertical = 4.dp)
                        )
                    }
                    Text(step, fontSize = 14.sp, modifier = Modifier.weight(1f))
                }
            }
        }
    }
}