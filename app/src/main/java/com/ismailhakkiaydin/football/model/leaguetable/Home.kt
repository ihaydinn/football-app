package com.ismailhakkiaydin.football.model.leaguetable


import com.google.gson.annotations.SerializedName

data class Home(
    @SerializedName("matchsPlayed")
    var matchsPlayed: Int,
    @SerializedName("win")
    var win: Int,
    @SerializedName("draw")
    var draw: Int,
    @SerializedName("lose")
    var lose: Int,
    @SerializedName("goalsFor")
    var goalsFor: Int,
    @SerializedName("goalsAgainst")
    var goalsAgainst: Int
)