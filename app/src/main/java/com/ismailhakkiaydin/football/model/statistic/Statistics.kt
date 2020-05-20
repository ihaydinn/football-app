package com.ismailhakkiaydin.football.model.statistic


import com.google.gson.annotations.SerializedName

data class Statistics(
    @SerializedName("Shots on Goal")
    var shotsOnGoal: ShotsOnGoal,
    @SerializedName("Shots off Goal")
    var shotsOffGoal: ShotsOffGoal,
    @SerializedName("Total Shots")
    var totalShots: TotalShots,
    @SerializedName("Blocked Shots")
    var blockedShots: BlockedShots,
    @SerializedName("Shots insidebox")
    var shotsİnsidebox: Shotsİnsidebox,
    @SerializedName("Shots outsidebox")
    var shotsOutsidebox: ShotsOutsidebox,
    @SerializedName("Fouls")
    var fouls: Fouls,
    @SerializedName("Corner Kicks")
    var cornerKicks: CornerKicks,
    @SerializedName("Offsides")
    var offsides: Offsides,
    @SerializedName("Ball Possession")
    var ballPossession: BallPossession,
    @SerializedName("Yellow Cards")
    var yellowCards: YellowCards,
    @SerializedName("Red Cards")
    var redCards: RedCards,
    @SerializedName("Goalkeeper Saves")
    var goalkeeperSaves: GoalkeeperSaves,
    @SerializedName("Total passes")
    var totalPasses: TotalPasses,
    @SerializedName("Passes accurate")
    var passesAccurate: PassesAccurate,
    @SerializedName("Passes %")
    var passes: Passes
)