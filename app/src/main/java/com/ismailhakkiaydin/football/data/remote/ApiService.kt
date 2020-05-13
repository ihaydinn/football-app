package com.ismailhakkiaydin.football.data.remote

import com.ismailhakkiaydin.football.model.leaguetable.LeagueTableResponse
import com.ismailhakkiaydin.football.model.team.TeamResponse
import com.ismailhakkiaydin.football.model.topscorer.TopScorerResponse
import com.ismailhakkiaydin.football.util.Constant
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface ApiService {

    @Headers(Constant.API_KEY)
    @GET(Constant.GET_LEAGUE_TABLE)
    fun getLeagueTable(@Path("league_id") leagueId: Int): Single<LeagueTableResponse>

    @Headers(Constant.API_KEY)
    @GET(Constant.GET_TOP_SCORERS)
    fun getTopScorers(@Path("league_id") leagueId: Int): Single<TopScorerResponse>

    @Headers(Constant.API_KEY)
    @GET(Constant.GET_ALL_TEAMS_OF_LEAGUE)
    fun getAllTeamsOfLeague(@Path("league_id") leagueId: Int): Single<TeamResponse>

}