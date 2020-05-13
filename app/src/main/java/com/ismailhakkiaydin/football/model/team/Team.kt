package com.ismailhakkiaydin.football.model.team


import com.google.gson.annotations.SerializedName

data class Team(
    @SerializedName("team_id")
    var teamİd: Int,
    @SerializedName("name")
    var name: String,
    @SerializedName("code")
    var code: Any,
    @SerializedName("logo")
    var logo: String,
    @SerializedName("country")
    var country: String,
    @SerializedName("is_national")
    var isNational: Boolean,
    @SerializedName("founded")
    var founded: Int,
    @SerializedName("venue_name")
    var venueName: String,
    @SerializedName("venue_surface")
    var venueSurface: String,
    @SerializedName("venue_address")
    var venueAddress: String,
    @SerializedName("venue_city")
    var venueCity: String,
    @SerializedName("venue_capacity")
    var venueCapacity: Int
)