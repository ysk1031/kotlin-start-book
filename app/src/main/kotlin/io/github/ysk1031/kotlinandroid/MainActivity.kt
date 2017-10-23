package io.github.ysk1031.kotlinandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView
import io.github.ysk1031.kotlinandroid.model.Article
import io.github.ysk1031.kotlinandroid.model.User

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAdapter = ArticleListAdapter(context = this)
        val articles: List<Article> = listOf(
                dummyArticle(title = "Kotlin入門", userName = "Yusuke"),
                dummyArticle(title = "Java入門", userName = "Aono"))
        listAdapter.setArticles(articles)

        val listView: ListView = findViewById(R.id.list_view)
        listView.adapter = listAdapter
    }

    private fun dummyArticle(title: String, userName: String): Article =
            Article(id = "",
                    title = title,
                    url = "https://kotlinlang.org/",
                    user = User(id = "", name = userName, profileImageUrl = ""))
}
