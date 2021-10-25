package com.charlie.naversearch.retrofit

import retrofit2.Response
import retrofit2.http.GET

interface SearchAPI {
    @GET("local.json")
    suspend fun search(

    ): Response<String>
}