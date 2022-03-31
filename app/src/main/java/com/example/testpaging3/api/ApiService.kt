package com.example.testpaging3.api

import com.example.testpaging3.model.ResponseApi
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("character")
    suspend fun getAllCharacters(
       // @Query("count") size:Int,
        @Query("page") page: Int

    ): Response<ResponseApi>
}