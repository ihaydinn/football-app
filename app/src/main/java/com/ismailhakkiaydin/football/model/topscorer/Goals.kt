package com.ismailhakkiaydin.football.model.topscorer


import androidx.room.ColumnInfo
import androidx.room.Embedded
import com.google.gson.annotations.SerializedName

data class Goals(@ColumnInfo(name = "toplam_gol")
    @SerializedName("total")
    var total: Int,
    @SerializedName("assists")
    var assists: Int
)