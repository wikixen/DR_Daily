package com.wikixen.drdaily

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wikixen.drdaily.data.sampleArticle
import com.wikixen.drdaily.ui.theme.DRDailyTheme
import com.wikixen.drdaily.views.ArticleScreen
import com.wikixen.drdaily.views.HomeScreen


object Routes {
    const val HOME_SCREEN = "HomeScreen"
    const val ARTICLE_SCREEN = "ArticleScreen"
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DRDailyTheme {
                val navController = rememberNavController()

                NavHost(
                    navController = navController,
                    startDestination = Routes.HOME_SCREEN
                ) {
                    composable(route = Routes.HOME_SCREEN){
                        HomeScreen(
                            navigateToArticle = {
                                navController.navigate(Routes.ARTICLE_SCREEN)
                            }
                        )
                    }
                    composable(route = Routes.ARTICLE_SCREEN) {
                        ArticleScreen(
                            article = sampleArticle,
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DRDailyTheme {
//        HomeScreen(
//            news = sampleNews
//        )
//        ArticleScreen(
//            article = sampleArticle
//        )
    }
}