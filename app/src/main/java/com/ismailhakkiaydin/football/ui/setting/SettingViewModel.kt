package com.ismailhakkiaydin.football.ui.setting

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ismailhakkiaydin.football.data.remote.ApiClient
import com.ismailhakkiaydin.football.model.country.Country
import com.ismailhakkiaydin.football.model.country.CountryResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class SettingViewModel : ViewModel() {

    private val apiClient = ApiClient()
    private val disposable = CompositeDisposable()

    val countriesList = MutableLiveData<List<Country>>()

    fun getAllCountries() {
        disposable.add(
            apiClient.getAllCountries()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<CountryResponse>() {
                    override fun onSuccess(t: CountryResponse) {
                        countriesList.value = t.api.countries
                        Log.i("SETTINGS : ", "Working ")
                    }

                    override fun onError(e: Throwable) {
                        Log.i("SETTINGS : ", "ERROR "+ e.message+ " "+e.printStackTrace())
                    }
                })
        )
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}