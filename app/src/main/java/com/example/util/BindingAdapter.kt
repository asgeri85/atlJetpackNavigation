package com.example.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter


@BindingAdapter("load_image_resource")
fun loadImage(imageView: ImageView, imageResource: Int) {
    imageView.setImageResource(imageResource)
}

