package com.example.mvidemo.data.api

import com.example.mvidemo.data.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>
}