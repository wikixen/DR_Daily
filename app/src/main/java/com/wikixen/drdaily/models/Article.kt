package com.wikixen.drdaily.models

import kotlinx.serialization.Serializable

@Serializable
data class Article(
    val author: String?,
    val content: String?,
    val description: String?,
    val publishedAt: String?,
    val source: Source,
    val title: String?,
    val url: String?,
    val urlToImage: String?
) {

    fun matchSearchQuery(query: String): Boolean {
        val entries = listOf(
            author,
            title,
            source.name
        )

        return entries.any {
            it?.contains(query, ignoreCase = true) ?: it.isNullOrEmpty()
        }
    }
}
