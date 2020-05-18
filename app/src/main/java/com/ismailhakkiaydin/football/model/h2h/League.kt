package com.ismailhakkiaydin.football.model.h2h


import com.google.gson.annotations.SerializedName

data class League(
    @SerializedName("name")
    var name: String,
    @SerializedName("country")
    var country: String,
    @SerializedName("logo")
    var logo: String,
    @SerializedName("flag")
    var flag: String
)