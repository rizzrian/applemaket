package com.example.applemaket

import android.media.Image
import android.os.Bundle
import android.os.Parcelable
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.parcelize.Parcelize

@Parcelize
data class MyItem(
    val no: Int,
    val imge: Int,
    val title: String,
    val comment: String,
    val seller: String,
    val price: Int,
    val address: String,
    val like: Int,
    val chat: Int
): Parcelable {}
