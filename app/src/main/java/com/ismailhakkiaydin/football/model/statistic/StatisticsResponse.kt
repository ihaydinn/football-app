package com.ismailhakkiaydin.football.model.statistic


import com.google.gson.annotations.SerializedName
import com.ismailhakkiaydin.football.model.statistic.Api

data class StatisticsResponse(
    @SerializedName("api")
    var api: Api
)