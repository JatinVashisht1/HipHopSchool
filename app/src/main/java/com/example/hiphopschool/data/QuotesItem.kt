package com.example.hiphopschool.data


import com.google.gson.annotations.SerializedName

data class QuotesItem(
    @SerializedName("author")
    val author: String = "",
    @SerializedName("quote")
    val quote: String = ""
)