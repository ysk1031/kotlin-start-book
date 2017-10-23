package io.github.ysk1031.kotlinandroid

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import io.github.ysk1031.kotlinandroid.model.Article
import io.github.ysk1031.kotlinandroid.view.ArticleView

/**
 * Created by Yusuke on 2017/10/24.
 */
class ArticleListAdapter(private val context: Context): BaseAdapter() {

    private var articles: List<Article> = emptyList()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View =
        ((convertView as? ArticleView) ?: ArticleView(context)).apply { setArticle(article = articles[position]) }

    override fun getItem(p0: Int): Any = articles[p0]

    override fun getItemId(p0: Int): Long = 0

    override fun getCount(): Int = articles.size

    fun setArticles(articles: List<Article>) {
        this.articles = articles
    }
}
