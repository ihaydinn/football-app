package com.ismailhakkiaydin.football.model.h2h


import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("team_id")
    var teamİd: Int,
    @SerializedName("team_name")
    var teamName: String,
    @SerializedName("team_logo")
    var teamLogo: String,
    @SerializedName("statistics")
    var statistics: Statistics
)