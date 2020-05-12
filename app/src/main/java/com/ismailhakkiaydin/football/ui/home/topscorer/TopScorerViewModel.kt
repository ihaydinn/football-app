package com.ismailhakkiaydin.football.ui.home.topscorer

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ismailhakkiaydin.football.data.remote.ApiClient
import com.ismailhakkiaydin.football.model.topscorer.TopScorerResponse
import com.ismailhakkiaydin.football.model.topscorer.Topscorer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class TopScorerViewModel : ViewModel() {

    private val apiClient =  ApiClient()
    private val disposable = CompositeDisposable()

    val topScorerList = MutableLiveData<List<Topscorer>>()

    fun getTopScorers(leagueId: Int){
        disposable.add(
            apiClient.getTopScorers(leagueId)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<TopScorerResponse>(){
                    override fun onSuccess(t: TopScorerResponse) {
                        topScorerList.value = t.api.topscorers
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
