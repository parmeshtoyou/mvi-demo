package com.example.mvidemo.data.repository

import com.example.mvidemo.data.api.ApiHelper

class MainRepository(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}