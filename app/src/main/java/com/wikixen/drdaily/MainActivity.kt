package com.wikixen.drdaily

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.wikixen.drdaily.models.Article
import com.wikixen.drdaily.ui.theme.DRDailyTheme
import com.wikixen.drdaily.views.ArticleDetailScreen
import com.wikixen.drdaily.views.ArticleListScreen
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlin.reflect.typeOf


@Serializable
data object ArticleListRoute

@Serializable
data class ArticleDetailRoute(
    val article: Article
)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DRDailyTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = ArticleListRoute
                ) {
                    composable<ArticleListRoute>{
                        ArticleListScreen(
                            onArticleClick = { article ->
                                navController.navigate(
                                    ArticleDetailRoute(
                                        article = article
                                    )
                                )
                            }
                        )
                    }
                    composable<ArticleDetailRoute>(
                        typeMap = mapOf(
                            typeOf<Article>() to CustomNavTypes.ArticleType
                        )
                    ){
                        val arguments = it.toRoute<ArticleDetailRoute>()
                        ArticleDetailScreen(
                            article = arguments.article,
                            navigateToHome = {
                                navController.popBackStack()
                            }
                        )
                    }
                }
            }
        }
    }
}

object CustomNavTypes {
    val ArticleType = object : NavType<Article>(
        isNullableAllowed = false
    ) {
        override fun get(bundle: Bundle, key: String): Article? {
            return  Json.decodeFromString(bundle.getString(key) ?: return null)
        }

        override fun parseValue(value: String): Article {
            return Json.decodeFromString(Uri.decode(value))
        }

        override fun serializeAsValue(value: Article): String {
            return Uri.encode(Json.encodeToString(value))
        }

        override fun put(bundle: Bundle, key: String, value: Article) {
            bundle.putString(key, Json.encodeToString(value))
        }

    }
}