package com.ismailhakkiaydin.football.model.statistic


import com.google.gson.annotations.SerializedName

data class BallPossession(
    @SerializedName("home")
    var home: String,
    @SerializedName("away")
    var away: String
)