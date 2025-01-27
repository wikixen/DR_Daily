package com.wikixen.drdaily.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withLink
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.rememberAsyncImagePainter
import com.wikixen.drdaily.R
import com.wikixen.drdaily.models.Article


// ArticleView is the screen that is shown when an article is clicked
@Composable
fun ArticleView(
    article: Article,
    navigateToHome: () -> Unit
) {
    Column(
        modifier = Modifier
            .windowInsetsPadding(WindowInsets.displayCutout)
    ) {
        Column {
            TextButton (
                onClick = navigateToHome,
                content = {
                    Image(painter = painterResource(R.drawable.baseline_arrow_back_24), contentDescription = null)
                }
            )
            Image(
                painter = rememberAsyncImagePainter(article.urlToImage),
                contentDescription = article.description,
                contentScale = ContentScale.Fit,
            )
        }
        // Column below is for the text of the Article
        Column(modifier = Modifier
            .padding(horizontal = 40.dp, vertical = 20.dp)
        ) {
            Text(
                text = article.title,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = article.description,

                fontSize = 12.sp,
            )
            Text(
                text = "By ${article.author}",
                fontSize = 11.sp,
                fontStyle = FontStyle.Italic,
            )
            Text(
                text = article.publishedAt.split('T')[0] + " " + article.publishedAt.split('T')[1].substring(0,5)+" UTC",
                fontSize = 11.sp,
                fontStyle = FontStyle.Italic,
            )
            Text(
                text = article.content,
                fontSize = 12.sp,
                color = Color.Black
            )
            Text(
                buildAnnotatedString {
                    withLink(
                        LinkAnnotation.Url(
                            url = article.url,
                            TextLinkStyles(style = SpanStyle(
                                color = Color.Gray,
                                fontStyle = FontStyle.Italic,
                                fontSize = 12.sp)
                            )
                        )
                    ) {
                        append("Read the original article on ${article.source.name}")
                    }
                },
            )
        }
    }
}