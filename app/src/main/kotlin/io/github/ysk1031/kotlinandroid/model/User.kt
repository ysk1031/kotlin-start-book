package io.github.ysk1031.kotlinandroid.model

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by Yusuke on 2017/10/22.
 */

data class User(val id: String,
                val name: String,
                val profileImageUrl: String): Parcelable {

    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString())

    override fun writeToParcel(out: Parcel?, flags: Int) {
        out?.run {
            writeString(id)
            writeString(name)
            writeString(profileImageUrl)
        }
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User = User(parcel)

        override fun newArray(size: Int): Array<User?> = arrayOfNulls(size)
    }
}
