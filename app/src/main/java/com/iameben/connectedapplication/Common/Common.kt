package com.iameben.connectedapplication.Common

import com.iameben.connectedapplication.Interface.RetrofitService
import com.iameben.connectedapplication.Retrofit.RetrofitClient
import retrofit2.create

object Common {
    private const val BASE_URL = "https://rickandmortyapi.com/api"

    val retrofitService: RetrofitService
    get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}