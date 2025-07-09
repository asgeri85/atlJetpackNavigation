package com.example.atlandroid2.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(
    val name: String,
    val age: String,
    val image: Int
): Parcelable
