package com.ismailhakkiaydin.football.ui.team

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ismailhakkiaydin.football.data.remote.ApiClient
import com.ismailhakkiaydin.football.model.team.Team
import com.ismailhakkiaydin.football.model.team.TeamResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class TeamViewModel : ViewModel() {

    private val apiClient = ApiClient()
    private val disposable = CompositeDisposable()

    val teamsList = MutableLiveData<List<Team>>()
    val loadingTeamList = MutableLiveData<Boolean>()

    fun getAllTeamsOfLeague(leagueId: Int){
        loadingTeamList.value = true
        disposable.add(apiClient.getAllTeamsOfLeague(leagueId)
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<TeamResponse>(){
                override fun onSuccess(t: TeamResponse) {
                    teamsList.value = t.api.teams
                    loadingTeamList.value = false
                }

                override fun onError(e: Throwable) {

                }

            })
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }

}
