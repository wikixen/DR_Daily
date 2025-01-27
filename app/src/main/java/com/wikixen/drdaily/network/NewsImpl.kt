package com.wikixen.drdaily.network

import com.wikixen.drdaily.BuildConfig
import com.wikixen.drdaily.models.Article
import com.wikixen.drdaily.models.News
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.RedirectResponseException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.get


class NewsImpl(private val client: HttpClient): NewsService {
    override suspend fun getArticles(): List<Article> {
        return try {
            client.get(BASE_URL).body<News>().articles
        } catch (e: RedirectResponseException) {
            println("Error: ${e.response.status.description}")
            emptyList()
        } catch (e: ClientRequestException) {
            println("Error: ${e.response.status.description}")
            emptyList()
        } catch (e: ServerResponseException) {
            println("Error: ${e.response.status.description}")
            emptyList()
        } catch (e: Exception) {
            println("Error: ${e.message}")
            emptyList()
        }
    }

    companion object {
        private const val API_KEY = BuildConfig.API_KEY
        const val BASE_URL = "https://newsapi.org/v2/everything?q=dominican+republic&apiKey=$API_KEY"
    }
}