package io.github.ysk1031.kotlinandroid.model

/**
 * Created by Yusuke on 2017/10/22.
 */

data class Article(val id: String,
                   val title: String,
                   val url: String,
                   val user: User)
