package com.ismailhakkiaydin.football.model.leaguetable


import androidx.room.ColumnInfo
import com.google.gson.annotations.SerializedName

data class Away(
    @ColumnInfo(name = "played_away")
    @SerializedName("matchsPlayed")
    var matchsPlayed: Int,
    @ColumnInfo(name = "win_away")
    @SerializedName("win")
    var win: Int,
    @ColumnInfo(name = "draw_away")
    @SerializedName("draw")
    var draw: Int,
    @ColumnInfo(name = "lose_away")
    @SerializedName("lose")
    var lose: Int,
    @ColumnInfo(name = "goalsfor_away")
    @SerializedName("goalsFor")
    var goalsFor: Int,
    @ColumnInfo(name = "goalsagainst_away")
    @SerializedName("goalsAgainst")
    var goalsAgainst: Int
)