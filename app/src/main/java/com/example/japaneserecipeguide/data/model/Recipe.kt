package com.example.japaneserecipeguide.data.model

data class Recipe(
    val id: Int,
    val name: String,
    val nameJp: String,
    val category: Category,
    val difficulty: Difficulty,
    val prepTimeMinutes: Int,
    val cookTimeMinutes: Int,
    val servings: Int,
    val imageRes: Int,
    val description: String,
    val ingredients: List<Ingredient>,
    val steps: List<String>
)

data class Ingredient(
    val name: String,
    val amount: String
)

enum class Category(val displayName: String) {
    ALL("Tất cả"),
    SOUP("Canh & Súp"),
    MAIN("Món chính"),
    RICE("Cơm & Mì"),
    DESSERT("Tráng miệng")
}

enum class Difficulty(val displayName: String, val color: Long) {
    EASY("Dễ", 0xFF4CAF50),
    MEDIUM("Trung bình", 0xFFFF9800),
    HARD("Khó", 0xFFF44336)
}