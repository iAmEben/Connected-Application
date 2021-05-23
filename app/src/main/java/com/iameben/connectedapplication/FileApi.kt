package com.iameben.connectedapplication

import com.iameben.connectedapplication.Model.Names
import retrofit2.Call
import retrofit2.http.GET

interface FileApi {

    @get:GET("/api/character")

    val posts : Call<List<Names?>?>?
    companion object {
        const val BASE_URL = "https://rickandmortyapi.com/"
    }
}