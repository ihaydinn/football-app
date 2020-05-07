package com.ismailhakkiaydin.football.model.country


import com.google.gson.annotations.SerializedName

data class Api(
    @SerializedName("results")
    var results: Int,
    @SerializedName("countries")
    var countries: List<Country>
)