package com.ismailhakkiaydin.football.model.transfer


import com.google.gson.annotations.SerializedName

data class Teamİn(
    @SerializedName("team_id")
    var teamİd: Int,
    @SerializedName("team_name")
    var teamName: String
)