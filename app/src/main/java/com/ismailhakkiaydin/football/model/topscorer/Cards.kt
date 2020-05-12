package com.ismailhakkiaydin.football.model.topscorer


import com.google.gson.annotations.SerializedName

data class Cards(
    @SerializedName("yellow")
    var yellow: Int,
    @SerializedName("second_yellow")
    var secondYellow: Int,
    @SerializedName("red")
    var red: Int
)