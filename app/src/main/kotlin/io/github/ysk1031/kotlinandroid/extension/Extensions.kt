package io.github.ysk1031.kotlinandroid.extension

import android.content.Context
import android.widget.Toast

/**
 * Created by Yusuke on 2017/10/28.
 */

fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) =
        Toast.makeText(this, message, duration)
