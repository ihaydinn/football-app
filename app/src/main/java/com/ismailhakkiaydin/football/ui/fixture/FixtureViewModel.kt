package com.ismailhakkiaydin.football.ui.fixture

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ismailhakkiaydin.football.data.remote.ApiClient
import com.ismailhakkiaydin.football.model.fixture.Fixture
import com.ismailhakkiaydin.football.model.fixture.FixtureResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class FixtureViewModel : ViewModel() {

    private val apiClient = ApiClient()
    private val disposable = CompositeDisposable()

    val fixtureList = MutableLiveData<List<Fixture>>()
    val loadinFixture = MutableLiveData<Boolean>()

    fun getAllFixtureOfLeague(leagueId: Int) {
        loadinFixture.value = true
        disposable.add(apiClient.getAllFixtureOfLeague(leagueId)
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableSingleObserver<FixtureResponse>() {
                override fun onSuccess(t: FixtureResponse) {
                    fixtureList.value = t.api.fixtures
                    loadinFixture.value = false
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