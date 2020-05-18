package com.ismailhakkiaydin.football.model.h2h


import com.google.gson.annotations.SerializedName

data class Score(
    @SerializedName("halftime")
    var halftime: String,
    @SerializedName("fulltime")
    var fulltime: String,
    @SerializedName("extratime")
    var extratime: Any,
    @SerializedName("penalty")
    var penalty: Any
)