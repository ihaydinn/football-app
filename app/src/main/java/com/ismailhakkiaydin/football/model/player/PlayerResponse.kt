package com.ismailhakkiaydin.football.model.player


import com.google.gson.annotations.SerializedName

data class PlayerResponse(
    @SerializedName("api")
    var api: Api
)