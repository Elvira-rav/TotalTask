package com.example.totatask.model.api

import com.example.totatask.model.database.Post
import retrofit2.Response
import retrofit2.http.GET

interface PostApi {
     @GET("posts")
    suspend fun getPosts(): Response<List<Post>>
}