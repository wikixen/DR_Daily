package com.wikixen.drdaily.network

import com.wikixen.drdaily.BuildConfig
import com.wikixen.drdaily.models.News
import retrofit2.http.GET

interface NewsAPIService {
    @GET(PATH_URL)
    suspend fun getNews(): News

    companion object{
        private const val API_KEY = BuildConfig.API_KEY
        const val PATH_URL = "v2/everything?q=dominican+republic&republica+dominicana&apiKey=$API_KEY"
    }
}