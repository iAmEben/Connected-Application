package com.iameben.connectedapplication.Interface

import com.iameben.connectedapplication.Model.Name
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {
    @GET("character")
    fun getNameList(): Call<MutableList<Name>>
}