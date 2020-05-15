package com.ismailhakkiaydin.football.model.player


import com.google.gson.annotations.SerializedName

data class Player(
    @SerializedName("player_id")
    var playerİd: Int,
    @SerializedName("player_name")
    var playerName: String,
    @SerializedName("firstname")
    var firstname: String,
    @SerializedName("lastname")
    var lastname: String,
    @SerializedName("number")
    var number: Any,
    @SerializedName("position")
    var position: String,
    @SerializedName("age")
    var age: Int,
    @SerializedName("birth_date")
    var birthDate: String,
    @SerializedName("birth_place")
    var birthPlace: String,
    @SerializedName("birth_country")
    var birthCountry: String,
    @SerializedName("nationality")
    var nationality: String,
    @SerializedName("height")
    var height: String,
    @SerializedName("weight")
    var weight: String
)