package com.wikixen.drdaily.models

import kotlinx.serialization.Serializable

@Serializable
data class News(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)
