package com.laraknife.consultasservidorweb.retrofit.data

import com.laraknife.consultasservidorweb.retrofit.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl(Constants.UrlServer)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getInstance(): ApiService {
        return retrofit.create(ApiService::class.java)
    }
}