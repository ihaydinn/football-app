package com.ismailhakkiaydin.football.model.topscorer


import androidx.room.Embedded
import com.google.gson.annotations.SerializedName

data class Penalty(
    @SerializedName("won")
    var won: Int,

    @SerializedName("success")
    var success: Int,
    @SerializedName("missed")
    var missed: Int

)