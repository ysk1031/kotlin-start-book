package io.github.ysk1031.kotlinandroid.client

import io.github.ysk1031.kotlinandroid.model.Article
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Yusuke on 2017/10/28.
 */
interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}
