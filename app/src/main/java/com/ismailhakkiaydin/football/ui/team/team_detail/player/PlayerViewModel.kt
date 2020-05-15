package com.ismailhakkiaydin.football.ui.team.team_detail.player

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ismailhakkiaydin.football.data.remote.ApiClient
import com.ismailhakkiaydin.football.model.player.Player
import com.ismailhakkiaydin.football.model.player.PlayerResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class PlayerViewModel: ViewModel() {

    private val apiClient = ApiClient()
    private val disposable = CompositeDisposable()

    val playerList = MutableLiveData<List<Player>>()
    val loadingPlayer = MutableLiveData<Boolean>()

    fun getAllPlayersOfTeam(teamId:Int){
        loadingPlayer.value = true
        disposable.add(
            apiClient.getAllPlayersOfTeam(teamId)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<PlayerResponse>(){
                    override fun onSuccess(t: PlayerResponse) {
                        playerList.value = t.api.players
                        loadingPlayer.value = false
                    }

                    override fun onError(e: Throwable) {
                        TODO("Not yet implemented")
                    }

                })
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}