package com.ismailhakkiaydin.football.model.leaguetable


import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class Home(
    @ColumnInfo(name = "played_home")
    @SerializedName("matchsPlayed")
    var matchsPlayed: Int,
    @ColumnInfo(name = "win_home")
    @SerializedName("win")
    var win: Int,
    @ColumnInfo(name = "draw_home")
    @SerializedName("draw")
    var draw: Int,
    @ColumnInfo(name = "lose_home")
    @SerializedName("lose")
    var lose: Int,
    @ColumnInfo(name = "goalsfor_home")
    @SerializedName("goalsFor")
    var goalsFor: Int,
    @ColumnInfo(name = "goalsagainst_home")
    @SerializedName("goalsAgainst")
    var goalsAgainst: Int
)