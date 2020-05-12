package com.ismailhakkiaydin.football.model.topscorer


import com.google.gson.annotations.SerializedName

data class Goals(
    @SerializedName("total")
    var total: Int,
    @SerializedName("assists")
    var assists: Int,
    @SerializedName("conceded")
    var conceded: Any
)