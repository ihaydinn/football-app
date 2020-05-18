package com.ismailhakkiaydin.football.model.h2h


import com.google.gson.annotations.SerializedName

data class Statistics(
    @SerializedName("played")
    var played: Played,
    @SerializedName("wins")
    var wins: Wins,
    @SerializedName("draws")
    var draws: Draws,
    @SerializedName("loses")
    var loses: Loses
)