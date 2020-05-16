package com.ismailhakkiaydin.football.model.topscorer


import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Topscorer(
    @PrimaryKey(autoGenerate = true)
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
    @Embedded
    @SerializedName("games")
    var games: Games,
    @Embedded
    @SerializedName("goals")
    var goals: Goals,
    @SerializedName("shots")
    @Embedded
    var shots: Shots,
    @SerializedName("penalty")
    @Embedded
    var penalty: Penalty,
    @Embedded
    @SerializedName("cards")
    var cards: Cards
)