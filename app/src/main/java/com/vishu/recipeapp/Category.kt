package com.vishu.recipeapp

data class Category(val idCategory :String,
    val strCategory : String,
    val strCategoryThumb : String,
    val strCategoryDescription :String
    )

data class CaterogriesResponse(val categories : List<Category>)