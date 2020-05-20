package com.ismailhakkiaydin.football.data.remote

import com.ismailhakkiaydin.football.model.fixture.FixtureResponse
import com.ismailhakkiaydin.football.model.h2h.H2HResponse
import com.ismailhakkiaydin.football.model.leaguetable.LeagueTableResponse
import com.ismailhakkiaydin.football.model.player.PlayerResponse
import com.ismailhakkiaydin.football.model.statistic.StatisticsResponse
import com.ismailhakkiaydin.football.model.team.TeamResponse
import com.ismailhakkiaydin.football.model.topscorer.TopScorerResponse
import com.ismailhakkiaydin.football.model.transfer.TransferResponse
import com.ismailhakkiaydin.football.util.Constant
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory


class ApiClient {

    private val api = Retrofit.Builder()
        .baseUrl(Constant.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(ApiService::class.java)

    fun getLeagueTable(leagueId: Int):Single<LeagueTableResponse> = api.getLeagueTable(leagueId)
    fun getTopScorers(leagueId: Int):Single<TopScorerResponse> = api.getTopScorers(leagueId)
    fun getAllTeamsOfLeague(leagueId: Int):Single<TeamResponse> = api.getAllTeamsOfLeague(leagueId)
    fun getAllPlayersOfTeam(teamId: Int):Single<PlayerResponse> = api.getAllPlayersOfTeam(teamId)
    fun getAllTransfersOfTeam(teamId: Int):Single<TransferResponse> = api.getAllTransfersOfTeam(teamId)
    fun getAllFixtureOfLeague(leagueId: Int):Single<FixtureResponse> = api.getAllFixtureOfLeague(leagueId)
    fun getAllH2hItems(homeTeamId: Int, awayTeamId:Int):Single<H2HResponse> = api.getAllH2hItems(homeTeamId, awayTeamId)
    fun getFixtureStatistics(fixtureId:Int):Single<StatisticsResponse> = api.getFixtureStatistics(fixtureId)
}