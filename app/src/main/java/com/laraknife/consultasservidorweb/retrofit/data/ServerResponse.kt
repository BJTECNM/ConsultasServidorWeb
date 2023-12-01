package com.laraknife.consultasservidorweb.retrofit.data

import com.google.gson.annotations.SerializedName

data class ServerResponse(
    @SerializedName("resultado") val valor: String,
)
