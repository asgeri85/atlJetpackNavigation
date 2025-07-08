package com.example.atlandroid2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    var name: String,
    var surname: String,
    var age: String,
    var email: String
) : Parcelable
