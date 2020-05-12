package com.ismailhakkiaydin.football.model.topscorer


import com.google.gson.annotations.SerializedName

data class Topscorer(
    @SerializedName("player_id")
    var playerİd: Int,
    @SerializedName("player_name")
    var playerName: String,
    @SerializedName("firstname")
    var firstname: String,
    @SerializedName("lastname")
    var lastname: String,
    @SerializedName("position")
    var position: String,
    @SerializedName("nationality")
    var nationality: String,
    @SerializedName("team_id")
    var teamİd: Int,
    @SerializedName("team_name")
    var teamName: String,
    @SerializedName("games")
    var games: Games,
    @SerializedName("goals")
    var goals: Goals,
    @SerializedName("shots")
    var shots: Shots,
    @SerializedName("penalty")
    var penalty: Penalty,
    @SerializedName("cards")
    var cards: Cards
)