package com.example.atlandroid2.model

data class TodoModel(
    val title: String,
    val oncelik: Oncelik
)

enum class Oncelik {
    LOW, MEDIUM, HIGH
}
