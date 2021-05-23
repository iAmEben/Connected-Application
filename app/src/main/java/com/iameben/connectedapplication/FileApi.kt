package com.iameben.connectedapplication

import retrofit2.http.GET

interface FileApi {
    @GET("/api/character")
    suspend fun getNames(): Names
}