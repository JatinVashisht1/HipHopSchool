package com.example.hiphopschool.core

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T?) : Resource<T>(data = data, message = null)
    class Error<T>(message: String, data: T? ) : Resource<T>(data = data, message = message)
    class Loading<T>() : Resource<T>(data = null, message = null)
}