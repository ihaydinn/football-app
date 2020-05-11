package com.ismailhakkiaydin.football.data.remote

import com.ismailhakkiaydin.football.model.country.CountryResponse
import com.ismailhakkiaydin.football.model.league.LeagueResponse
import com.ismailhakkiaydin.football.model.leaguetable.LeagueTableResponse
import com.ismailhakkiaydin.football.util.Constant
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface ApiService {

    @Headers(Constant.API_KEY)
    @GET(Constant.GET_ALL_COUNTRIES)
    fun getAllCountries(): Single<LeagueResponse>

    @Headers(Constant.API_KEY)
    @GET(Constant.GET_LEAGUE_TABLE)
    fun getLeagueTable(@Path("league_id") leagueId: Int): Single<LeagueTableResponse>

}