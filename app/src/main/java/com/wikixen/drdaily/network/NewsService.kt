package com.wikixen.drdaily.network

import com.wikixen.drdaily.data.Article
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json

interface NewsService {
    suspend fun getArticles(): List<Article>

    companion object {
        fun create(): NewsService {
            return NewsImpl(
                client = HttpClient(Android) {
                    install(ContentNegotiation) {
                        json()
                    }
                }
            )
        }
    }
}