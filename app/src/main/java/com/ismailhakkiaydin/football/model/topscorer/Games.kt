package com.ismailhakkiaydin.football.model.topscorer


import com.google.gson.annotations.SerializedName

data class Games(
    @SerializedName("appearences")
    var appearences: Int,
    @SerializedName("minutes_played")
    var minutesPlayed: Int
)