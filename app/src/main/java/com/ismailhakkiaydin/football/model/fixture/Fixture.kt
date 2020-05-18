package com.ismailhakkiaydin.football.model.fixture


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class Fixture(
    @SerializedName("fixture_id")
    var fixtureİd: Int,
    @SerializedName("league_id")
    var leagueİd: Int,
    @SerializedName("league")
    var league: League,
    @SerializedName("event_date")
    var eventDate: String,
    @SerializedName("event_timestamp")
    var eventTimestamp: Int,
    @SerializedName("firstHalfStart")
    var firstHalfStart: Int,
    @SerializedName("secondHalfStart")
    var secondHalfStart: Int,
    @SerializedName("round")
    var round: String,
    @SerializedName("status")
    var status: String,
    @SerializedName("statusShort")
    var statusShort: String,
    @SerializedName("elapsed")
    var elapsed: Int,
    @SerializedName("venue")
    var venue: String,
    @SerializedName("referee")
    var referee: String,
    @SerializedName("homeTeam")
    var homeTeam: HomeTeam,
    @SerializedName("awayTeam")
    var awayTeam: AwayTeam,
    @SerializedName("goalsHomeTeam")
    var goalsHomeTeam: Int,
    @SerializedName("goalsAwayTeam")
    var goalsAwayTeam: Int,
    @SerializedName("score")
    var score: Score
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readInt(),
        TODO("league"),
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        TODO("homeTeam"),
        TODO("awayTeam"),
        parcel.readInt(),
        parcel.readInt(),
        TODO("score")
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(fixtureİd)
        parcel.writeInt(leagueİd)
        parcel.writeString(eventDate)
        parcel.writeInt(eventTimestamp)
        parcel.writeInt(firstHalfStart)
        parcel.writeInt(secondHalfStart)
        parcel.writeString(round)
        parcel.writeString(status)
        parcel.writeString(statusShort)
        parcel.writeInt(elapsed)
        parcel.writeString(venue)
        parcel.writeString(referee)
        parcel.writeInt(goalsHomeTeam)
        parcel.writeInt(goalsAwayTeam)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Fixture> {
        override fun createFromParcel(parcel: Parcel): Fixture {
            return Fixture(parcel)
        }

        override fun newArray(size: Int): Array<Fixture?> {
            return arrayOfNulls(size)
        }
    }
}