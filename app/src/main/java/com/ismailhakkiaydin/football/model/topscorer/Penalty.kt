package com.ismailhakkiaydin.football.model.topscorer


import com.google.gson.annotations.SerializedName

data class Penalty(
    @SerializedName("won")
    var won: Int,
    @SerializedName("commited")
    var commited: Any,
    @SerializedName("success")
    var success: Int,
    @SerializedName("missed")
    var missed: Int,
    @SerializedName("saved")
    var saved: Any
)