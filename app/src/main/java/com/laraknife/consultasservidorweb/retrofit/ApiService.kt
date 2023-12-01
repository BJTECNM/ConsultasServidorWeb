package com.laraknife.consultasservidorweb.retrofit

import com.laraknife.consultasservidorweb.retrofit.data.Datos
import com.laraknife.consultasservidorweb.retrofit.data.ServerResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("servicios.php")
    suspend fun callServer(
        @Body post: Datos,
    ): Response<ServerResponse>
}