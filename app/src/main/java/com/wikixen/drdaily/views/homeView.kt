package com.wikixen.drdaily.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil3.compose.rememberAsyncImagePainter
import com.wikixen.drdaily.models.Article
import com.wikixen.drdaily.viewModels.SearchView


@Composable
fun HomeView(
    navigateToArticle: () -> Unit
) {
    val viewModel = viewModel<SearchView>()
    val searchText by viewModel.searchText.collectAsState()
    val articles by viewModel.articles.collectAsState()
    val isSearching by viewModel.isSearching.collectAsState()

    Column (
      modifier = Modifier
          .fillMaxSize()
          .windowInsetsPadding(WindowInsets.displayCutout)
          .windowInsetsPadding(WindowInsets.navigationBars)
    ) {
        TextField(
            value = searchText,
            onValueChange = viewModel::onSearchTextChange,
            placeholder = { Text(text = "Search")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedContainerColor = Color.White,
                cursorColor = Color.Black,
                unfocusedPlaceholderColor = Color.Black
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )
        if (isSearching) {
            Box(modifier = Modifier.fillMaxSize()) {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                if (articles?.isNotEmpty() == true) {
                    items(articles!!.size) {
                        NewsCard(
                            articles!![it],
                            navigateToArticle
                        )
                    }
                }
            }
        }
    }
}

// NewsCard takes an article from the NewsAPI and formats it into a clickable card
@Composable
fun NewsCard(
    article: Article,
    navigateToArticle: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(10.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        onClick = navigateToArticle,
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = rememberAsyncImagePainter(article.urlToImage),
                contentDescription = article.description,
                contentScale = ContentScale.Crop
            )
            Box (
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black),
                            startY = 100f
                        )
                    )
            )
            Box(
                contentAlignment = Alignment.BottomStart,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp, bottom = 5.dp)
            ) {
                Column {
                    Text(
                        text = article.title,
                        fontSize = 16.sp,
                        color = Color.White,
                        )
                    Text(
                        text = "By ${article.author}",
                        fontSize = 10.sp,
                        color = Color.White,
                        )
                }
            }
        }
    }
}