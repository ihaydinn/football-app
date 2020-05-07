package com.ismailhakkiaydin.football.model.country


import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("country")
    var country: String,
    @SerializedName("code")
    var code: String,
    @SerializedName("flag")
    var flag: String
)