package com.wikixen.drdaily.network

import com.wikixen.drdaily.data.Article
import com.wikixen.drdaily.data.News
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.plugins.ClientRequestException
import io.ktor.client.plugins.RedirectResponseException
import io.ktor.client.plugins.ServerResponseException
import io.ktor.client.request.get

const val API_KEY = "77c3bde24a8f4fd180b76220d7e77d7a"
const val BASE_URL = "https://newsapi.org/v2/everything?q=dominican+republic&apiKey=$API_KEY"

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
}