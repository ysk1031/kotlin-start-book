package io.github.ysk1031.kotlinandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.ysk1031.kotlinandroid.model.Article
import io.github.ysk1031.kotlinandroid.model.User
import io.github.ysk1031.kotlinandroid.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        val articleView = ArticleView(this)
        val article = Article(
                id = "123",
                title = "Kotlin入門",
                url = "https://www.example.com/articles/123",
                user = User(id = "456", name = "Yusuke", profileImageUrl = ""))
        articleView.setArticle(article)

        setContentView(articleView)
    }
}
