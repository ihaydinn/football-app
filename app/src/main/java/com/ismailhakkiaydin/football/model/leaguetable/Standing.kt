package com.ismailhakkiaydin.football.model.leaguetable


import com.google.gson.annotations.SerializedName

data class Standing(
    @SerializedName("rank")
    var rank: Int,
    @SerializedName("team_id")
    var teamİd: Int,
    @SerializedName("teamName")
    var teamName: String,
    @SerializedName("logo")
    var logo: String,
    @SerializedName("group")
    var group: String,
    @SerializedName("forme")
    var forme: String,
    @SerializedName("status")
    var status: String,
    @SerializedName("description")
    var description: String? = null,
    @SerializedName("all")
    var all: All,
    @SerializedName("home")
    var home: Home,
    @SerializedName("away")
    var away: Away,
    @SerializedName("goalsDiff")
    var goalsDiff: Int,
    @SerializedName("points")
    var points: Int,
    @SerializedName("lastUpdate")
    var lastUpdate: String
)