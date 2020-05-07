package com.ismailhakkiaydin.football.model.country


import com.google.gson.annotations.SerializedName

data class CountryResponse(
    @SerializedName("api")
    var api: Api
)