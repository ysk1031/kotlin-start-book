package io.github.ysk1031.kotlinandroid.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import io.github.ysk1031.kotlinandroid.R
import io.github.ysk1031.kotlinandroid.model.Article

/**
 * Created by Yusuke on 2017/10/22.
 */

class ArticleView @JvmOverloads constructor(context: Context,
                                            attrs: AttributeSet? = null,
                                            defStyleAttr: Int = 0) : RelativeLayout(context, attrs, defStyleAttr) {

    private val profileImageView: ImageView
    private val titleTextView: TextView
    private val userNameTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.view_article, this)
        profileImageView = findViewById(R.id.profile_image_view)
        titleTextView = findViewById(R.id.title_text_view)
        userNameTextView = findViewById(R.id.user_name_text_view)

        val padding: Int = (16 * context.resources.displayMetrics.density).toInt()
        this.setPadding(padding, padding, padding, padding)
    }

    fun setArticle(article: Article) {
        titleTextView.text = article.title
        userNameTextView.text = article.user.name
        Glide.with(context).load(article.user.profileImageUrl).into(profileImageView)
    }
}
