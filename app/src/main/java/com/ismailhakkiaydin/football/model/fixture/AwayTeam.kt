package com.ismailhakkiaydin.football.model.fixture


import com.google.gson.annotations.SerializedName

data class AwayTeam(
    @SerializedName("team_id")
    var teamİd: Int,
    @SerializedName("team_name")
    var teamName: String,
    @SerializedName("logo")
    var logo: String
)