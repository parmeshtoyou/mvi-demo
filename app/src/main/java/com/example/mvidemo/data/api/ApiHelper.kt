package com.example.mvidemo.data.api

import com.example.mvidemo.data.model.User

interface ApiHelper {
    suspend fun getUsers(): List<User>
}