package com.wikixen.drdaily.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wikixen.drdaily.models.Article
import com.wikixen.drdaily.network.RetroClient
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

// SearchView allows for the searching of articles
class SearchView: ViewModel() {

    private val _searchText = MutableStateFlow("")
    val searchText = _searchText.asStateFlow()

    private val _isSearching = MutableStateFlow(false)
    val isSearching = _isSearching.asStateFlow()

    private val _articleList: MutableStateFlow<List<Article>> = MutableStateFlow(value = emptyList())

    init {
        viewModelScope.launch {
            getNews()
        }
    }

//    private val _articleList= MutableStateFlow(sampleNews.articles)
    val articleList = searchText
        .onEach { _isSearching.update { true } }
        .combine(_articleList) { text, articles ->
            if (text.isBlank()){
                articles
            } else {
                articles.filter {
                    it.matchSearchQuery(text)
                }
            }
        }
        .onEach { _isSearching.update { false } }
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000),
            _articleList.value
        )
    fun onSearchTextChange(text: String) {
        _searchText.value = text
    }

    private suspend fun getNews() {
        _articleList.value = RetroClient.newsAPI.getNews().articles.toList()
    }
}