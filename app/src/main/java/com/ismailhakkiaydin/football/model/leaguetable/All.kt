package com.ismailhakkiaydin.football.model.leaguetable


import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class All(
    @ColumnInfo(name = "played_all")
    @SerializedName("matchsPlayed")
    var matchsPlayed: Int,
    @ColumnInfo(name = "win_all")
    @SerializedName("win")
    var win: Int,
    @ColumnInfo(name = "draw_all")
    @SerializedName("draw")
    var draw: Int,
    @ColumnInfo(name = "lose_all")
    @SerializedName("lose")
    var lose: Int,
    @ColumnInfo(name = "goals_all")
    @SerializedName("goalsFor")
    var goalsFor: Int,
    @ColumnInfo(name = "goalsagainst_all")
    @SerializedName("goalsAgainst")
    var goalsAgainst: Int
)