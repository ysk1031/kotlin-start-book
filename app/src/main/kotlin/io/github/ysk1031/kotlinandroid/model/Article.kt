package io.github.ysk1031.kotlinandroid.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Yusuke on 2017/10/22.
 */

data class Article(val id: String,
                   val title: String,
                   val url: String,
                   val user: User): Parcelable {

    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readParcelable(User::class.java.classLoader))

    override fun writeToParcel(out: Parcel?, flags: Int) {
        out?.run {
            writeString(id)
            writeString(title)
            writeString(url)
            writeParcelable(user, flags)
        }
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<Article> {
        override fun createFromParcel(parcel: Parcel): Article = Article(parcel)

        override fun newArray(size: Int): Array<Article?> = arrayOfNulls(size)
    }
}
