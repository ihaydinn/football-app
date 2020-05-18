package com.ismailhakkiaydin.football.model.h2h


import com.google.gson.annotations.SerializedName

data class Api(
    @SerializedName("teams")
    var teams: List<Team>,
    @SerializedName("results")
    var results: Int,
    @SerializedName("fixtures")
    var fixtures: List<Fixture>
)